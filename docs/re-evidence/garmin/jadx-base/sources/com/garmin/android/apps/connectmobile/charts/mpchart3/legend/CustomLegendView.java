package com.garmin.android.apps.connectmobile.charts.mpchart3.legend;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.b;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import n23.j;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import v22.e;
import xz.f;
import xz.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "c", "Ljava/lang/String;", "getChartTitle", "()Ljava/lang/String;", "setChartTitle", "(Ljava/lang/String;)V", "chartTitle", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomLegendView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String chartTitle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView$a$a;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.h<C0507a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f31326a = new ArrayList();

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.charts.mpchart3.legend.CustomLegendView$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/legend/CustomLegendView$a;Landroid/view/View;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class C0507a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f31327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ImageView f31328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f31329c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0507a(a aVar, View view2) {
                super(view2);
                view2.getClass();
                this.f31327a = view2.getContext();
                View viewFindViewById = view2.findViewById(R.id.legend_item_image_view);
                viewFindViewById.getClass();
                this.f31328b = (ImageView) viewFindViewById;
                View viewFindViewById2 = view2.findViewById(R.id.legend_item_text_view);
                viewFindViewById2.getClass();
                this.f31329c = (TextView) viewFindViewById2;
            }
        }

        public a(CustomLegendView customLegendView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f31326a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            Canvas canvas;
            int i15;
            Drawable bitmapDrawable;
            LinearGradient linearGradient;
            Bitmap bitmap;
            Canvas canvas2;
            int i16;
            Paint paint;
            LinearGradient linearGradient2;
            BitmapDrawable bitmapDrawable2;
            C0507a c0507a = (C0507a) f0Var;
            c0507a.getClass();
            f fVar = (f) this.f31326a.get(i14);
            ImageView imageView = c0507a.f31328b;
            Context context = c0507a.f31327a;
            fVar.getClass();
            List<Integer> list = fVar.f192741d;
            g gVar = fVar.f192742e;
            c0507a.f31329c.setText(fVar.f192738a);
            String str = fVar.f192744g;
            if (str != null) {
                c0507a.itemView.setContentDescription(str);
            }
            context.getClass();
            float fC = b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f);
            float f14 = fC / 2;
            float f15 = f14 - 0.5f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(MathKt.c(fC), MathKt.c(fC), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas3 = new Canvas();
            canvas3.setBitmap(bitmapCreateBitmap);
            int iSave = canvas3.save();
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            Integer num = fVar.f192740c;
            paint2.setColor(num != null ? num.intValue() : a7.b.getColor(context, R.color.gcm_chart_default_data_set));
            paint2.setStrokeWidth(2.0f);
            paint2.setPathEffect(null);
            if (s.g(gVar, g.a.f192745a)) {
                Drawable drawable = a7.b.getDrawable(context, R.drawable.circle_white);
                if (drawable != null && (bitmapDrawable = drawable.mutate()) != null) {
                    bitmapDrawable.setColorFilter(new PorterDuffColorFilter(paint2.getColor(), PorterDuff.Mode.SRC_IN));
                    canvas = canvas3;
                    i15 = iSave;
                }
                canvas = canvas3;
                i15 = iSave;
                bitmapDrawable = null;
            } else {
                if (s.g(gVar, g.h.f192753a)) {
                    paint2.setStyle(Paint.Style.STROKE);
                    canvas3.drawCircle(f14, f14, f15, paint2);
                    Resources resources = context.getResources();
                    resources.getClass();
                    bitmapDrawable2 = new BitmapDrawable(resources, bitmapCreateBitmap);
                } else if (s.g(gVar, g.d.f192749a)) {
                    canvas3.drawCircle(f14, f14, f15, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                    canvas3.drawCircle(f14, f14, f15, paint2);
                    Resources resources2 = context.getResources();
                    resources2.getClass();
                    bitmapDrawable2 = new BitmapDrawable(resources2, bitmapCreateBitmap);
                } else if (s.g(gVar, g.C3605g.f192752a)) {
                    Drawable drawable2 = a7.b.getDrawable(context, R.drawable.chart_square_value_indicator);
                    if (drawable2 != null && (bitmapDrawable = drawable2.mutate()) != null) {
                        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(paint2.getColor(), PorterDuff.Mode.SRC_IN));
                        canvas = canvas3;
                        i15 = iSave;
                    }
                    canvas = canvas3;
                    i15 = iSave;
                    bitmapDrawable = null;
                } else if (gVar instanceof g.e) {
                    float f16 = ((g.e) gVar).f192750a * context.getResources().getDisplayMetrics().density;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(b.c(context, f16, 1.5f));
                    if (list != null) {
                        i16 = iSave;
                        bitmap = bitmapCreateBitmap;
                        paint = paint2;
                        canvas2 = canvas3;
                        linearGradient2 = new LinearGradient(0.0f, f14, fC, f14, h0.a1(list), (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        bitmap = bitmapCreateBitmap;
                        canvas2 = canvas3;
                        i16 = iSave;
                        paint = paint2;
                        linearGradient2 = null;
                    }
                    paint.setShader(linearGradient2);
                    Path path = new Path();
                    path.reset();
                    path.moveTo(0.0f, f14);
                    path.lineTo(fC, f14);
                    canvas2.drawPath(path, paint);
                    Resources resources3 = context.getResources();
                    resources3.getClass();
                    i15 = i16;
                    bitmapDrawable = new BitmapDrawable(resources3, bitmap);
                    canvas = canvas2;
                } else if (gVar instanceof g.c) {
                    g.c cVar = (g.c) gVar;
                    float fC2 = b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f) / cVar.f192747a;
                    DashPathEffect dashPathEffect = new DashPathEffect(new float[]{0.75f * fC2, fC2 * 0.25f}, 0.0f);
                    float f17 = cVar.f192748b * context.getResources().getDisplayMetrics().density;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(b.c(context, f17, 1.5f));
                    paint2.setPathEffect(dashPathEffect);
                    if (list != null) {
                        i15 = iSave;
                        canvas = canvas3;
                        linearGradient = new LinearGradient(0.0f, f14, fC, f14, h0.a1(list), (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        canvas = canvas3;
                        i15 = iSave;
                        linearGradient = null;
                    }
                    r13.setShader(linearGradient);
                    Path path2 = new Path();
                    path2.reset();
                    path2.moveTo(0.0f, f14);
                    path2.lineTo(fC, f14);
                    canvas.drawPath(path2, paint2);
                    Resources resources4 = context.getResources();
                    resources4.getClass();
                    bitmapDrawable = new BitmapDrawable(resources4, bitmapCreateBitmap);
                } else {
                    canvas = canvas3;
                    i15 = iSave;
                    if (gVar instanceof g.b) {
                        bitmapDrawable = ((g.b) gVar).f192746a;
                        if (bitmapDrawable == null) {
                            bitmapDrawable = fVar.f192739b;
                        }
                    } else {
                        if (!s.g(gVar, g.f.f192751a) && gVar != null) {
                            u0.r();
                            return;
                        }
                        bitmapDrawable = null;
                    }
                }
                bitmapDrawable = bitmapDrawable2;
                canvas = canvas3;
                i15 = iSave;
            }
            canvas.restoreToCount(i15);
            e.k(imageView, bitmapDrawable);
            if (e.d(imageView)) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = MathKt.c(b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f));
                layoutParams.height = MathKt.c(b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new C0507a(this, j.b(viewGroup, R.layout.chart_legend_item, viewGroup, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLegendView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        a aVar = new a(this);
        this.f31323a = aVar;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.setJustifyContent(2);
        flexboxLayoutManager.setAlignItems(0);
        this.f31324b = R.string.lbl_chart_ada_legend_content_description;
        this.chartTitle = "";
        LayoutInflater.from(context).inflate(R.layout.chart_legend_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_legend);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.setHasFixedSize(true);
        setImportantForAccessibility(1);
    }

    public final void a(List<f> list) {
        list.getClass();
        a aVar = this.f31323a;
        aVar.getClass();
        ArrayList arrayList = aVar.f31326a;
        arrayList.clear();
        arrayList.addAll(list);
        aVar.notifyDataSetChanged();
        setContentDescription(getContext().getString(this.f31324b, this.chartTitle));
        for (f fVar : list) {
            String string = getContentDescription().toString();
            String str = fVar.f192744g;
            if (str == null) {
                str = fVar.f192738a;
            }
            setContentDescription(string + StringUtils.SPACE + str);
        }
    }

    public final String getChartTitle() {
        return this.chartTitle;
    }

    public final void setChartTitle(String str) {
        str.getClass();
        this.chartTitle = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomLegendView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomLegendView(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ CustomLegendView(Context context, AttributeSet attributeSet, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
