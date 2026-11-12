package xf1;

import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.EnumSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xf1.e[], still in use, count: 1, list:
  (r0v1 xf1.e[]) from 0x007a: CONSTRUCTOR (r0v1 xf1.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lxf1/e;", "", "", "classificationPk", "parentId", "labelResource", "sortOrder", "", "typeKey", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    TYPE_ALL(1, 0, R.string.lbl_surface_type_all, 1, TtmlNode.COMBINE_ALL),
    TYPE_SPRINT(2, 1, R.string.lbl_segment_classification_sprint, 2, "sprint"),
    TYPE_HILL_CLIMB(8, 1, R.string.lbl_segment_classification_hill_climb, 8, "hill_climb"),
    TYPE_HILLS(11, 1, R.string.lbl_segment_classification_hills, 11, "hills"),
    TYPE_DOWNHILL(12, 1, R.string.lbl_segment_classification_downhill, 12, "downhill"),
    TYPE_OTHER(13, 1, R.string.lbl_segment_classification_other, 13, "other");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f190666c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseArray<e> f190667d = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w13.c f190675l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f190676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190677b;

    static {
        f190675l = new w13.c(new e[]{r0, r1, r2, r3, r4, r5});
        Iterator it = EnumSet.allOf(e.class).iterator();
        it.getClass();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            f190667d.put(eVar.f190676a, eVar);
        }
    }

    private e(int i14, int i15, int i16, int i17, String str) {
        super(str, i);
        this.f190676a = i14;
        this.f190677b = i16;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f190674k.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxf1/e$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lxf1/e;", "lookupByPrimaryKey", "Landroid/util/SparseArray;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
