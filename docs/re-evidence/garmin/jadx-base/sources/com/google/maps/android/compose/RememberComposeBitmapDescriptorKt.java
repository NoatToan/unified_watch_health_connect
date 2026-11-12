package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w0;
import p3.p1;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "", UserMetadata.KEYDATA_FILENAME, "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "rememberComposeBitmapDescriptor", "([Ljava/lang/Object;Le23/p;Lp3/m;I)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "Landroid/view/ViewGroup;", "parent", "Lp3/p;", "compositionContext", "renderComposableToBitmapDescriptor", "(Landroid/view/ViewGroup;Lp3/p;Le23/p;)Lcom/google/android/gms/maps/model/BitmapDescriptor;", "", "measureSpec", "I", "currentContent", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RememberComposeBitmapDescriptorKt {
    private static final int measureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* JADX WARN: Code duplicated, block: B:9:0x0061  */
    public static final BitmapDescriptor rememberComposeBitmapDescriptor(Object[] objArr, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        objArr.getClass();
        pVar.getClass();
        mVar.C(1871105836);
        x1 x1Var = p3.n.f135158a;
        Object objA = mVar.A(AndroidCompositionLocals_androidKt.f6046f);
        objA.getClass();
        ViewGroup viewGroup = (ViewGroup) objA;
        p3.o0.b bVarG = mVar.g();
        p1 p1VarQ = p3.p0.q(pVar, mVar);
        w0 w0Var = new w0(4);
        w0Var.a(viewGroup);
        w0Var.a(bVarG);
        w0Var.a(rememberComposeBitmapDescriptor$lambda$0(p1VarQ));
        w0Var.b(objArr);
        ArrayList<Object> arrayList = w0Var.f105816a;
        boolean zB = false;
        for (Object obj : arrayList.toArray(new Object[arrayList.size()])) {
            zB |= mVar.B(obj);
        }
        Object objQ = mVar.q();
        if (zB) {
            objQ = renderComposableToBitmapDescriptor(viewGroup, bVarG, rememberComposeBitmapDescriptor$lambda$0(p1VarQ));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = renderComposableToBitmapDescriptor(viewGroup, bVarG, rememberComposeBitmapDescriptor$lambda$0(p1VarQ));
                mVar.K(objQ);
            }
        }
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) objQ;
        x1 x1Var2 = p3.n.f135158a;
        mVar.f();
        return bitmapDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e23.p<p3.m, Integer, Unit> rememberComposeBitmapDescriptor$lambda$0(x3<? extends e23.p<? super p3.m, ? super Integer, Unit>> x3Var) {
        return (e23.p) x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapDescriptor renderComposableToBitmapDescriptor(ViewGroup viewGroup, p3.p pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setParentCompositionContext(pVar);
        composeView.setContent(pVar2);
        viewGroup.addView(composeView);
        int i14 = measureSpec;
        composeView.measure(i14, i14);
        if (composeView.getMeasuredWidth() == 0 || composeView.getMeasuredHeight() == 0) {
            vb.h.z("The ComposeView was measured to have a width or height of zero. Make sure that the content has a non-zero size.");
            return null;
        }
        composeView.layout(0, 0, composeView.getMeasuredWidth(), composeView.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(composeView.getMeasuredWidth(), composeView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        composeView.draw(new Canvas(bitmapCreateBitmap));
        viewGroup.removeView(composeView);
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
        bitmapDescriptorFromBitmap.getClass();
        return bitmapDescriptorFromBitmap;
    }
}
