package androidx.databinding;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends androidx.databinding.a {

    public class a extends e.a {
        public a() {
        }

        @Override // androidx.databinding.e.a
        public void a(e eVar, int i) {
            b.this.notifyChange();
        }
    }

    public b() {
    }

    public b(e... eVarArr) {
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (e eVar : eVarArr) {
            eVar.addOnPropertyChangedCallback(aVar);
        }
    }
}
