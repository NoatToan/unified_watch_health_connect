package com.garmin.android.apps.connectmobile.draggableimagepreviewer;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ef0.c;
import ef0.d;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import r22.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/DraggableImagePreviewer;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/recyclerview/widget/s;", "helper", "", "setItemTouchHelper", "(Landroidx/recyclerview/widget/s;)V", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a;", "newAdapter", "setAdapter", "(Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a;)V", "", "Lef0/b;", "getImageItems", "()Ljava/util/List;", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setImageClickListener", "(Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$b;)V", "", "imageCount", "setMaxImageCount", "(I)V", "Lef0/d;", "setOnDataChangedListener", "(Lef0/d;)V", "getAvailableImageCount", "()I", "availableImageCount", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DraggableImagePreviewer extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f34728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f34729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableImagePreviewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f34728a = new b();
        s sVar = new s(new c(this));
        this.f34729b = sVar;
        sVar.e(this);
        int dimension = (int) context.getResources().getDimension(R.dimen.spacing_micro);
        addItemDecoration(new z0(dimension, 0, dimension, 0));
        setAdapter((RecyclerView.h) this.f34728a);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public final int getAvailableImageCount() {
        a aVar = this.f34728a;
        return aVar.f34730a - aVar.f34731b.size();
    }

    public final List<ef0.b> getImageItems() {
        return h0.b1(this.f34728a.f34731b);
    }

    public final void setAdapter(a newAdapter) {
        newAdapter.getClass();
        this.f34728a = newAdapter;
        setAdapter((RecyclerView.h) newAdapter);
    }

    public final void setImageClickListener(a.b listener) {
        listener.getClass();
        this.f34728a.f34732c = listener;
    }

    public final void setItemTouchHelper(s helper) {
        helper.getClass();
        this.f34729b.e(null);
        this.f34729b = helper;
        helper.e(this);
    }

    public final void setMaxImageCount(int imageCount) {
        this.f34728a.f34730a = imageCount;
    }

    public final void setOnDataChangedListener(d listener) {
        this.f34728a.f34733d = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableImagePreviewer(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ DraggableImagePreviewer(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
