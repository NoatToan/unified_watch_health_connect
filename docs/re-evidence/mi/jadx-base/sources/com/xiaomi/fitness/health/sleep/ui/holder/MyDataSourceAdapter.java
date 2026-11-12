package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.health.sleep.ui.holder.MyDataSourceAdapter;
import defpackage.eri;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/MyDataSourceAdapter;", "Landroid/widget/ArrayAdapter;", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "layoutId", "", "objects", "", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepWmDurationHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepWmDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/MyDataSourceAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,475:1\n54#2,3:476\n24#2:479\n59#2,6:480\n*S KotlinDebug\n*F\n+ 1 SleepWmDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/MyDataSourceAdapter\n*L\n466#1:476,3\n466#1:479\n466#1:480,6\n*E\n"})
public final class MyDataSourceAdapter extends ArrayAdapter<Pair<? extends String, ? extends String>> {
    private final int layoutId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyDataSourceAdapter(@NotNull Context context, int i, @NotNull List<Pair<String, String>> objects) {
        super(context, i, objects);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(objects, "objects");
        this.layoutId = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getView$lambda$0(View view) {
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Pair pair = (Pair) getItem(position);
        if (pair == null) {
            View view = super.getView(position, convertView, parent);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            return view;
        }
        String str = (String) pair.getFirst();
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.layoutId, parent, false);
        }
        convertView.setOnClickListener(new View.OnClickListener() { // from class: rdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyDataSourceAdapter.getView$lambda$0(view2);
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) convertView.findViewById(eri.X8);
        TextView textView = (TextView) convertView.findViewById(eri.Bl);
        Intrinsics.checkNotNull(appCompatImageView);
        ImageLoader imageLoader = Coil.imageLoader(appCompatImageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(appCompatImageView.getContext()).data(str).target(appCompatImageView);
        builderTarget.placeholder(pni.O3);
        builderTarget.error(pni.O3);
        imageLoader.enqueue(builderTarget.build());
        textView.setText((CharSequence) pair.getSecond());
        Intrinsics.checkNotNull(convertView);
        return convertView;
    }
}
