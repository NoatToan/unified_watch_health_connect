package com.xiaomi.fitness.sport_eco.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.sport_eco.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport_eco.view.BaseSportItemView;
import defpackage.sk5;
import defpackage.sli;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00030\u0006B)\b\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u001cH\u0002J\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010#\u001a\u00020\fH&J\u0015\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0019R\u001e\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00018\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/BaseSportItemView;", "V", "Landroidx/databinding/ViewDataBinding;", "D", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/sport_eco/view/ISportTabItemData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "bean", "getBean", "()Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "setBean", "(Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;)V", "Lcom/xiaomi/fitness/sport_eco/bean/BaseSportItemBean;", "initView", "", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "setListener", "setData", "data", "getLayoutId", "setDataToView", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseSportItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSportItemView.kt\ncom/xiaomi/fitness/sport_eco/view/BaseSportItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,86:1\n310#2:87\n326#2,4:88\n311#2:92\n*S KotlinDebug\n*F\n+ 1 BaseSportItemView.kt\ncom/xiaomi/fitness/sport_eco/view/BaseSportItemView\n*L\n57#1:87\n57#1:88,4\n57#1:92\n*E\n"})
public abstract class BaseSportItemView<V extends ViewDataBinding, D extends BaseSportItemBean> extends LinearLayout implements ISportTabItemData<D> {

    @Nullable
    private D bean;

    @Nullable
    private V binding;

    @JvmOverloads
    public BaseSportItemView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    private final void initView(Context context) {
        View root;
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        V v = (V) sk5.j(LayoutInflater.from(context), getLayoutId(), this, false);
        this.binding = v;
        if ((v != null ? v.getRoot() : null) == null) {
            Toast.makeText(context, "xml 加载失败", 1).show();
            return;
        }
        V v2 = this.binding;
        if (v2 != null && (root = v2.getRoot()) != null && (layoutParams = root.getLayoutParams()) != null) {
            int screenWidth = DisplayUtil.getScreenWidth();
            Integer numValueOf = (context == null || (resources = context.getResources()) == null) ? null : Integer.valueOf((int) resources.getDimension(sli.f33765b));
            Intrinsics.checkNotNull(numValueOf);
            layoutParams.width = screenWidth - (2 * numValueOf.intValue());
        }
        V v3 = this.binding;
        addView(v3 != null ? v3.getRoot() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$1(BaseSportItemView this$0) {
        View root;
        Resources resources;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        V v = this$0.binding;
        if (v == null || (root = v.getRoot()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int screenWidth = DisplayUtil.getScreenWidth();
        Context context = this$0.getContext();
        Integer numValueOf = (context == null || (resources = context.getResources()) == null) ? null : Integer.valueOf((int) resources.getDimension(sli.f33765b));
        Intrinsics.checkNotNull(numValueOf);
        layoutParams.width = screenWidth - (2 * numValueOf.intValue());
        root.setLayoutParams(layoutParams);
    }

    private final void setListener() {
    }

    @Nullable
    public final D getBean() {
        return this.bean;
    }

    @Nullable
    public final V getBinding() {
        return this.binding;
    }

    public abstract int getLayoutId();

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        View root;
        super.onConfigurationChanged(newConfig);
        V v = this.binding;
        if (v == null || (root = v.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: oc2
            @Override // java.lang.Runnable
            public final void run() {
                BaseSportItemView.onConfigurationChanged$lambda$1(this.f28985a);
            }
        });
    }

    public final void setBean(@Nullable D d) {
        this.bean = d;
    }

    public final void setBinding(@Nullable V v) {
        this.binding = v;
    }

    @Override // com.xiaomi.fitness.sport_eco.view.ISportTabItemData
    public void setData(@NotNull D data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.bean = data;
        setDataToView(data);
        V v = this.binding;
        if (v != null) {
            v.t();
        }
    }

    public abstract void setDataToView(@NotNull D data);

    @JvmOverloads
    public BaseSportItemView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BaseSportItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public BaseSportItemView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
