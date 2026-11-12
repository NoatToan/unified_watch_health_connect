package p006l2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import s5.w0;
import x5.c0;
import x5.k;
import x5.l0;
import x5.n;
import z2.h2;
import z2.s2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll2/x2;", "", "Ll2/b2;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lz2/h2;", "selectionManager", "Lx5/l0;", "value", "", "editable", "singleLine", "Lz2/s2;", "preparedSelectionState", "Lx5/c0;", "offsetMapping", "Ll2/s3;", "undoManager", "Ll2/j1;", "keyCombiner", "Ll2/t1;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Lx5/p;", "imeAction", "<init>", "(Ll2/b2;Lz2/h2;Lx5/l0;ZZLz2/s2;Lx5/c0;Ll2/s3;Ll2/j1;Ll2/t1;Le23/l;ILkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f108876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f108877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f108878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f108881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f108882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s3 f108883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1 f108884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1 f108885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l<l0, Unit> f108886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f108887l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108888a;

        static {
            int[] iArr = new int[s1.values().length];
            try {
                iArr[s1.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s1.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s1.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s1.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s1.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s1.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s1.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s1.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s1.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s1.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s1.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s1.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s1.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[s1.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[s1.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[s1.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[s1.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[s1.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[s1.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[s1.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[s1.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[s1.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[s1.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[s1.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[s1.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[s1.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[s1.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[s1.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[s1.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[s1.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[s1.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[s1.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[s1.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[s1.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[s1.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[s1.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[s1.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[s1.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[s1.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[s1.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[s1.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[s1.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[s1.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[s1.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[s1.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[s1.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[s1.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[s1.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[s1.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f108888a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x2(b2 b2Var, h2 h2Var, l0 l0Var, boolean z14, boolean z15, s2 s2Var, c0 c0Var, s3 s3Var, j1 j1Var, t1 t1Var, l lVar, int i14, int i15, j jVar) {
        c0 c0Var2;
        l0 l0Var2 = (i15 & 4) != 0 ? new l0((String) null, 0L, (w0) null, 7, (j) null) : l0Var;
        boolean z16 = (i15 & 8) != 0 ? true : z14;
        boolean z17 = (i15 & 16) != 0 ? false : z15;
        if ((i15 & 64) != 0) {
            c0.f188826a.getClass();
            c0Var2 = c0.a.f188828b;
        } else {
            c0Var2 = c0Var;
        }
        this(b2Var, h2Var, l0Var2, z16, z17, s2Var, c0Var2, (i15 & 128) != 0 ? null : s3Var, j1Var, (i15 & 512) != 0 ? w1.f108857a : t1Var, (i15 & 1024) != 0 ? new w2(2) : lVar, i14, null);
    }

    public final void a(List<? extends k> list) {
        x5.l lVar = this.f108876a.f108394d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new n());
        this.f108886k.invoke(lVar.a(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private x2(b2 b2Var, h2 h2Var, l0 l0Var, boolean z14, boolean z15, s2 s2Var, c0 c0Var, s3 s3Var, j1 j1Var, t1 t1Var, l<? super l0, Unit> lVar, int i14) {
        this.f108876a = b2Var;
        this.f108877b = h2Var;
        this.f108878c = l0Var;
        this.f108879d = z14;
        this.f108880e = z15;
        this.f108881f = s2Var;
        this.f108882g = c0Var;
        this.f108883h = s3Var;
        this.f108884i = j1Var;
        this.f108885j = t1Var;
        this.f108886k = lVar;
        this.f108887l = i14;
    }

    public /* synthetic */ x2(b2 b2Var, h2 h2Var, l0 l0Var, boolean z14, boolean z15, s2 s2Var, c0 c0Var, s3 s3Var, j1 j1Var, t1 t1Var, l lVar, int i14, j jVar) {
        this(b2Var, h2Var, l0Var, z14, z15, s2Var, c0Var, s3Var, j1Var, t1Var, lVar, i14);
    }
}
