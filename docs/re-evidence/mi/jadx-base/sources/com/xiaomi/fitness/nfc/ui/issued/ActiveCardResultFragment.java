package com.xiaomi.fitness.nfc.ui.issued;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.ActiveCardResultFragment;
import com.xiaomi.fitness.nfc.utils.CardFaceHelper;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.tmg;
import defpackage.wni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/ActiveCardResultFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListViewModel;", "Ltmg;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Ltmg;)V", "", "cardFace", "Ljava/lang/String;", "bankName", "tailNo", "status", "", "cardType", "Ljava/lang/Integer;", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nActiveCardResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveCardResultFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ActiveCardResultFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,85:1\n54#2,3:86\n24#2:89\n59#2,6:90\n54#2,3:96\n24#2:99\n59#2,6:100\n*S KotlinDebug\n*F\n+ 1 ActiveCardResultFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/ActiveCardResultFragment\n*L\n70#1:86,3\n70#1:89\n70#1:90,6\n74#1:96,3\n74#1:99\n74#1:100,6\n*E\n"})
public final class ActiveCardResultFragment extends BaseCardFragment<MasterCardListViewModel, tmg> {

    @Nullable
    private String bankName;

    @Nullable
    private String cardFace;

    @Nullable
    private Integer cardType;

    @Nullable
    private String status;

    @Nullable
    private String tailNo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sCardFace = YoYoPreIssueFragment.sCardFace;

    @NotNull
    private static final String sBankName = "sBankName";

    @NotNull
    private static final String sTailNo = "sTailNo";

    @NotNull
    private static final String sStatus = "sStatus";

    @NotNull
    private static final String mCardType = "card_type";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/ActiveCardResultFragment$Companion;", "", "<init>", "()V", YoYoPreIssueFragment.sCardFace, "", "getSCardFace", "()Ljava/lang/String;", "sBankName", "getSBankName", "sTailNo", "getSTailNo", "sStatus", "getSStatus", "mCardType", "getMCardType", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getMCardType() {
            return ActiveCardResultFragment.mCardType;
        }

        @NotNull
        public final String getSBankName() {
            return ActiveCardResultFragment.sBankName;
        }

        @NotNull
        public final String getSCardFace() {
            return ActiveCardResultFragment.sCardFace;
        }

        @NotNull
        public final String getSStatus() {
            return ActiveCardResultFragment.sStatus;
        }

        @NotNull
        public final String getSTailNo() {
            return ActiveCardResultFragment.sTailNo;
        }
    }

    public ActiveCardResultFragment() {
        super(sui.o, 0, true);
        this.cardType = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(ActiveCardResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull tmg tmgVar) {
        Intrinsics.checkNotNullParameter(tmgVar, "<this>");
        setTitle(o0j.j);
        int screenWidth = DisplayUtil.getScreenWidth() - (((int) ApplicationExtKt.getApplication().getResources().getDimension(pli.e)) * 2);
        tmgVar.D.setText(".... " + this.tailNo);
        Integer num = this.cardType;
        if (num != null && num.intValue() == 2) {
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            String foregroundColor = cardWrapper.bankCard.getCardMetaData().getForegroundColor();
            if (foregroundColor != null && foregroundColor.length() != 0) {
                CardWrapper cardWrapper2 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper2);
                String foregroundColor2 = cardWrapper2.bankCard.getCardMetaData().getForegroundColor();
                Intrinsics.checkNotNullExpressionValue(foregroundColor2, "getForegroundColor(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) foregroundColor2, (CharSequence) "0x", false, 2, (Object) null)) {
                    CardWrapper cardWrapper3 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper3);
                    String foregroundColor3 = cardWrapper3.bankCard.getCardMetaData().getForegroundColor();
                    Intrinsics.checkNotNullExpressionValue(foregroundColor3, "getForegroundColor(...)");
                    tmgVar.D.setTextColor(Color.parseColor(StringsKt__StringsJVMKt.replace$default(foregroundColor3, "0x", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 4, (Object) null)));
                }
            }
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            CardWrapper cardWrapper4 = getCardWrapper();
            AppCompatImageView backgroundView = tmgVar.A;
            Intrinsics.checkNotNullExpressionValue(backgroundView, "backgroundView");
            cardFaceHelper.loadVISACardFace(cardWrapper4, backgroundView);
            Unit unit = Unit.INSTANCE;
        } else {
            CardWrapper cardWrapper5 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper5);
            String cardFace = cardWrapper5.getCardFace();
            if (cardFace == null || cardFace.length() == 0) {
                AppCompatImageView backgroundView2 = tmgVar.A;
                Intrinsics.checkNotNullExpressionValue(backgroundView2, "backgroundView");
                Integer numValueOf = Integer.valueOf(wni.f);
                ImageLoader imageLoader = Coil.imageLoader(backgroundView2.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(backgroundView2.getContext()).data(numValueOf).target(backgroundView2);
                builderTarget.size(screenWidth, (screenWidth * 63) / 100);
                imageLoader.enqueue(builderTarget.build());
            } else {
                AppCompatImageView backgroundView3 = tmgVar.A;
                Intrinsics.checkNotNullExpressionValue(backgroundView3, "backgroundView");
                CardWrapper cardWrapper6 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper6);
                String cardFace2 = cardWrapper6.getCardFace();
                ImageLoader imageLoader2 = Coil.imageLoader(backgroundView3.getContext());
                ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(backgroundView3.getContext()).data(cardFace2).target(backgroundView3);
                builderTarget2.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
                int i = (screenWidth * 63) / 100;
                builderTarget2.error(wni.f).size(screenWidth, i).size(screenWidth, i);
                imageLoader2.enqueue(builderTarget2.build());
            }
        }
        tmgVar.C.setOnClickListener(new View.OnClickListener() { // from class: ef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveCardResultFragment.bindView$lambda$2(this.f16577a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.cardFace = args != null ? args.getString(sCardFace) : null;
        this.bankName = args != null ? args.getString(sBankName) : null;
        this.tailNo = args != null ? args.getString(sTailNo) : null;
        this.status = args != null ? args.getString(sStatus) : null;
        this.cardType = args != null ? Integer.valueOf(args.getInt(mCardType)) : null;
    }
}
