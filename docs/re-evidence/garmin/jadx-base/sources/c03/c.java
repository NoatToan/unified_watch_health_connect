package c03;

import android.database.Cursor;
import e23.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc03/c;", "Lvd/f;", "Lc03/g;", "", "sql", "Lvd/c;", "database", "", "argCount", "<init>", "(Ljava/lang/String;Lvd/c;I)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements vd.f, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd.c f22413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f22414c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvd/e;", "it", "", "<anonymous>", "(Lvd/e;)V"}, k = 3, mv = {1, 5, 1})
    public static final class a extends w implements l<vd.e, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f22416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i14) {
            super(1);
            this.f22415a = str;
            this.f22416b = i14;
        }

        @Override // e23.l
        public final Unit invoke(vd.e eVar) {
            vd.e eVar2 = eVar;
            eVar2.getClass();
            String str = this.f22415a;
            int i14 = this.f22416b;
            if (str == null) {
                eVar2.u(i14);
            } else {
                eVar2.r(i14, str);
            }
            return Unit.INSTANCE;
        }
    }

    public c(String str, vd.c cVar, int i14) {
        str.getClass();
        cVar.getClass();
        this.f22412a = str;
        this.f22413b = cVar;
        this.f22414c = new LinkedHashMap();
    }

    @Override // vd.f
    public final void a(vd.e eVar) {
        Iterator it = this.f22414c.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(eVar);
        }
    }

    @Override // c03.g
    public final d03.c b() {
        Cursor cursorJ1 = this.f22413b.J1(this);
        cursorJ1.getClass();
        return new c03.a(cursorJ1);
    }

    @Override // vd.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF22412a() {
        return this.f22412a;
    }

    @Override // c03.g
    public final void close() {
    }

    @Override // c03.g
    public final void execute() {
        throw new UnsupportedOperationException();
    }

    @Override // d03.g
    public final void r(int i14, String str) {
        this.f22414c.put(Integer.valueOf(i14), new a(str, i14));
    }

    public final String toString() {
        return this.f22412a;
    }
}
