package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ApiOrBuilder extends MessageOrBuilder {
    Method getMethods(int i14);

    int getMethodsCount();

    List<Method> getMethodsList();

    MethodOrBuilder getMethodsOrBuilder(int i14);

    List<? extends MethodOrBuilder> getMethodsOrBuilderList();

    Mixin getMixins(int i14);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    MixinOrBuilder getMixinsOrBuilder(int i14);

    List<? extends MixinOrBuilder> getMixinsOrBuilderList();

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

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}
