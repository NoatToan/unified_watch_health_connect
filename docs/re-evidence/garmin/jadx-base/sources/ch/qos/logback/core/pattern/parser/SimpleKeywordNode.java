package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleKeywordNode extends FormattingNode {
    List<String> optionList;

    public SimpleKeywordNode(Object obj) {
        super(1, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof SimpleKeywordNode)) {
            return false;
        }
        List<String> list = this.optionList;
        List<String> list2 = ((SimpleKeywordNode) obj).optionList;
        if (list != null) {
            return list.equals(list2);
        }
        return list2 == null;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sb3;
        Object obj;
        StringBuilder sb4 = new StringBuilder();
        List<String> list = this.optionList;
        Object obj2 = this.value;
        if (list == null) {
            sb3 = new StringBuilder("KeyWord(");
            sb3.append(obj2);
            sb3.append(",");
            obj = this.formatInfo;
        } else {
            sb3 = new StringBuilder("KeyWord(");
            sb3.append(obj2);
            sb3.append(", ");
            sb3.append(this.formatInfo);
            sb3.append(",");
            obj = this.optionList;
        }
        sb3.append(obj);
        sb3.append(")");
        sb4.append(sb3.toString());
        sb4.append(printNext());
        return sb4.toString();
    }

    public SimpleKeywordNode(int i14, Object obj) {
        super(i14, obj);
    }
}
