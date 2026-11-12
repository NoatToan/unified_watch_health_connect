package com.garmin.android.apps.connectmobile.powerguide;

import ab1.o;
import ab1.p;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import n23.j;
import oi0.h;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.c0;
import s5.e0;
import s70.v;
import sa1.f;
import sa1.l;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\u000b\f\rB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/powerguide/a$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "showTerrainProfileIcons", "showSendToDeviceButton", "<init>", "(Lcom/garmin/android/apps/connectmobile/powerguide/a$c;ZZ)V", "b", "d", "c", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40362e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f40366d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/powerguide/a;Landroid/view/View;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f40367g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f40368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f40369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f40370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f40371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ComposeView f40372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f40373f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f40373f = aVar;
            this.f40368a = (ImageView) view2.findViewById(R.id.course_type_image);
            this.f40369b = (TextView) view2.findViewById(R.id.strategy_name);
            this.f40370c = (TextView) view2.findViewById(R.id.strategy_distance);
            this.f40371d = (TextView) view2.findViewById(R.id.strategy_duration);
            this.f40372e = (ComposeView) view2.findViewById(R.id.send_to_device_btn);
        }
    }

    public interface c {
        void a(long j8, long j14);

        default void b(long j8, long j14) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/a$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    static {
        new C0759a(null);
    }

    public a(c cVar, boolean z14, boolean z15) {
        cVar.getClass();
        this.f40363a = cVar;
        this.f40364b = z14;
        this.f40365c = z15;
        this.f40366d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f40366d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        o oVar = (o) this.f40366d.get(i14);
        if (oVar instanceof o.c) {
            return 0;
        }
        if (oVar instanceof o.a) {
            return 1;
        }
        if (oVar instanceof o.b) {
            return 2;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (f0Var instanceof b) {
            b bVar = (b) f0Var;
            Object obj = this.f40366d.get(i14);
            obj.getClass();
            final o.c cVar = (o.c) obj;
            TextView textView = bVar.f40371d;
            TextView textView2 = bVar.f40370c;
            ComposeView composeView = bVar.f40372e;
            ImageView imageView = bVar.f40368a;
            View view2 = bVar.itemView;
            final int i15 = 0;
            final c cVar2 = this.f40363a;
            view2.setOnClickListener(new View.OnClickListener() { // from class: sa1.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    ab1.o.c cVar3 = cVar;
                    com.garmin.android.apps.connectmobile.powerguide.a.c cVar4 = cVar2;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.powerguide.a.b.f40367g;
                            if (cVar4 != null) {
                                cVar4.a(cVar3.f2621a, cVar3.f2622b);
                            }
                            break;
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.powerguide.a.b.f40367g;
                            if (cVar4 != null) {
                                cVar4.b(cVar3.f2621a, cVar3.f2622b);
                            }
                            break;
                    }
                }
            });
            a aVar = bVar.f40373f;
            if (aVar.f40364b) {
                p pVar = cVar.f2624d;
                if (pVar != null) {
                    imageView.setImageResource(pVar.f2635c);
                    Resources resources = imageView.getContext().getResources();
                    resources.getClass();
                    int iN = (int) xy2.b.n(resources, 32.0f);
                    imageView.getLayoutParams().width = iN;
                    imageView.getLayoutParams().height = iN;
                }
            } else {
                imageView.setImageResource(R.drawable.ic_power_guide);
            }
            Context context = bVar.itemView.getContext();
            if (context != null && c22.b.e(context)) {
                Resources resources2 = context.getResources();
                resources2.getClass();
                int iC = (int) c22.b.c(context, xy2.b.n(resources2, 32.0f), 1.8f);
                imageView.getLayoutParams().width = iC;
                imageView.getLayoutParams().height = iC;
                composeView.getLayoutParams().width = iC;
                composeView.getLayoutParams().height = iC;
            }
            f.f158268a.getClass();
            composeView.setContent(f.f158270c);
            bVar.f40369b.setText(cVar.f2623c);
            Long l14 = cVar.f2625e;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                l3.a aVar2 = l3.f23124b;
                DecimalFormat decimalFormat = l3.f23129g;
                boolean zY = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).y();
                aVar2.getClass();
                textView2.setText(l3.a.Q(bVar.itemView.getContext(), jLongValue, decimalFormat, true, zY));
                v22.d.d(textView2, new e0(28));
            }
            Context context2 = bVar.itemView.getContext();
            context2.getClass();
            h hVar = new h(context2);
            j23.f<Float> fVar = cVar.f2626f;
            if (fVar != null) {
                Context context3 = bVar.itemView.getContext();
                Context context4 = bVar.itemView.getContext();
                context4.getClass();
                textView.setText(context3.getString(R.string.power_guide_estimated_time_lbl, sa1.h.a(context4, fVar)));
                l3.a aVar3 = l3.f23124b;
                float fFloatValue = fVar.getStart().floatValue();
                float f14 = DateTimeConstants.SECONDS_PER_HOUR;
                aVar3.getClass();
                int i16 = ((int) (fFloatValue * f14)) / DateTimeConstants.SECONDS_PER_HOUR;
                int iFloatValue = ((int) (fVar.b().floatValue() * f14)) / DateTimeConstants.SECONDS_PER_HOUR;
                if ((i16 >= 1 || iFloatValue > 1) && ((long) (fVar.b().floatValue() * f14)) >= 5400) {
                    String string = bVar.itemView.getContext().getString(R.string.lbl_value1_to_value2, hVar.c((int) (fVar.getStart().floatValue() * f14), false), hVar.c((int) (fVar.b().floatValue() * f14), false));
                    string.getClass();
                    textView.setContentDescription(bVar.itemView.getContext().getString(R.string.power_guide_estimated_time_lbl, string));
                }
            }
            e.v(composeView, aVar.f40365c);
            final int i17 = 1;
            composeView.setOnClickListener(new View.OnClickListener() { // from class: sa1.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i18 = i17;
                    ab1.o.c cVar3 = cVar;
                    com.garmin.android.apps.connectmobile.powerguide.a.c cVar4 = cVar2;
                    switch (i18) {
                        case 0:
                            int i19 = com.garmin.android.apps.connectmobile.powerguide.a.b.f40367g;
                            if (cVar4 != null) {
                                cVar4.a(cVar3.f2621a, cVar3.f2622b);
                            }
                            break;
                        default:
                            int i110 = com.garmin.android.apps.connectmobile.powerguide.a.b.f40367g;
                            if (cVar4 != null) {
                                cVar4.b(cVar3.f2621a, cVar3.f2622b);
                            }
                            break;
                    }
                }
            });
            composeView.setContentDescription(bVar.itemView.getContext().getString(R.string.lbl_send_to_device));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewInflate;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        l lVar = new l(context);
        if (i14 != 0) {
            if (i14 == 1) {
                return new d(j.b(viewGroup, R.layout.power_guide_strategy_list_empty, viewGroup, false));
            }
            if (i14 == 2) {
                return new d(j.b(viewGroup, R.layout.power_guide_strategy_list_error, viewGroup, false));
            }
            vb.h.w();
            return null;
        }
        float f14 = lVar.f158282a;
        LayoutInflater layoutInflater = lVar.f158283b;
        if (f14 >= 1.5f) {
            viewInflate = layoutInflater.inflate(R.layout.power_guide_strategy_list_item_font_scaled, viewGroup, false);
            viewInflate.getClass();
        } else {
            viewInflate = layoutInflater.inflate(R.layout.power_guide_strategy_list_item, viewGroup, false);
            viewInflate.getClass();
        }
        return new b(this, viewInflate);
    }

    public final void r(List<? extends o> list) {
        ArrayList arrayList = this.f40366d;
        arrayList.clear();
        arrayList.addAll(list);
        c0.u(arrayList, new a61.c(new v(11), 22));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.powerguide.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/a$a;", "", "<init>", "()V", "", "STRATEGY_ITEM_TYPE", "I", "EMPTY_ITEM_TYPE", "ERROR_ITEM_TYPE", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0759a {
        public /* synthetic */ C0759a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0759a() {
        }
    }

    public /* synthetic */ a(c cVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? true : z15);
    }
}
