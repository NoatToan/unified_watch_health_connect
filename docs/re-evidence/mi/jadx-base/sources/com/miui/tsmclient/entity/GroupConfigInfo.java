package com.miui.tsmclient.entity;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.util.LogUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GroupConfigInfo extends CommonResponseInfo {
    public static final String CARD_CONFIG_LIST = "CARD_CONFIG";
    public static final String NFC_CONFIGS = "NFC_CONFIGS";
    public static final String NON_TRANSACTION_HCI_CONFIG_LIST = "NON_TRANSACTION_HCI_CONFIG";

    @SerializedName("data")
    private Map<String, List<ConfigInfo.ConfigItem>> mGroupConfigData;

    public List<String> getContentList(String str, String str2) {
        List<ConfigInfo.ConfigItem> list;
        ArrayList arrayList = new ArrayList();
        if (getGroupConfigMap() == null || (list = getGroupConfigMap().get(str2)) == null) {
            return arrayList;
        }
        for (ConfigInfo.ConfigItem configItem : list) {
            if (TextUtils.isEmpty(str) || str.equals(configItem.mCardName)) {
                arrayList.add(configItem.mContent);
            }
        }
        return arrayList;
    }

    public Map<String, List<ConfigInfo.ConfigItem>> getGroupConfigMap() {
        return this.mGroupConfigData;
    }

    public <T> List<T> getInfoList(String str, String str2, Type type) {
        return getInfoList(str, str2, type, new Gson());
    }

    public <T> List<T> getInfoList(String str, Type type, Gson gson) {
        return getInfoList(null, str, type, gson);
    }

    public <T> List<T> getInfoList(String str, String str2, Type type, Gson gson) {
        List<String> contentList = getContentList(str, str2);
        ArrayList arrayList = new ArrayList();
        try {
            for (String str3 : contentList) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(gson.fromJson(str3, type));
                }
            }
        } catch (JsonSyntaxException e) {
            LogUtils.e("GroupConfigInfo parsing " + str2 + " error", e);
        }
        return arrayList;
    }
}
