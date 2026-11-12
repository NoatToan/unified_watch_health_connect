package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class tu5 implements fc8 {

    public class a implements ec8 {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(py6.a aVar, py6.a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    @Override // defpackage.fc8
    public ec8 get() {
        return new a();
    }
}
