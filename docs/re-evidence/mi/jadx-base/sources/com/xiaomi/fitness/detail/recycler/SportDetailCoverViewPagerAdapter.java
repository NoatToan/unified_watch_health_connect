package com.xiaomi.fitness.detail.recycler;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.detail.recycler.SportDetailCoverViewPagerAdapter;
import defpackage.fin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportDetailCoverViewPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/recycler/SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/detail/recycler/JustDanceCoverEntity;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "touchListener", "Lcom/xiaomi/fitness/detail/recycler/OnItemTouchListener;", "setOnItemTouchListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "JustDanceCoverViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportDetailCoverViewPagerAdapter extends RecyclerView.Adapter<JustDanceCoverViewHolder> {

    @NotNull
    private final List<JustDanceCoverEntity> dataList;

    @Nullable
    private OnItemTouchListener touchListener;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/graphics/Bitmap;", "", "startColor", "endColor", "addVerticalGradient", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "Lcom/xiaomi/fitness/detail/recycler/JustDanceCoverEntity;", "data", "", "updateItem", "(Lcom/xiaomi/fitness/detail/recycler/JustDanceCoverEntity;)V", "Lfin;", "binding", "Lfin;", "getBinding", "()Lfin;", "<init>", "(Lfin;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class JustDanceCoverViewHolder extends RecyclerView.d0 {

        @NotNull
        private final fin binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JustDanceCoverViewHolder(@NotNull fin binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        private final Bitmap addVerticalGradient(Bitmap bitmap, int i, int i2) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = height;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, i, i2, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setTranslate(0.0f, 300.0f);
            linearGradient.setLocalMatrix(matrix);
            Paint paint = new Paint();
            paint.setShader(linearGradient);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.drawRect(0.0f, 0.0f, width, f, paint);
            return bitmapCreateBitmap;
        }

        @NotNull
        public final fin getBinding() {
            return this.binding;
        }

        public final void updateItem(@NotNull JustDanceCoverEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            AnyExtKt.io$default(null, new SportDetailCoverViewPagerAdapter$JustDanceCoverViewHolder$updateItem$1(new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(data.getImageUrl()).allowConversionToBitmap(true).allowHardware(false).build(), this, null), 1, null);
        }
    }

    public SportDetailCoverViewPagerAdapter(@NotNull List<JustDanceCoverEntity> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(SportDetailCoverViewPagerAdapter this$0, View view, MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            OnItemTouchListener onItemTouchListener2 = this$0.touchListener;
            if (onItemTouchListener2 == null) {
                return false;
            }
            onItemTouchListener2.touchDown();
            return false;
        }
        if ((action != 1 && action != 3) || (onItemTouchListener = this$0.touchListener) == null) {
            return false;
        }
        onItemTouchListener.touchUp();
        return false;
    }

    @NotNull
    public final List<JustDanceCoverEntity> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final void setOnItemTouchListener(@NotNull OnItemTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.touchListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull JustDanceCoverViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.updateItem(this.dataList.get(position));
        holder.getBinding().A.setOnTouchListener(new View.OnTouchListener() { // from class: hen
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SportDetailCoverViewPagerAdapter.onBindViewHolder$lambda$0(this.f19987a, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public JustDanceCoverViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        fin finVarA0 = fin.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(finVarA0, "inflate(...)");
        return new JustDanceCoverViewHolder(finVarA0);
    }
}
