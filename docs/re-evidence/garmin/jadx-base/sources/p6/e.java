package p6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public e(char[] cArr) {
        super(cArr);
    }

    @Override // p6.c, p6.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || b().equals(((e) obj).b())) {
            return super.equals(obj);
        }
        return false;
    }
}
