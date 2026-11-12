package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import defpackage.aeu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class NodeCursor extends JsonStreamContext {
    protected String _currentName;
    protected Object _currentValue;
    protected final NodeCursor _parent;

    public abstract JsonNode currentNode();

    public abstract JsonToken nextToken();

    public abstract NodeCursor startArray();

    public abstract NodeCursor startObject();

    public NodeCursor(int i, NodeCursor nodeCursor) {
        this._type = i;
        this._index = -1;
        this._parent = nodeCursor;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final NodeCursor getParent() {
        return this._parent;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public final String getCurrentName() {
        return this._currentName;
    }

    public void overrideCurrentName(String str) {
        this._currentName = str;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public final NodeCursor iterateChildren() {
        JsonNode jsonNodeCurrentNode = currentNode();
        if (jsonNodeCurrentNode == null) {
            throw new IllegalStateException("No current node");
        }
        if (jsonNodeCurrentNode.isArray()) {
            return new a(jsonNodeCurrentNode, this);
        }
        if (jsonNodeCurrentNode.isObject()) {
            return new c(jsonNodeCurrentNode, this);
        }
        throw new IllegalStateException("Current node of type " + jsonNodeCurrentNode.getClass().getName());
    }

    public static final class e extends NodeCursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f4180a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected JsonNode f4181c;

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public void overrideCurrentName(String str) {
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        public e(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(0, nodeCursor);
            this.f4180a = false;
            this.f4181c = jsonNode;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (!this.f4180a) {
                this._index++;
                this.f4180a = true;
                return this.f4181c.asToken();
            }
            this.f4181c = null;
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            if (this.f4180a) {
                return this.f4181c;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startArray() {
            return new a(this.f4181c, this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startObject() {
            return new c(this.f4181c, this);
        }
    }

    protected static final class a extends NodeCursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Iterator<JsonNode> f4177a;
        protected JsonNode d;

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        public a(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(1, nodeCursor);
            this.f4177a = jsonNode.elements();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (!this.f4177a.hasNext()) {
                this.d = null;
                return JsonToken.END_ARRAY;
            }
            this._index++;
            JsonNode next = this.f4177a.next();
            this.d = next;
            return next.asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            return this.d;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startArray() {
            return new a(this.d, this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startObject() {
            return new c(this.d, this);
        }
    }

    protected static final class c extends NodeCursor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f4178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected Map.Entry<String, JsonNode> f4179c;
        protected Iterator<Map.Entry<String, JsonNode>> d;

        @Override // com.fasterxml.jackson.databind.node.NodeCursor, com.fasterxml.jackson.core.JsonStreamContext
        public /* bridge */ /* synthetic */ JsonStreamContext getParent() {
            return super.getParent();
        }

        public c(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(2, nodeCursor);
            this.d = ((aeu) jsonNode).fields();
            this.f4178b = true;
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonToken nextToken() {
            if (this.f4178b) {
                if (!this.d.hasNext()) {
                    this._currentName = null;
                    this.f4179c = null;
                    return JsonToken.END_OBJECT;
                }
                this._index++;
                this.f4178b = false;
                Map.Entry<String, JsonNode> next = this.d.next();
                this.f4179c = next;
                this._currentName = next != null ? next.getKey() : null;
                return JsonToken.FIELD_NAME;
            }
            this.f4178b = true;
            return this.f4179c.getValue().asToken();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public JsonNode currentNode() {
            Map.Entry<String, JsonNode> entry = this.f4179c;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startArray() {
            return new a(currentNode(), this);
        }

        @Override // com.fasterxml.jackson.databind.node.NodeCursor
        public NodeCursor startObject() {
            return new c(currentNode(), this);
        }
    }
}
