package xf1;

import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.location.UserDefinedProviderTypes;
import java.util.EnumSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xf1.o[], still in use, count: 1, list:
  (r0v1 xf1.o[]) from 0x0062: CONSTRUCTOR (r0v1 xf1.o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lxf1/o;", "", "", "surfacePk", "parentId", "labelResource", "sortOrder", "", "typeKey", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {
    TYPE_ALL(1, 0, R.string.lbl_surface_type_all, 1, TtmlNode.COMBINE_ALL),
    TYPE_PAVED(2, 1, R.string.lbl_surface_type_paved, 2, "paved"),
    TYPE_GRAVEL(6, 1, R.string.lbl_surface_type_gravel, 6, "gravel"),
    TYPE_DIRT(7, 1, R.string.lbl_surface_type_dirt, 7, "dirt"),
    TYPE_MIXED(10, 1, R.string.lbl_surface_type_mixed, 10, UserDefinedProviderTypes.MIXED);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray<o> f190704c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f190711j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f190712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190713b;

    static {
        f190711j = new w13.c(oVarArr);
        new a(null);
        f190704c = new SparseArray<>();
        Iterator it = EnumSet.allOf(o.class).iterator();
        it.getClass();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            f190704c.put(oVar.f190712a, oVar);
        }
    }

    private o(int i14, int i15, int i16, int i17, String str) {
        super(str, i);
        this.f190712a = i14;
        this.f190713b = i16;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f190710i.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxf1/o$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lxf1/o;", "lookupByPrimaryKey", "Landroid/util/SparseArray;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
