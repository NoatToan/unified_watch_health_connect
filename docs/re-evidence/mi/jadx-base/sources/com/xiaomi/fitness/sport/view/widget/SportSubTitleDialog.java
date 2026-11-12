package com.xiaomi.fitness.sport.view.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.miui.circulate.device.api.Column;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import defpackage.dvi;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000eJ\u0010\u0010\f\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$SubTitleParams;", "<init>", "()V", "mTitleTv", "Landroid/widget/TextView;", "mSubTitleTv", "initCustomTitle", "", "titleView", "Landroid/view/View;", "setSubTitle", "subTitleRes", "", CardUIInfo.KEY_SUBTITILE, "", "Builder", "SubTitleParams", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSubTitleDialog extends CommonDialog<SubTitleParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private TextView mSubTitleTv;

    @Nullable
    private TextView mTitleTv;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$SubTitleParams;", "Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog;", "getThis", "()Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog;", "", "title", "setTitle", "(I)Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Builder;", "textId", "setDialogTitle", "", Column.SUBTITLE, "setSubTitle", "(Ljava/lang/String;)Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Builder;", "name", "<init>", "(Ljava/lang/String;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends com.xiaomi.fitness.baseui.dialog.a<Builder, SubTitleParams, SportSubTitleDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String name) {
            super(new SubTitleParams(name, null, null, 6, null));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @NotNull
        public final Builder setSubTitle(@NotNull String subtitle) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            requireDialogParams().setSubTitle(subtitle);
            return getThis();
        }

        @NotNull
        public final Builder setTitle(int title) {
            requireDialogParams().setTitle(Integer.valueOf(title));
            return getThis();
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public SportSubTitleDialog internalCreate() {
            return new SportSubTitleDialog();
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder setDialogTitle(int textId) {
            return setTitle(textId);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$Builder;", "name", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder cancelable = new Builder(name).setCustomTitleId(dvi.o).setCanceledOnTouchOutside(true).setCancelable(true);
            Intrinsics.checkNotNullExpressionValue(cancelable, "setCancelable(...)");
            return cancelable;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/SportSubTitleDialog$SubTitleParams;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "name", "", "title", "", CardUIInfo.KEY_SUBTITILE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTitle", "()Ljava/lang/Integer;", "setTitle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSubTitle", "setSubTitle", "(Ljava/lang/String;)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SubTitleParams extends DialogParams {

        @NotNull
        public static final Parcelable.Creator<SubTitleParams> CREATOR = new Creator();

        @NotNull
        private final String name;

        @Nullable
        private String subTitle;

        @Nullable
        private Integer title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubTitleParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubTitleParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubTitleParams(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubTitleParams[] newArray(int i) {
                return new SubTitleParams[i];
            }
        }

        public /* synthetic */ SubTitleParams(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final Integer getTitle() {
            return this.title;
        }

        public final void setSubTitle(@Nullable String str) {
            this.subTitle = str;
        }

        public final void setTitle(@Nullable Integer num) {
            this.title = num;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            Integer num = this.title;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.subTitle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubTitleParams(@NotNull String name, @Nullable Integer num, @Nullable String str) {
            super(name);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.title = num;
            this.subTitle = str;
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomTitle(@Nullable View titleView) {
        super.initCustomTitle(titleView);
        Intrinsics.checkNotNull(titleView);
        this.mTitleTv = (TextView) titleView.findViewById(xri.b8);
        this.mSubTitleTv = (TextView) titleView.findViewById(xri.Z7);
        Integer title = getDialogParams().getTitle();
        if (title != null) {
            int iIntValue = title.intValue();
            TextView textView = this.mTitleTv;
            if (textView != null) {
                textView.setText(getString(iIntValue));
            }
        }
        String subTitle = getDialogParams().getSubTitle();
        if (subTitle == null) {
            TextView textView2 = this.mSubTitleTv;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.mSubTitleTv;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        TextView textView4 = this.mSubTitleTv;
        if (textView4 != null) {
            textView4.setText(subTitle);
        }
    }

    public final void setSubTitle(int subTitleRes) {
        setSubTitle(getString(subTitleRes));
    }

    public final void setSubTitle(@Nullable CharSequence subTitle) {
        TextView textView = this.mSubTitleTv;
        if (textView != null) {
            textView.setText(subTitle);
        }
    }
}
