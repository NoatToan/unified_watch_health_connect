package com.xiaomi.ai.domain.phonecall.provider;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.RelativeMappingData;
import com.xiaomi.ai.domain.phonecall.util.Instruction3_0Util;
import com.xiaomi.ai.domain.phonecall.util.NameNormaliztion;
import defpackage.aqe;
import defpackage.qpe;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class RelativeMappingSingleton {
    private RelativeMappingData relativeMappingData;
    private static final qpe LOGGER = aqe.f(RelativeMappingSingleton.class);
    private static String RELATIVE_MAPPING_FILE_PATH = null;
    private static RelativeMappingSingleton relativeMapping = null;
    private static boolean enable = false;
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    private RelativeMappingSingleton() {
        this.relativeMappingData = null;
        RelativeMappingData relativeMappingData = new RelativeMappingData();
        this.relativeMappingData = relativeMappingData;
        String str = RELATIVE_MAPPING_FILE_PATH;
        if (str != null) {
            relativeMappingData.load(str);
        }
    }

    public static void cancelRelativeMapping(String str) {
        RelativeMappingData relativeMappingData;
        if (str == null || (relativeMappingData = getInstance().getRelativeMappingData()) == null) {
            return;
        }
        for (SlotRet slotRet : ((PhoneCallIntention) GSON.fromJson(str, PhoneCallIntention.class)).getSlotRets()) {
            if (slotRet.getNameType().equals(NameType.RELATIVE)) {
                Set<String> relativeSynonyms = NameNormaliztion.getInstance().getRelativeSynonyms(slotRet.getSlot());
                if (relativeSynonyms == null) {
                    relativeSynonyms = new HashSet<>();
                }
                relativeSynonyms.add(slotRet.getSlot());
                for (String str2 : relativeSynonyms) {
                    if (relativeMappingData.getRelativeNameContactMapping().containsKey(str2)) {
                        relativeMappingData.getRelativeNameContactMapping().remove(str2);
                        relativeMappingData.setUpdated(true);
                    }
                }
            }
        }
        getInstance().serializeData();
    }

    public static void cancelRelativeMappingProto3(String str) {
        RelativeMappingData relativeMappingData;
        if (str == null || (relativeMappingData = getInstance().getRelativeMappingData()) == null) {
            return;
        }
        try {
            Phone.PhoneIntention phoneIntentionAuxiliaryObjToIntention = Instruction3_0Util.auxiliaryObjToIntention(new JSONObject(str));
            if (phoneIntentionAuxiliaryObjToIntention != null) {
                for (Phone.NameSlot nameSlot : phoneIntentionAuxiliaryObjToIntention.getNameSlots()) {
                    if (nameSlot.getNameType() != null && NameType.RELATIVE.getText().equalsIgnoreCase(nameSlot.getNameType().toString())) {
                        Set<String> relativeSynonyms = NameNormaliztion.getInstance().getRelativeSynonyms(nameSlot.getName());
                        if (relativeSynonyms == null) {
                            relativeSynonyms = new HashSet<>();
                        }
                        relativeSynonyms.add(nameSlot.getName());
                        for (String str2 : relativeSynonyms) {
                            if (relativeMappingData.getRelativeNameContactMapping().containsKey(str2)) {
                                relativeMappingData.getRelativeNameContactMapping().remove(str2);
                                relativeMappingData.setUpdated(true);
                            }
                        }
                    }
                }
                getInstance().serializeData();
            }
        } catch (JSONException unused) {
            LOGGER.error("parse json error: {}", str);
        }
    }

    public static RelativeMappingSingleton getInstance() {
        if (relativeMapping == null) {
            synchronized (RelativeMappingSingleton.class) {
                try {
                    if (relativeMapping == null) {
                        relativeMapping = new RelativeMappingSingleton();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return relativeMapping;
    }

    public static boolean isEnable() {
        return enable;
    }

    public static boolean isPlayRelativeEdgeAnswerResult(String str) {
        return str != null && RelativeMappingData.hasRelativeSlot(((PhoneCallIntention) GSON.fromJson(str, PhoneCallIntention.class)).getSlotRets());
    }

    public static boolean isPlayRelativeEdgeAnswerResultProto3(String str) {
        if (str == null) {
            return false;
        }
        try {
            Phone.PhoneIntention phoneIntentionAuxiliaryObjToIntention = Instruction3_0Util.auxiliaryObjToIntention(new JSONObject(str));
            return phoneIntentionAuxiliaryObjToIntention != null && RelativeMappingData.hasRelativeNameSlot(phoneIntentionAuxiliaryObjToIntention.getNameSlots());
        } catch (JSONException unused) {
            LOGGER.error("parse json error: {}", str);
        }
    }

    public static void setEnable(boolean z) {
        enable = z;
    }

    public static void setRelativeMappingFilePath(String str) {
        RELATIVE_MAPPING_FILE_PATH = str;
    }

    public RelativeMappingData clearRelativeMappingData() {
        RelativeMappingData relativeMappingData = this.relativeMappingData;
        if (relativeMappingData != null) {
            relativeMappingData.clear();
            this.relativeMappingData.setUpdated(true);
            serializeData();
        }
        return this.relativeMappingData;
    }

    public RelativeMappingData getRelativeMappingData() {
        if (isEnable()) {
            return this.relativeMappingData;
        }
        return null;
    }

    public void serializeData() {
        RelativeMappingData relativeMappingData;
        if (!isEnable() || RELATIVE_MAPPING_FILE_PATH == null || (relativeMappingData = this.relativeMappingData) == null || !relativeMappingData.isUpdated()) {
            return;
        }
        this.relativeMappingData.write(RELATIVE_MAPPING_FILE_PATH);
        this.relativeMappingData.setUpdated(false);
    }
}
