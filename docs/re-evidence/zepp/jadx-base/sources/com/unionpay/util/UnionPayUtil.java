package com.unionpay.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.tsmservice.data.CardTypeListItem;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.tsmservice.data.UniteAppStatus;
import com.unionpay.tsmservice.data.UpdateInfo;
import com.unionpay.tsmservice.result.CheckBinCodeResult;
import com.unionpay.tsmservice.result.GetActivityUniteApplyResult;
import com.unionpay.tsmservice.result.GetSMSAuthCodeResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class UnionPayUtil {
    private static String a(List<?> list) {
        if (list == null) {
            return "null";
        }
        return Arrays.toString(list.toArray()) + ", Size : " + list.size();
    }

    private static String b(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(objArr));
        if (objArr != null) {
            str = ", Size: " + objArr.length;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private static String c(@NonNull CardTypeListItem cardTypeListItem) {
        return "<CardName:" + cardTypeListItem.getBankName() + ", CardType:" + cardTypeListItem.getCardType() + SearchCriteria.GT;
    }

    private static String d(@NonNull UniteAppDetail uniteAppDetail) {
        return "<MPan:" + uniteAppDetail.getMPan() + ", Span:" + uniteAppDetail.getSPan() + ", Status:" + uniteAppDetail.getStatus().getStatus() + SearchCriteria.GT;
    }

    private static String e(@NonNull UpdateInfo updateInfo) {
        return "<Type:" + updateInfo.getType() + ", DownloadUrl:" + updateInfo.getDownloadUrl() + ", Desc:" + b(updateInfo.getDesc()) + SearchCriteria.GT;
    }

    private static String f(@NonNull CheckBinCodeResult checkBinCodeResult) {
        return "<BankName:" + checkBinCodeResult.getCheckBinCodeInfo().getBankName() + ", Type" + checkBinCodeResult.getCheckBinCodeInfo().getCardType() + SearchCriteria.GT;
    }

    private static String g(@NonNull GetActivityUniteApplyResult getActivityUniteApplyResult) {
        return "<MPan:" + getActivityUniteApplyResult.getApplyResult().getMPan() + ", Span:" + getActivityUniteApplyResult.getApplyResult().getSPan() + ", Result:" + getActivityUniteApplyResult.getApplyResult().getResult() + SearchCriteria.GT;
    }

    public static String getUnionCardStatusText(Context context, String str) {
        if (Arrays.asList("02", "03", "04").contains(str)) {
            return context.getString(R.string.wl_bank_card_state_unactivated);
        }
        return Arrays.asList("05", "06", UniteAppStatus.ILLEGAL).contains(str) ? context.getString(R.string.wl_bank_card_state_error) : "";
    }

    private static String h(@NonNull GetSMSAuthCodeResult getSMSAuthCodeResult) {
        return "<ExpireNote:" + getSMSAuthCodeResult.getSmsAuthCode().getExpireNote() + SearchCriteria.GT;
    }

    private static String i(@NonNull List<?> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UniteAppDetail) {
                arrayList.add(d((UniteAppDetail) obj));
            } else if (obj instanceof CardTypeListItem) {
                arrayList.add(c((CardTypeListItem) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return a(arrayList);
    }

    public static boolean isEmptyList(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isTsmServiceInstalled(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        ArrayList arrayList = new ArrayList();
        int size = installedPackages.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(installedPackages.get(i).packageName);
        }
        return arrayList.contains("com.unionpay.tsmbleuniteservice");
    }

    public static boolean isUnActiveCard(UniteAppStatus uniteAppStatus) {
        String status = uniteAppStatus.getStatus();
        return status.equalsIgnoreCase("02") || status.equalsIgnoreCase("03") || status.equalsIgnoreCase("04");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String resourceToString(UnionPayResource<?> unionPayResource) {
        String string = null;
        if (unionPayResource == null) {
            return null;
        }
        T t = unionPayResource.data;
        if (t instanceof UpdateInfo) {
            string = e((UpdateInfo) t);
        } else if (t instanceof List) {
            string = i((List) t);
        } else if (t instanceof UniteAppDetail) {
            string = d((UniteAppDetail) t);
        } else if (t instanceof CheckBinCodeResult) {
            string = f((CheckBinCodeResult) t);
        } else if (t instanceof GetActivityUniteApplyResult) {
            string = g((GetActivityUniteApplyResult) t);
        } else if (t instanceof GetSMSAuthCodeResult) {
            string = h((GetSMSAuthCodeResult) t);
        } else if (t != 0) {
            string = t.toString();
        }
        return "UnionPayResource{status=" + unionPayResource.status + ", code='" + unionPayResource.code + "', message='" + unionPayResource.message + "', data=" + string + '}';
    }
}
