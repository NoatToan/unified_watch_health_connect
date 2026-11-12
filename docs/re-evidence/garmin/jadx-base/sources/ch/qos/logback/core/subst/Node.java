package ch.qos.logback.core.subst;

import am.j;
import org.apache.commons.text.StringSubstitutor;
import sn.a;

/* JADX INFO: loaded from: classes7.dex */
public class Node {
    Object defaultPart;
    Node next;
    Object payload;
    Type type;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.Node$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Type {
        LITERAL,
        VARIABLE
    }

    public Node(Type type, Object obj, Object obj2) {
        this.type = type;
        this.payload = obj;
        this.defaultPart = obj2;
    }

    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        System.out.print(toString());
        System.out.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            System.out.print(" null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        if (this.type != node.type) {
            return false;
        }
        Object obj2 = this.payload;
        Object obj3 = node.payload;
        if (obj2 == null ? obj3 != null : !obj2.equals(obj3)) {
            return false;
        }
        Object obj4 = this.defaultPart;
        Object obj5 = node.defaultPart;
        if (obj4 == null ? obj5 != null : !obj4.equals(obj5)) {
            return false;
        }
        Node node2 = this.next;
        Node node3 = node.next;
        return node2 == null ? node3 == null : node2.equals(node3);
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.payload;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.defaultPart;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Node node = this.next;
        return iHashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void recursive(Node node, StringBuilder sb3) {
        while (node != null) {
            sb3.append(node.toString());
            sb3.append(" --> ");
            node = node.next;
        }
        sb3.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int i14 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[this.type.ordinal()];
        if (i14 == 1) {
            StringBuilder sb3 = new StringBuilder("Node{type=");
            sb3.append(this.type);
            sb3.append(", payload='");
            return j.k(this.payload, "'}", sb3);
        }
        if (i14 != 2) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        Object obj = this.defaultPart;
        if (obj != null) {
            recursive((Node) obj, sb5);
        }
        recursive((Node) this.payload, sb4);
        String string = "Node{type=" + this.type + ", payload='" + sb4.toString() + "'";
        if (this.defaultPart != null) {
            StringBuilder sbI = a.i(string, ", defaultPart=");
            sbI.append(sb5.toString());
            string = sbI.toString();
        }
        return string.concat(StringSubstitutor.DEFAULT_VAR_END);
    }

    public Node(Type type, Object obj) {
        this.type = type;
        this.payload = obj;
    }
}
