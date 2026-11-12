package com.garmin.android.apps.connectmobile.badges.redesign;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import java.util.List;
import p005kotlin.Metadata;
import uu.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/l;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "mBadgeDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/m;)V", "b", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f30524a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/l$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f30525e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f30526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f30527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f30528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f30529d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.related_badge_image);
            viewFindViewById.getClass();
            this.f30526a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.related_badge_name);
            viewFindViewById2.getClass();
            this.f30527b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.related_badge_description);
            viewFindViewById3.getClass();
            this.f30528c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.divider);
            viewFindViewById4.getClass();
            this.f30529d = viewFindViewById4;
        }
    }

    static {
        new a(null);
    }

    public l(m mVar) {
        this.f30524a = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        m mVar;
        List<SimpleBadgeDTO> listK0;
        m mVar2 = this.f30524a;
        if (mVar2 != null) {
            mVar2.getClass();
            if (mVar2.k0() != null && (mVar = this.f30524a) != null && (listK0 = mVar.k0()) != null) {
                return listK0.size();
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        String string2;
        m mVar;
        List<SimpleBadgeDTO> listK0;
        List<SimpleBadgeDTO> listK1;
        f0Var.getClass();
        b bVar = (b) f0Var;
        m mVar2 = this.f30524a;
        SimpleBadgeDTO simpleBadgeDTO = (mVar2 == null || (listK1 = mVar2.k0()) == null) ? null : listK1.get(i14);
        m mVar3 = this.f30524a;
        boolean z14 = (mVar3 == null || mVar3.k0() == null || (mVar = this.f30524a) == null || (listK0 = mVar.k0()) == null || i14 != listK0.size() - 1) ? false : true;
        TextView textView = bVar.f30527b;
        ImageView imageView = bVar.f30526a;
        TextView textView2 = bVar.f30528c;
        Context context = bVar.itemView.getContext();
        if (simpleBadgeDTO != null) {
            String str = simpleBadgeDTO.f30534e;
            context.getClass();
            zp0.c cVar = new zp0.c(context);
            cVar.f206565e = simpleBadgeDTO.f30537h;
            cVar.f206570j = 2131231129;
            cVar.f206576p = true;
            cVar.f206578r = "cache_availability_today";
            cVar.h(imageView);
            imageView.setColorFilter(p.c(!simpleBadgeDTO.f30539j));
            if (((int) Math.pow(2.0d, ((double) simpleBadgeDTO.f30536g) - 1.0d)) == 1) {
                string = context.getString(R.string.lbl_user_level_points_abbr_singular);
                string2 = p6.b.d(context, R.string.social_one_point, string);
            } else {
                string = context.getString(R.string.social_points, String.valueOf((int) Math.pow(2.0d, ((double) simpleBadgeDTO.f30536g) - 1.0d)));
                string.getClass();
                string2 = context.getString(R.string.lbl_number_points, String.valueOf((int) Math.pow(2.0d, ((double) simpleBadgeDTO.f30536g) - 1.0d)));
                string2.getClass();
            }
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar = simpleBadgeDTO.f30540k;
            textView.setText(gVar != null ? gVar.f30568a : simpleBadgeDTO.f30533d);
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar2 = simpleBadgeDTO.f30540k;
            textView2.setText(context.getString(R.string.string_space_bullet_string_pattern, string, gVar2 != null ? gVar2.f30571d : str));
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar3 = simpleBadgeDTO.f30540k;
            if (gVar3 != null) {
                str = gVar3.f30571d;
            }
            textView2.setContentDescription(context.getString(R.string.string_comma_string_pattern, string2, str));
            bVar.itemView.setOnClickListener(new u12.e(9, context, simpleBadgeDTO));
        } else {
            imageView.setImageResource(2131231129);
            textView.setText("");
            textView2.setText("");
            textView2.setContentDescription("");
            bVar.itemView.setOnClickListener(null);
        }
        bVar.f30529d.setVisibility(z14 ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(n23.j.b(viewGroup, R.layout.related_badge_list_item, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/l$a;", "", "<init>", "()V", "", "VIEW_TYPE_ITEM", "I", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
