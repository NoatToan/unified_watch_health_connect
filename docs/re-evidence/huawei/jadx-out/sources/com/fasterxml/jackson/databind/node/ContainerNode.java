package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import defpackage.aee;
import defpackage.aef;
import defpackage.aeg;
import defpackage.aer;
import defpackage.aes;
import defpackage.aeu;
import defpackage.aex;
import defpackage.aid;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode implements JsonNodeCreator {
    private static final long serialVersionUID = 1;
    protected final aes _nodeFactory;

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonToken asToken();

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode get(int i);

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode get(String str);

    public abstract T removeAll();

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public abstract int size();

    public ContainerNode(aes aesVar) {
        this._nodeFactory = aesVar;
    }

    protected ContainerNode() {
        this._nodeFactory = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aef booleanNode(boolean z) {
        return this._nodeFactory.booleanNode(z);
    }

    public JsonNode missingNode() {
        return this._nodeFactory.a();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aer nullNode() {
        return this._nodeFactory.nullNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aeg arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aeg arrayNode(int i) {
        return this._nodeFactory.arrayNode(i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aeu objectNode() {
        return this._nodeFactory.objectNode();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(byte b2) {
        return this._nodeFactory.numberNode(b2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(short s) {
        return this._nodeFactory.numberNode(s);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(int i) {
        return this._nodeFactory.numberNode(i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(long j) {
        return this._nodeFactory.numberNode(j);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(float f) {
        return this._nodeFactory.numberNode(f);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final NumericNode numberNode(double d) {
        return this._nodeFactory.numberNode(d);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Byte b2) {
        return this._nodeFactory.numberNode(b2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Short sh) {
        return this._nodeFactory.numberNode(sh);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Long l) {
        return this._nodeFactory.numberNode(l);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Float f) {
        return this._nodeFactory.numberNode(f);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode numberNode(Double d) {
        return this._nodeFactory.numberNode(d);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aex textNode(String str) {
        return this._nodeFactory.textNode(str);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aee binaryNode(byte[] bArr) {
        return this._nodeFactory.binaryNode(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final aee binaryNode(byte[] bArr, int i, int i2) {
        return this._nodeFactory.binaryNode(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public final ValueNode rawValueNode(aid aidVar) {
        return this._nodeFactory.rawValueNode(aidVar);
    }
}
