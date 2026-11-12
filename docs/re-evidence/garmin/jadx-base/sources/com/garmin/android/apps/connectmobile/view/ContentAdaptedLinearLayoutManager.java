package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import fb1.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/ContentAdaptedLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", ModelSourceWrapper.ORIENTATION, "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContentAdaptedLinearLayoutManager extends LinearLayoutManager {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/ContentAdaptedLinearLayoutManager$a;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/ContentAdaptedLinearLayoutManager;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47395b;

        public a(ContentAdaptedLinearLayoutManager contentAdaptedLinearLayoutManager) {
        }
    }

    static {
        new b(null);
    }

    public ContentAdaptedLinearLayoutManager(Context context, int i14, boolean z14) {
        super(context, i14, z14);
    }

    public final void a(RecyclerView.w wVar, int i14, int i15, int i16, a aVar) {
        try {
            View viewE = wVar.e(i14);
            viewE.getClass();
            ViewGroup.LayoutParams layoutParams = viewE.getLayoutParams();
            layoutParams.getClass();
            RecyclerView.q qVar = (RecyclerView.q) layoutParams;
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            viewE.measure(RecyclerView.p.getChildMeasureSpec(i15, paddingRight + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally()), RecyclerView.p.getChildMeasureSpec(i16, paddingBottom + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically()));
            aVar.f47394a = getDecoratedMeasuredWidth(viewE) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            aVar.f47395b = getDecoratedMeasuredHeight(viewE) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + ((ViewGroup.MarginLayoutParams) qVar).topMargin;
        } catch (IndexOutOfBoundsException e4) {
            String strN = c.n("LinearLayoutManager doesn't work well with animations. Consider switching them off:", e4.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var, "LinearLayoutManager", strN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onMeasure(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i14, int i15) {
        int i16;
        int i17;
        int paddingRight;
        int paddingBottom;
        a aVar;
        int i18;
        ContentAdaptedLinearLayoutManager contentAdaptedLinearLayoutManager = this;
        wVar.getClass();
        b0Var.getClass();
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        boolean z14 = mode != 0;
        boolean z15 = mode2 != 0;
        boolean z16 = mode == 1073741824;
        boolean z17 = mode2 == 1073741824;
        if (z16 && z17) {
            super.onMeasure(wVar, b0Var, i14, i15);
            return;
        }
        boolean z18 = contentAdaptedLinearLayoutManager.getOrientation() == 1;
        a aVar2 = new a(contentAdaptedLinearLayoutManager);
        if (aVar2.f47394a == 0 && aVar2.f47395b == 0) {
            if (z18) {
                aVar2.f47394a = size;
                aVar2.f47395b = 100;
            } else {
                aVar2.f47394a = 100;
                aVar2.f47395b = size2;
            }
        }
        wVar.b();
        int iB = b0Var.b();
        int itemCount = contentAdaptedLinearLayoutManager.getItemCount();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i19 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            if (i19 < itemCount) {
                if (!z18) {
                    aVar = aVar2;
                    int i26 = size2;
                    i16 = size;
                    i18 = iMakeMeasureSpec;
                    i17 = i26;
                    contentAdaptedLinearLayoutManager = this;
                    if (i19 < iB) {
                        contentAdaptedLinearLayoutManager.a(wVar, i19, i18, i17, aVar);
                    }
                    i24 += aVar.f47394a;
                    if (i19 == 0) {
                        i25 = aVar.f47395b;
                    }
                    if (z14 && i24 >= i16) {
                        break;
                    }
                } else {
                    aVar = aVar2;
                    if (i19 < iB) {
                        contentAdaptedLinearLayoutManager.a(wVar, i19, size, iMakeMeasureSpec, aVar);
                    }
                    i25 += aVar.f47395b;
                    if (i19 == 0) {
                        i24 = aVar.f47394a;
                    }
                    if (!z15 || i25 < size2) {
                        int i27 = size2;
                        i16 = size;
                        i18 = iMakeMeasureSpec;
                        i17 = i27;
                        contentAdaptedLinearLayoutManager = this;
                    } else {
                        contentAdaptedLinearLayoutManager = this;
                    }
                }
                i19++;
                int i28 = i17;
                iMakeMeasureSpec = i18;
                size = i16;
                size2 = i28;
                aVar2 = aVar;
            }
            i17 = size2;
            i16 = size;
            break;
        }
        if (z16) {
            paddingRight = i16;
        } else {
            paddingRight = contentAdaptedLinearLayoutManager.getPaddingRight() + contentAdaptedLinearLayoutManager.getPaddingLeft() + i24;
            if (z14) {
                paddingRight = (int) Math.min(paddingRight, i16);
            }
        }
        if (z17) {
            paddingBottom = i17;
        } else {
            paddingBottom = contentAdaptedLinearLayoutManager.getPaddingBottom() + contentAdaptedLinearLayoutManager.getPaddingTop() + i25;
            if (z15) {
                paddingBottom = (int) Math.min(paddingBottom, i17);
            }
        }
        contentAdaptedLinearLayoutManager.setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/ContentAdaptedLinearLayoutManager$b;", "", "<init>", "()V", "", "DEFAULT_SIZE", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
