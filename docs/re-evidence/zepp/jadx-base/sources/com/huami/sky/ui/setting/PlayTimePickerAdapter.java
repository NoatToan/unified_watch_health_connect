package com.huami.sky.ui.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.widget.wheelview.R;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.AbstractWheelAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/sky/ui/setting/PlayTimePickerAdapter;", "Lcom/huami/widget/wheelview/adapters/AbstractWheelAdapter;", "", "index", "", "getItemText", "getItemsCount", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getItem", "", "isNeedLoop", "getInitLoopBase", "getBASE_BUNDLE", "Landroid/content/Context;", "b", "Landroid/content/Context;", "mContext", "", "c", "[Ljava/lang/Integer;", "items", "Lcom/huami/widget/wheelview/WheelView;", GoogleApiAvailabilityLight.a, "Lcom/huami/widget/wheelview/WheelView;", "mWheelView", "<init>", "(Landroid/content/Context;[Ljava/lang/Integer;Lcom/huami/widget/wheelview/WheelView;)V", "a", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class PlayTimePickerAdapter extends AbstractWheelAdapter {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Integer[] items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final WheelView mWheelView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/huami/sky/ui/setting/PlayTimePickerAdapter$a", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "b", "(Landroid/widget/TextView;)V", "content", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private TextView content;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }

        public final void b(@Nullable TextView textView) {
            this.content = textView;
        }
    }

    public PlayTimePickerAdapter(@NotNull Context context, @NotNull Integer[] numArr, @NotNull WheelView wheelView) {
        this.mContext = context;
        this.items = numArr;
        this.mWheelView = wheelView;
    }

    private final CharSequence getItemText(int index) {
        if (index < 0) {
            return "";
        }
        Integer[] numArr = this.items;
        return index < numArr.length ? PlaySettingPickDialogKt.formatMinutesToString(this.mContext, numArr[index].intValue()) : "";
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getBASE_BUNDLE() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: getInitLoopBase */
    public int getMInitLoopBase() {
        return 0;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    @NotNull
    public View getItem(int index, @Nullable View convertView, @Nullable ViewGroup parent) {
        TextView content;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.mContext).inflate(R.layout.wheel_item_normal, parent, false);
            a aVar = new a();
            aVar.b((TextView) convertView.findViewById(R.id.content_txt));
            aVar.getContent().getLayoutParams().height = SkyExtKt.getDp(49);
            convertView.setTag(aVar);
        }
        Object tag = convertView.getTag();
        a aVar2 = tag instanceof a ? (a) tag : null;
        if (aVar2 != null && (content = aVar2.getContent()) != null) {
            int currentItem = this.mWheelView.getCurrentItem();
            if (index == currentItem) {
                TextViewCompat.setTextAppearance(content, com.huami.sky.ui.R.style.Rainbow_TextAppearance_Number4);
                content.setTextSize(20.0f);
                SkyExtKt.setTextColorRes$default(content, com.huami.sky.ui.R.color.s46, null, 2, null);
            } else if (index == currentItem - 1 || index == currentItem + 1) {
                TextViewCompat.setTextAppearance(content, com.huami.sky.ui.R.style.Rainbow_TextAppearance_Number5);
                content.setTextSize(18.0f);
                SkyExtKt.setTextColorRes(content, com.huami.sky.ui.R.color.s46, Double.valueOf(0.6d));
            } else {
                TextViewCompat.setTextAppearance(content, com.huami.sky.ui.R.style.Rainbow_TextAppearance_Number5);
                content.setTextSize(16.0f);
                SkyExtKt.setTextColorRes(content, com.huami.sky.ui.R.color.s46, Double.valueOf(0.4d));
            }
            content.setText(getItemText(index));
        }
        return convertView;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    public int getItemsCount() {
        return this.items.length;
    }

    @Override // com.huami.widget.wheelview.adapters.WheelViewAdapter
    /* JADX INFO: renamed from: isNeedLoop */
    public boolean getMNeedLoop() {
        return false;
    }
}
