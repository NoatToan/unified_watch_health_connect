package com.huawei.ui.device.declaration.xmlparser.parser;

import defpackage.rbn;
import defpackage.rbo;
import defpackage.rbq;
import defpackage.rbr;
import defpackage.rbx;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseDeclarationParser implements XmlParser<rbq> {
    protected abstract void parseConfig(rbn rbnVar);

    protected abstract rbo parseContent();

    protected abstract rbq parseDeclaration();

    protected abstract rbx parsePart();

    protected abstract void parsePlaceholder(rbn rbnVar);

    protected abstract void parseString(rbn rbnVar);

    protected abstract rbr parseTitle();
}
