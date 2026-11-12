package xf1;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import ig1.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxf1/i;", "Landroid/widget/ArrayAdapter;", "Lbg1/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mIsDisplayMetric", "<init>", "(Landroid/content/Context;Z)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends ArrayAdapter<bg1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f190685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f190686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f190687c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxf1/i$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f190688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f190689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f190690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f190691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f190692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f190693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f190694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f190695h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z14) {
        super(context, R.layout.gcm3_segments_list_item);
        context.getClass();
        this.f190685a = z14;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        this.f190686b = (LayoutInflater) systemService;
    }

    public final void a(HashMap<String, Boolean> map) {
        Boolean bool;
        ArrayList arrayList = this.f190687c;
        if (arrayList == null || map == null) {
            return;
        }
        Iterator<Integer> it = x.i(arrayList).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            ArrayList arrayList2 = this.f190687c;
            bg1.a aVar = arrayList2 != null ? (bg1.a) arrayList2.get(iIntValue) : null;
            if (aVar != null && (bool = map.get(aVar.f17841f)) != null) {
                aVar.f17840e = bool.booleanValue();
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        String string;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        viewGroup.getClass();
        if (view2 == null) {
            view2 = this.f190686b.inflate(R.layout.gcm3_segments_list_item, (ViewGroup) null);
            view2.getClass();
            aVar = new a();
            View viewFindViewById = view2.findViewById(R.id.segment_favourite_image);
            viewFindViewById.getClass();
            aVar.f190688a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.segment_name);
            viewFindViewById2.getClass();
            aVar.f190689b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.segment_surface_type);
            viewFindViewById3.getClass();
            aVar.f190690c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.segment_distance);
            viewFindViewById4.getClass();
            aVar.f190691d = (TextView) viewFindViewById4;
            aVar.f190692e = view2.findViewById(R.id.segment_distance_separator);
            View viewFindViewById5 = view2.findViewById(R.id.segment_list_item_watermark_activity_type);
            viewFindViewById5.getClass();
            aVar.f190693f = (ImageView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.segment_my_ranking);
            viewFindViewById6.getClass();
            aVar.f190695h = (TextView) viewFindViewById6;
            aVar.f190694g = view2.findViewById(R.id.segment_rank_separator);
            Context context = getContext();
            context.getClass();
            if (c22.b.e(context)) {
                Context context2 = getContext();
                context2.getClass();
                int iC = (int) c22.b.c(context2, getContext().getResources().getDimensionPixelSize(R.dimen.icon_medium), 1.5f);
                ImageView imageView = aVar.f190693f;
                if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                    layoutParams2.width = iC;
                }
                ImageView imageView2 = aVar.f190693f;
                if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                    layoutParams.height = iC;
                }
            }
            view2.setTag(aVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            aVar = (a) tag;
        }
        bg1.a item = getItem(i14);
        k kVar = k.f190699a;
        Context context3 = getContext();
        context3.getClass();
        kVar.getClass();
        if (item != null) {
            ImageView imageView3 = aVar.f190688a;
            if (imageView3 != null) {
                imageView3.setVisibility(item.f17840e ? 0 : 4);
            }
            String string2 = item.f17838c;
            if (TextUtils.isEmpty(string2)) {
                string2 = context3.getString(R.string.unknown);
            }
            TextView textView = aVar.f190689b;
            if (textView != null) {
                textView.setText(string2);
            }
            int i15 = z0.k(item.f17839d, x0.f4346x).f4361d;
            ImageView imageView4 = aVar.f190693f;
            if (imageView4 != null) {
                imageView4.setImageResource(i15);
            }
            ImageView imageView5 = aVar.f190693f;
            if (imageView5 != null) {
                imageView5.setColorFilter(a7.b.getColor(context3, R.color.gcm_list_activity_icon), PorterDuff.Mode.SRC_IN);
            }
            e.a aVar2 = e.f190666c;
            int i16 = item.f17845j;
            e eVar = e.TYPE_OTHER;
            aVar2.getClass();
            eVar.getClass();
            w13.c cVar = e.f190675l;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                e eVar2 = (e) bVarN.next();
                if (eVar2.f190676a == i16) {
                    eVar = eVar2;
                    break;
                }
            }
            TextView textView2 = aVar.f190690c;
            if (textView2 != null) {
                textView2.setText(context3.getString(eVar.f190677b));
            }
            l3.a aVar3 = l3.f23124b;
            double d14 = item.f17842g;
            m3 m3Var = m3.KILOMETER;
            m3 m3Var2 = m3.METER;
            aVar3.getClass();
            double dG = l3.a.g(d14, m3Var, m3Var2);
            if (!this.f190685a) {
                m3Var = m3.MILE;
            }
            String strO = l3.a.O(context3, dG, m3Var, l3.f23129g, true);
            boolean zIsEmpty = TextUtils.isEmpty(strO);
            TextView textView3 = aVar.f190691d;
            if (zIsEmpty) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view3 = aVar.f190692e;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            } else {
                if (textView3 != null) {
                    textView3.setText(strO);
                }
                String strA = oi0.d.a(context3, strO, new l0(14));
                TextView textView4 = aVar.f190691d;
                if (textView4 != null) {
                    textView4.setContentDescription(strA);
                }
                TextView textView5 = aVar.f190691d;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                View view4 = aVar.f190692e;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            }
            int i17 = item.f17847l;
            if (i17 > 0) {
                string = String.valueOf(i17);
            } else {
                string = context3.getString(R.string.no_value);
                string.getClass();
            }
            TextView textView6 = aVar.f190695h;
            if (textView6 != null) {
                textView6.setText(context3.getString(R.string.segments_rank, string));
            }
        }
        return view2;
    }
}
