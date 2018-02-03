// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param extends
  *   Additional classes and traits to mix in to the base trait
  * @param companionExtends
  *   Additional classes and traits to mix in to the companion object.
  * @param type
  *   All instances of this enum will be converted to this type. An implicit TypeMapper
  *   must be present.
  */
@SerialVersionUID(0L)
final case class EnumOptions(
    `extends`: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    companionExtends: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty,
    `type`: scala.Option[_root_.scala.Predef.String] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[EnumOptions] with scalapb.lenses.Updatable[EnumOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      `extends`.foreach(`extends` => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, `extends`))
      companionExtends.foreach(companionExtends => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, companionExtends))
      if (`type`.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, `type`.get) }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      `extends`.foreach { __v =>
        _output__.writeString(1, __v)
      };
      companionExtends.foreach { __v =>
        _output__.writeString(2, __v)
      };
      `type`.foreach { __v =>
        _output__.writeString(3, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.EnumOptions = {
      val __extends = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.`extends`)
      val __companionExtends = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.companionExtends)
      var __type = this.`type`
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readString()
          case 18 =>
            __companionExtends += _input__.readString()
          case 26 =>
            __type = Option(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      scalapb.options.EnumOptions(
          `extends` = __extends.result(),
          companionExtends = __companionExtends.result(),
          `type` = __type
      )
    }
    def clearExtends = copy(`extends` = _root_.scala.collection.Seq.empty)
    def addExtends(__vs: _root_.scala.Predef.String*): EnumOptions = addAllExtends(__vs)
    def addAllExtends(__vs: TraversableOnce[_root_.scala.Predef.String]): EnumOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): EnumOptions = copy(`extends` = __v)
    def clearCompanionExtends = copy(companionExtends = _root_.scala.collection.Seq.empty)
    def addCompanionExtends(__vs: _root_.scala.Predef.String*): EnumOptions = addAllCompanionExtends(__vs)
    def addAllCompanionExtends(__vs: TraversableOnce[_root_.scala.Predef.String]): EnumOptions = copy(companionExtends = companionExtends ++ __vs)
    def withCompanionExtends(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): EnumOptions = copy(companionExtends = __v)
    def getType: _root_.scala.Predef.String = `type`.getOrElse("")
    def clearType: EnumOptions = copy(`type` = None)
    def withType(__v: _root_.scala.Predef.String): EnumOptions = copy(`type` = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
        case 2 => companionExtends
        case 3 => `type`.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 2 => _root_.scalapb.descriptors.PRepeated(companionExtends.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
        case 3 => `type`.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.EnumOptions
}

object EnumOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.EnumOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.EnumOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): scalapb.options.EnumOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scalapb.options.EnumOptions(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.EnumOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.EnumOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.EnumOptions(
  )
  implicit class EnumOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.EnumOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.EnumOptions](_l) {
    def `extends`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
    def companionExtends: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.companionExtends)((c_, f_) => c_.copy(companionExtends = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getType)((c_, f_) => c_.copy(`type` = Option(f_)))
    def optionalType: _root_.scalapb.lenses.Lens[UpperPB, scala.Option[_root_.scala.Predef.String]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  final val COMPANION_EXTENDS_FIELD_NUMBER = 2
  final val TYPE_FIELD_NUMBER = 3
}
