package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeOrBuilder extends MessageOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i14);

    int getFieldsCount();

    List<Field> getFieldsList();

    FieldOrBuilder getFieldsOrBuilder(int i14);

    List<? extends FieldOrBuilder> getFieldsOrBuilderList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i14);

    ByteString getOneofsBytes(int i14);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i14);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i14);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();

    SourceContext getSourceContext();

    SourceContextOrBuilder getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
