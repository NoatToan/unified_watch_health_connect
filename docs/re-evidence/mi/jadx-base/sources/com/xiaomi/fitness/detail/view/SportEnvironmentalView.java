package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.detail.util.EcoNumberUtil;
import defpackage.bsi;
import defpackage.byi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0014J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020%H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportEnvironmentalView;", "Landroid/widget/RelativeLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "environmentalValue", "getEnvironmentalValue", "setEnvironmentalValue", "environmentalDes", "getEnvironmentalDes", "setEnvironmentalDes", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "setImg", "(Landroid/widget/ImageView;)V", "onFinishInflate", "", "bindData", "environmental", "getEnvironmentalDesc", "", "id", "value", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportEnvironmentalView extends RelativeLayout {

    @Nullable
    private TextView environmentalDes;

    @Nullable
    private TextView environmentalValue;

    @Nullable
    private ImageView img;

    @NotNull
    private Context mContext;

    @Nullable
    private TextView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEnvironmentalView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    private final String getEnvironmentalDesc(int id, int value) {
        Number numberValueOf;
        if (1 <= value && value < 100) {
            numberValueOf = Integer.valueOf(value);
        } else if (100 <= value && value < 250) {
            numberValueOf = Double.valueOf(EcoNumberUtil.divRoundUp(value, 100));
        } else if (250 <= value && value < 500) {
            numberValueOf = Double.valueOf(EcoNumberUtil.divRoundUp(value, 250));
        } else if (500 > value || value >= 1000) {
            numberValueOf = (1000 > value || value >= 1700) ? Double.valueOf(EcoNumberUtil.divRoundUp(value, 1700)) : Double.valueOf(EcoNumberUtil.divRoundUp(value, 1000));
        } else {
            numberValueOf = Double.valueOf(EcoNumberUtil.divRoundUp(value, 500));
        }
        return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), id, numberValueOf.intValue(), numberValueOf);
    }

    public final void bindData(int environmental) {
        String environmentalDesc;
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(getTitle());
        }
        ImageView imageView = this.img;
        if (imageView != null) {
            imageView.setImageResource(hoi.m);
        }
        TextView textView2 = this.environmentalValue;
        if (textView2 != null) {
            textView2.setText(String.valueOf(environmental));
        }
        if (environmental >= 0 && environmental < 100) {
            environmentalDesc = getEnvironmentalDesc(byi.B, environmental);
        } else if (100 <= environmental && environmental < 250) {
            environmentalDesc = getEnvironmentalDesc(byi.C, environmental);
        } else if (250 <= environmental && environmental < 500) {
            environmentalDesc = getEnvironmentalDesc(byi.E, environmental);
        } else if (500 > environmental || environmental >= 1000) {
            environmentalDesc = (1000 > environmental || environmental >= 1700) ? getEnvironmentalDesc(byi.D, environmental) : getEnvironmentalDesc(byi.G, environmental);
        } else {
            environmentalDesc = getEnvironmentalDesc(byi.F, environmental);
        }
        TextView textView3 = this.environmentalDes;
        if (textView3 != null) {
            textView3.setText(environmentalDesc);
        }
    }

    @Nullable
    public final TextView getEnvironmentalDes() {
        return this.environmentalDes;
    }

    @Nullable
    public final TextView getEnvironmentalValue() {
        return this.environmentalValue;
    }

    @Nullable
    public final ImageView getImg() {
        return this.img;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    public final TextView getTitle() {
        return this.title;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.title = (TextView) findViewById(bsi.J9);
        this.environmentalValue = (TextView) findViewById(bsi.n9);
        this.environmentalDes = (TextView) findViewById(bsi.m9);
        this.img = (ImageView) findViewById(bsi.F2);
    }

    public final void setEnvironmentalDes(@Nullable TextView textView) {
        this.environmentalDes = textView;
    }

    public final void setEnvironmentalValue(@Nullable TextView textView) {
        this.environmentalValue = textView;
    }

    public final void setImg(@Nullable ImageView imageView) {
        this.img = imageView;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setTitle(@Nullable TextView textView) {
        this.title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEnvironmentalView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    private final String getTitle() {
        String string = this.mContext.getString(j1j.t4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public /* synthetic */ SportEnvironmentalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEnvironmentalView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        LayoutInflater.from(mContext).inflate(ivi.d1, this);
    }
}
