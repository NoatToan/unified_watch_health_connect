package io.netty.util;

/* JADX INFO: loaded from: classes2.dex */
public interface AttributeMap {
    <T> Attribute<T> attr(AttributeKey<T> attributeKey);

    <T> boolean hasAttr(AttributeKey<T> attributeKey);
}
