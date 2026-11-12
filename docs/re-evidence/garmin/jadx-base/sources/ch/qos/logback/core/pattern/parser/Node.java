package ch.qos.logback.core.pattern.parser;

/* JADX INFO: loaded from: classes7.dex */
public class Node {
    static final int COMPOSITE_KEYWORD = 2;
    static final int LITERAL = 0;
    static final int SIMPLE_KEYWORD = 1;
    Node next;
    final int type;
    final Object value;

    public Node(int i14, Object obj) {
        this.type = i14;
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Node)) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type == node.type) {
            Object obj2 = this.value;
            Object obj3 = node.value;
            if (obj2 == null ? obj3 == null : obj2.equals(obj3)) {
                Node node2 = this.next;
                Node node3 = node.next;
                if (node2 == null ? node3 == null : node2.equals(node3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Node getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i14 = this.type * 31;
        Object obj = this.value;
        return i14 + (obj != null ? obj.hashCode() : 0);
    }

    public String printNext() {
        if (this.next == null) {
            return "";
        }
        return " -> " + this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.type != 0) {
            string = super.toString();
        } else {
            string = "LITERAL(" + this.value + ")";
        }
        stringBuffer.append(string);
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }

    public Node(int i14) {
        this(i14, null);
    }
}
