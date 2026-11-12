package com.huami.wallet.accessdoor.api;

import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.nfc.door.NfcTag;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.nfc.door.entity.IdCardEntity;
import com.huami.nfc.door.entity.VerifyEntity;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.entity.ProtocolEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H&J1\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0016\u001a\u00020\u0002H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001a\u001a\u00020\u0002H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H&J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00120\u0004H&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010\u0018\u001a\u00020&H&J:\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010+\u001a\u00020\u0010H&J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u00100\u001a\u00020/H&J\b\u00102\u001a\u000201H&J\b\u00103\u001a\u000201H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H&J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u0002052\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001305H&J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010<\u001a\u00020\u0002H&J$\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00120\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\b\u0010@\u001a\u000201H&J&\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020B\u0018\u0001050\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010D\u001a\u00020BH&J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010D\u001a\u00020BH&¨\u0006G"}, d2 = {"Lcom/huami/wallet/accessdoor/api/IHuamiPayWrapperApi;", "", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "", "notifyActiveApplet", "name", "notifyAppletInfo", "Lcom/huami/nfc/ble/AppletType;", "type", "imageUrl", "notifyIssueApplet", "notifyDeleteApplet", "Lcom/huami/nfc/door/NfcTag;", "getNfcTag", "", "bizType", "", "Lcom/huami/nfc/door/DoorCardInfo;", "getCardList", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/nfc/base/PayResponse;", "sessionId", "getCardInfo", "info", "updateCardInfo", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "query", "frontImage", "backImage", "verify", "Lcom/huami/nfc/door/entity/VerifyEntity;", "snowQuery", "Lcom/huami/nfc/door/entity/IdCardEntity;", "snowVerify", "tag", "phoneNum", "districtName", "nfcTagType", "install", "deleteApp", "setDefaultCard", "Lcom/huami/nfc/web/NfcDevice;", "getNfcDevice", "", "isMiDevice", "isClassicDevice", "closeNfcTagReader", "", "aids", "readDefaultCard", "isDefaultCard", "updateNfcCardListSync", "list", "syncAppletList", "key", "getDoorImageUrl", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "getSupportCommunity", "isSupportCardScheduleTime", "appletType", "Lcom/huami/nfc/applet/CardScheduleTime;", "queryCardScheduleTime", "cardScheduleTime", "setCardScheduleTime", "deleteCardScheduleTime", "access-door_release"}, k = 1, mv = {1, 5, 1})
public interface IHuamiPayWrapperApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getCardList$default(IHuamiPayWrapperApi iHuamiPayWrapperApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardList");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return iHuamiPayWrapperApi.getCardList(str, num);
        }

        public static /* synthetic */ PayResponse install$default(IHuamiPayWrapperApi iHuamiPayWrapperApi, NfcTag nfcTag, String str, String str2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: install");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return iHuamiPayWrapperApi.install(nfcTag, str, str2, i);
        }
    }

    @NotNull
    PayResponse<String> agreeProtocol(long id);

    @NotNull
    PayResponse<Unit> closeNfcTagReader();

    @NotNull
    PayResponse<String> deleteApp(@NotNull String aid);

    @NotNull
    PayResponse<Boolean> deleteCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    PayResponse<DoorCardInfo> getCardInfo(@NotNull String sessionId);

    @NotNull
    PayResponse<List<DoorCardInfo>> getCardList(@NotNull String type, @Nullable Integer bizType);

    @NotNull
    PayResponse<String> getDoorImageUrl(@NotNull String key);

    @NotNull
    NfcDevice getNfcDevice();

    @NotNull
    PayResponse<NfcTag> getNfcTag();

    @NotNull
    PayResponse<ProtocolEntity> getProtocol(@NotNull String actionType);

    @NotNull
    PayResponse<List<CommunityNameEntity>> getSupportCommunity(@NotNull String type, @NotNull String name);

    @NotNull
    PayResponse<String> install(@Nullable NfcTag tag, @Nullable String phoneNum, @Nullable String districtName, int nfcTagType);

    boolean isClassicDevice();

    @NotNull
    PayResponse<Boolean> isDefaultCard(@NotNull String aid);

    boolean isMiDevice();

    boolean isSupportCardScheduleTime();

    @NotNull
    PayResponse<Unit> notifyActiveApplet(@NotNull String aid);

    @NotNull
    PayResponse<Unit> notifyAppletInfo(@NotNull String name, @NotNull String aid);

    @NotNull
    PayResponse<Unit> notifyDeleteApplet(@NotNull String aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Unit> notifyIssueApplet(@NotNull String aid, @NotNull AppletType type, @Nullable String imageUrl);

    @NotNull
    PayResponse<Integer> query();

    @NotNull
    PayResponse<List<CardScheduleTime>> queryCardScheduleTime(@NotNull AppletType appletType, @NotNull String aid);

    @NotNull
    PayResponse<String> readDefaultCard(@NotNull List<String> aids);

    @NotNull
    PayResponse<Boolean> setCardScheduleTime(@NotNull CardScheduleTime cardScheduleTime);

    @NotNull
    PayResponse<Unit> setDefaultCard(@NotNull String aid);

    @NotNull
    PayResponse<List<VerifyEntity>> snowQuery();

    @NotNull
    PayResponse<VerifyEntity> snowVerify(@NotNull IdCardEntity info);

    @NotNull
    PayResponse<Unit> syncAppletList(@NotNull List<DoorCardInfo> list);

    @NotNull
    PayResponse<Unit> updateCardInfo(@NotNull DoorCardInfo info);

    @NotNull
    PayResponse<Unit> updateNfcCardListSync(@NotNull List<String> aid, @NotNull AppletType type);

    @NotNull
    PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage);
}
