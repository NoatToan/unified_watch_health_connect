package e40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import e23.l;
import java.util.List;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import r22.t1;
import r22.u1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le40/a;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1320a f62830l = new C1320a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l<? super Boolean, Unit> f62831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u1 f62834k;

    public a() {
        super(R.layout.course_privacy_bottom_sheet_content, true, false, false, 12, null);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return this.f62832i != this.f62833j;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        l<? super Boolean, Unit> lVar = this.f62831h;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f62833j));
        }
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Bundle arguments = getArguments();
        boolean z14 = arguments != null ? arguments.getBoolean("isPublicCourse") : false;
        this.f62832i = z14;
        this.f62833j = z14;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.course_privacy_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        Drawable drawable = a7.b.getDrawable(requireContext(), R.drawable.unlock);
        if (drawable != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            k.F(R.color.gcm_icon_secondary, contextRequireContext, drawable);
        }
        Drawable drawable2 = a7.b.getDrawable(requireContext(), R.drawable.lock);
        if (drawable2 != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            k.F(R.color.gcm_icon_secondary, contextRequireContext2, drawable2);
        }
        List<t1> listK = x.k(new t1("0", null, drawable, getString(R.string.lbl_public), getString(R.string.public_course_description), true, this.f62833j, null, false, null, 898, null), new t1(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, null, drawable2, getString(R.string.lbl_private), getString(R.string.private_course_description), true, !this.f62833j, null, false, null, 898, null));
        u1 u1Var = new u1(new cq0.g(this, 29));
        u1Var.D(listK);
        u1Var.f149752e = new ds0.g(this, 5);
        this.f62834k = u1Var;
        recyclerView.setAdapter(u1Var);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_done);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.account_privacy);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: e40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Le40/a$a;", "", "<init>", "()V", "", "EXTRA_IS_PUBLIC_COURSE", "Ljava/lang/String;", "PUBLIC_KEY", "PRIVATE_KEY", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1320a {
        public /* synthetic */ C1320a(j jVar) {
            this();
        }

        private C1320a() {
        }
    }
}
