package com.fasterxml.jackson.databind.node;

import defpackage.aeg;
import defpackage.aeu;
import defpackage.aid;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public interface JsonNodeCreator {
    aeg arrayNode();

    aeg arrayNode(int i);

    ValueNode binaryNode(byte[] bArr);

    ValueNode binaryNode(byte[] bArr, int i, int i2);

    ValueNode booleanNode(boolean z);

    ValueNode nullNode();

    ValueNode numberNode(byte b2);

    ValueNode numberNode(double d);

    ValueNode numberNode(float f);

    ValueNode numberNode(int i);

    ValueNode numberNode(long j);

    ValueNode numberNode(Byte b2);

    ValueNode numberNode(Double d);

    ValueNode numberNode(Float f);

    ValueNode numberNode(Integer num);

    ValueNode numberNode(Long l);

    ValueNode numberNode(Short sh);

    ValueNode numberNode(BigDecimal bigDecimal);

    ValueNode numberNode(BigInteger bigInteger);

    ValueNode numberNode(short s);

    aeu objectNode();

    ValueNode pojoNode(Object obj);

    ValueNode rawValueNode(aid aidVar);

    ValueNode textNode(String str);
}
