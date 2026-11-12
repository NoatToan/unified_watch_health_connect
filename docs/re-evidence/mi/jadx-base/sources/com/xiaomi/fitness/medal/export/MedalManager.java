package com.xiaomi.fitness.medal.export;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.ecf;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\bf\u0018\u0000 \\2\u00020\u0001:\u0001\\J=\u0010\t\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b\t\u0010\nJC\u0010\r\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b\r\u0010\u000eJU\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001f\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b\u001f\u0010 J9\u0010!\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b!\u0010 J+\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\u0007H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H&¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\fH&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020-H&¢\u0006\u0004\b0\u0010/J!\u00101\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b1\u0010\u001bJ\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\fH&¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\fH&¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\fH&¢\u0006\u0004\b?\u0010=J/\u0010E\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020@2\u0006\u0010B\u001a\u00020A2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050CH&¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020@2\b\b\u0002\u0010\"\u001a\u00020\fH&¢\u0006\u0004\bG\u0010HJ9\u0010L\u001a\u00020\u00052(\u0010K\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0I\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0I`JH&¢\u0006\u0004\bL\u0010MJ/\u0010P\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020@2\u0006\u0010N\u001a\u00020\u00042\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010CH&¢\u0006\u0004\bP\u0010QJA\u0010T\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020@2\u0006\u0010R\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00042\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010C2\b\b\u0002\u0010S\u001a\u00020\u0004H&¢\u0006\u0004\bT\u0010UJ=\u0010Z\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020@2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050CH&¢\u0006\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/xiaomi/fitness/medal/export/MedalManager;", "", "Lkotlin/Function2;", "", "", "", "success", "Lkotlin/Function1;", "fail", "getWearMedal", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "", "getWearMedalDetail", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "id", Constants.KEY_RECHARGE_ICON_URL, "medalType", "wearMedal", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "unWearMedal", "(JLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "goToMedalListActivity", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "getMedalEntrance", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getMedalEntranceV4", "type", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "doMedalAssist", "(ILkotlin/jvm/functions/Function1;)V", "checkBirthday", "()V", "model", "doMedalAssistFaceDownload", "(Ljava/lang/String;Ljava/lang/String;)V", "doMedalAssistWithSp", "(I)V", "", "getKeyNfcDoorMedalUploaded", "()Z", "getKeyNfcTransitMedalUploaded", "goToMedalDetailActivity", "medalClass", "", "getMedalListImgRatio", "(I)F", "Lecf$a$a;", "medalData", "Landroid/text/SpannableString;", "getMedalSubtitle", "(Lecf$a$a;)Landroid/text/SpannableString;", "seconds", "convertSecondsToMinutesStr", "(I)Ljava/lang/String;", "shareMethod", "getShareMethodString", "Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "latestMedal", "Lkotlin/Function0;", "closeDialogCallback", "showLatestMedalPopDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/medal/export/data/PopMedalData;Lkotlin/jvm/functions/Function0;)V", "requestMedalList", "(Landroidx/fragment/app/FragmentActivity;I)V", "", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "requestAllTypeMedalPopupList", "(Lkotlin/jvm/functions/Function1;)V", "tip", "dismissCallback", "showTrainingFinishPop", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "iconRes", "userTip", "showTrainingPopMedal", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "title", CardUIInfo.KEY_SUBTITILE, "btnStr", "clickCallback", "showSleepInterfereMedal", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Companion", "medal-export_release"}, k = 1, mv = {2, 0, 0})
public interface MedalManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/medal/export/MedalManager$Companion;", "", "<init>", "()V", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void requestMedalList$default(MedalManager medalManager, FragmentActivity fragmentActivity, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestMedalList");
            }
            if ((i2 & 2) != 0) {
                i = 1;
            }
            medalManager.requestMedalList(fragmentActivity, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showLatestMedalPopDialog$default(MedalManager medalManager, FragmentActivity fragmentActivity, PopMedalData popMedalData, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLatestMedalPopDialog");
            }
            if ((i & 4) != 0) {
                function0 = new Function0() { // from class: lff
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
            }
            medalManager.showLatestMedalPopDialog(fragmentActivity, popMedalData, function0);
        }

        public static /* synthetic */ void showTrainingPopMedal$default(MedalManager medalManager, FragmentActivity fragmentActivity, int i, String str, Function0 function0, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTrainingPopMedal");
            }
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            medalManager.showTrainingPopMedal(fragmentActivity, i, str, function0, str2);
        }
    }

    void checkBirthday();

    @NotNull
    String convertSecondsToMinutesStr(int seconds);

    void doMedalAssist(int type, @NotNull Function1<? super MedalAssistResult, Unit> success);

    void doMedalAssistFaceDownload(@NotNull String id, @NotNull String model);

    void doMedalAssistWithSp(int type);

    boolean getKeyNfcDoorMedalUploaded();

    boolean getKeyNfcTransitMedalUploaded();

    void getMedalEntrance(@NotNull Function1<? super MedalEntrance, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void getMedalEntranceV4(@NotNull Function1<? super MedalEntrance, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    float getMedalListImgRatio(int medalClass);

    @NotNull
    SpannableString getMedalSubtitle(@NotNull ecf.a.C0923a medalData);

    @NotNull
    String getShareMethodString(int shareMethod);

    void getWearMedal(@NotNull Function2<? super Long, ? super String, Unit> success, @NotNull Function1<? super String, Unit> fail);

    void getWearMedalDetail(@NotNull Function3<? super Long, ? super String, ? super Integer, Unit> success, @NotNull Function1<? super String, Unit> fail);

    void goToMedalDetailActivity(@NotNull Activity activity, @Nullable Bundle bundle);

    void goToMedalListActivity(@NotNull Activity activity, @Nullable Bundle bundle);

    void requestAllTypeMedalPopupList(@NotNull Function1<? super List<PopMedalData>, Unit> onSuccess);

    void requestMedalList(@NotNull FragmentActivity activity, int type);

    void showLatestMedalPopDialog(@NotNull FragmentActivity activity, @NotNull PopMedalData latestMedal, @NotNull Function0<Unit> closeDialogCallback);

    void showSleepInterfereMedal(@NotNull FragmentActivity activity, @NotNull String title, @NotNull String subTitle, @NotNull String btnStr, @NotNull Function0<Unit> clickCallback);

    void showTrainingFinishPop(@NotNull FragmentActivity activity, @NotNull String tip, @Nullable Function0<Unit> dismissCallback);

    void showTrainingPopMedal(@NotNull FragmentActivity activity, int iconRes, @NotNull String tip, @Nullable Function0<Unit> dismissCallback, @NotNull String userTip);

    void unWearMedal(long id, @NotNull String medalType, @NotNull Function2<? super Long, ? super String, Unit> success, @NotNull Function1<? super String, Unit> fail);

    void wearMedal(long id, @NotNull String iconUrl, @NotNull String medalType, @NotNull Function2<? super Long, ? super String, Unit> success, @NotNull Function1<? super String, Unit> fail);
}
