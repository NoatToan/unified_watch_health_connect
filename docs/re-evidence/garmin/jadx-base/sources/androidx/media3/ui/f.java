package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import fa.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kc.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.ui.a f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<ea.a> f10119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kc.a f10120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10122f;

    public class a extends WebView {
        public a(f fVar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10123a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f10123a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10123a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10123a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10119c = Collections.EMPTY_LIST;
        this.f10120d = kc.a.f103841g;
        this.f10121e = 0.0533f;
        this.f10122f = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, attributeSet);
        this.f10117a = aVar;
        a aVar2 = new a(this, context, attributeSet);
        this.f10118b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, kc.a aVar, float f14, float f15) {
        this.f10120d = aVar;
        this.f10121e = f14;
        this.f10122f = f15;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            ea.a aVar2 = (ea.a) list.get(i14);
            if (aVar2.f63554d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f10119c.isEmpty() || !arrayList2.isEmpty()) {
            this.f10119c = arrayList2;
            c();
        }
        this.f10117a.a(arrayList, aVar, f14, f15);
        invalidate();
    }

    public final String b(int i14, float f14) {
        float fB = j.b(i14, f14, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i15 = z.f70071a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0231  */
    /* JADX WARN: Code duplicated, block: B:102:0x0248  */
    /* JADX WARN: Code duplicated, block: B:104:0x024e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0263  */
    /* JADX WARN: Code duplicated, block: B:107:0x027f A[LOOP:2: B:106:0x027d->B:107:0x027f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a2 A[LOOP:3: B:109:0x029c->B:111:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0301  */
    /* JADX WARN: Code duplicated, block: B:117:0x030f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0315  */
    /* JADX WARN: Code duplicated, block: B:121:0x0334  */
    /* JADX WARN: Code duplicated, block: B:123:0x033a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0352  */
    /* JADX WARN: Code duplicated, block: B:127:0x0358  */
    /* JADX WARN: Code duplicated, block: B:128:0x035b  */
    /* JADX WARN: Code duplicated, block: B:130:0x035f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0368  */
    /* JADX WARN: Code duplicated, block: B:133:0x036e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0388  */
    /* JADX WARN: Code duplicated, block: B:137:0x038c  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0400  */
    /* JADX WARN: Code duplicated, block: B:167:0x0404  */
    /* JADX WARN: Code duplicated, block: B:168:0x0408  */
    /* JADX WARN: Code duplicated, block: B:170:0x040c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0410  */
    /* JADX WARN: Code duplicated, block: B:173:0x0414  */
    /* JADX WARN: Code duplicated, block: B:175:0x0425  */
    /* JADX WARN: Code duplicated, block: B:178:0x0429  */
    /* JADX WARN: Code duplicated, block: B:179:0x042f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0437  */
    /* JADX WARN: Code duplicated, block: B:183:0x043a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x043c  */
    /* JADX WARN: Code duplicated, block: B:186:0x043f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0443  */
    /* JADX WARN: Code duplicated, block: B:188:0x0449  */
    /* JADX WARN: Code duplicated, block: B:189:0x044f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:193:0x0463  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:209:0x0492  */
    /* JADX WARN: Code duplicated, block: B:216:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:239:0x0500  */
    /* JADX WARN: Code duplicated, block: B:241:0x0518  */
    /* JADX WARN: Code duplicated, block: B:244:0x052d  */
    /* JADX WARN: Code duplicated, block: B:250:0x055e  */
    /* JADX WARN: Code duplicated, block: B:253:0x058a A[LOOP:6: B:251:0x0584->B:253:0x058a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x05a5 A[LOOP:7: B:255:0x059f->B:257:0x05a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:263:0x05df  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:269:0x0600  */
    /* JADX WARN: Code duplicated, block: B:273:0x061b  */
    /* JADX WARN: Code duplicated, block: B:275:0x061e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0625  */
    /* JADX WARN: Code duplicated, block: B:282:0x0640  */
    /* JADX WARN: Code duplicated, block: B:285:0x065d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0668  */
    /* JADX WARN: Code duplicated, block: B:289:0x066b  */
    /* JADX WARN: Code duplicated, block: B:290:0x066e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0671  */
    /* JADX WARN: Code duplicated, block: B:293:0x068f  */
    /* JADX WARN: Code duplicated, block: B:311:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x02a2, please report this as an issue */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.media3.ui.d.b.<init>(java.lang.String, java.util.Map, androidx.media3.ui.d$a):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.f.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        if (!z14 || this.f10119c.isEmpty()) {
            return;
        }
        c();
    }

    public f(Context context) {
        this(context, null);
    }
}
