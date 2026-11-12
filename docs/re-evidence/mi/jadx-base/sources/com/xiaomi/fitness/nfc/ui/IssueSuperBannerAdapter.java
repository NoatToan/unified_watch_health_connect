package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import defpackage.eih;
import defpackage.mri;
import defpackage.sui;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/IssueSuperBannerAdapter;", "Leih;", "", "getCount", "()I", "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IssueSuperBannerAdapter extends eih {

    @NotNull
    private Context context;

    @NotNull
    private List<String> dataList;

    public IssueSuperBannerAdapter(@NotNull Context context, @NotNull List<String> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
    }

    @Override // defpackage.eih
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        container.removeView((View) object);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.dataList.size();
    }

    @NotNull
    public final List<String> getDataList() {
        return this.dataList;
    }

    @Override // defpackage.eih
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        Intrinsics.checkNotNullParameter(container, "container");
        View viewInflate = LayoutInflater.from(this.context).inflate(sui.r0, container, false);
        container.addView(viewInflate);
        String str = UIUtils.isNightMode(this.context) ? ColorSchemeHelper.SCHEME_DARK : "light";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/nfc/banner/%s/%s.json", Arrays.copyOf(new Object[]{str, this.dataList.get(position)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        ((LottieAnimationView) viewInflate.findViewById(mri.U1)).setAnimationFromUrl(str2);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.eih
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.areEqual(view, object);
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }
}
