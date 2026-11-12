package com.garmin.android.apps.connectmobile.settings.devices.index;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.smartscale.model.e;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import hg1.g;
import java.util.ArrayList;
import java.util.List;
import jm0.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/e;", "Lkotlin/collections/ArrayList;", "scaleUsers", "", "deviceDisplayName", "Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$a;", "removeInvitedUserListener", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$a;)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<C0801b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<e> f43066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f43068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43069e;

    public interface a {
        void a(e eVar, b bVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.index.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0801b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f43070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UserLevelImageView f43071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f43072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f43073d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0801b(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.user_text_line_1);
            viewFindViewById.getClass();
            this.f43070a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.userImg);
            viewFindViewById2.getClass();
            this.f43071b = (UserLevelImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.owner_text_view);
            viewFindViewById3.getClass();
            this.f43072c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.remove_user_image);
            viewFindViewById4.getClass();
            this.f43073d = (ImageView) viewFindViewById4;
        }
    }

    public b(Context context, ArrayList<e> arrayList, String str, a aVar) {
        context.getClass();
        arrayList.getClass();
        aVar.getClass();
        this.f43065a = context;
        this.f43066b = arrayList;
        this.f43067c = str;
        this.f43068d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f43066b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        C0801b c0801b = (C0801b) f0Var;
        c0801b.getClass();
        ImageView imageView = c0801b.f43073d;
        list.getClass();
        if (list.isEmpty()) {
            onBindViewHolder(c0801b, i14);
            return;
        }
        e eVar = this.f43066b.get(i14);
        eVar.getClass();
        e eVar2 = eVar;
        if (!this.f43069e || eVar2.getIsPrimary()) {
            v22.e.j(imageView);
        } else {
            v22.e.q(imageView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f43065a).inflate(R.layout.gcm_manage_smart_scale_user_row_layout, viewGroup, false);
        viewInflate.getClass();
        return new C0801b(viewInflate);
    }

    public final void r(e eVar) {
        Object userDisplayName = eVar.getUserDisplayName();
        if (userDisplayName == null && (userDisplayName = eVar.getUserEmail()) == null) {
            userDisplayName = Integer.valueOf(R.string.no_value);
        }
        Context context = this.f43065a;
        new androidx.appcompat.app.e.a(context).setMessage(context.getString(R.string.lbl_remove_user_from_device, userDisplayName, this.f43067c)).setPositiveButton(context.getString(R.string.lbl_remove), new g(16, this, eVar)).setNegativeButton(context.getString(R.string.lbl_cancel), new c(24)).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C0801b c0801b, int i14) {
        c0801b.getClass();
        ImageView imageView = c0801b.f43073d;
        TextView textView = c0801b.f43072c;
        e eVar = this.f43066b.get(i14);
        eVar.getClass();
        e eVar2 = eVar;
        TextView textView2 = c0801b.f43070a;
        String fullName = eVar2.getFullName();
        if (fullName == null) {
            fullName = eVar2.getUserEmail();
        }
        textView2.setText(fullName);
        Context context = this.f43065a;
        textView2.setTextColor(a7.b.getColor(context, R.color.gcm_text_primary));
        c0801b.f43071b.setProfileImageData(eVar2.f44460k);
        if (eVar2.getIsPrimary()) {
            textView.setVisibility(0);
            textView.setText(context.getString(R.string.lbl_owner));
        }
        v22.e.j(imageView);
        imageView.setOnClickListener(new lq.g(5, eVar2, this));
        c0801b.itemView.setOnLongClickListener(new b00.c(3, eVar2, this));
    }
}
