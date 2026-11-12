package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface EnumOrBuilder extends MessageOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    EnumValue getEnumvalue(int i14);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    EnumValueOrBuilder getEnumvalueOrBuilder(int i14);

    List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList();

    String getName();

    ByteString getNameBytes();

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
