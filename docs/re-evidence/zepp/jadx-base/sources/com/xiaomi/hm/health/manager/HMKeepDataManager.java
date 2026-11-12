package com.xiaomi.hm.health.manager;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huami.account.keeper.HMAccountKeeper;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.keeper.HMWebKeeper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class HMKeepDataManager {
    private static final String[] a = {"test_url_list", "test_url", "test_account_url_list", "test_account_url"};
    private static final String[] b = {HMKeeperConstant.BIND_BASE_STEP, HMKeeperConstant.BIND_TIMESTAMP, HMKeeperConstant.BIND_USER_ID, "last_login_provider", "new_version_helper_showed", HMKeeperConstant.KEY_SHOW_PLAY_MI_BAND, HMKeeperConstant.KEY_SHOW_PLAY_BFAT, HMKeeperConstant.KEY_SHOW_PLAY_WEIGHT, HMKeeperConstant.KEY_SHOW_PLAY_CH, HMKeeperConstant.KEY_SHOW_PLAY_TEMPO, HMWebKeeper.KEY_LAST_SELECT_AREA, HMKeeperConstant.KEY_KEEP_ALIVE_PID, HMKeeperConstant.KEY_KEEP_ALIVE_IS_SETTED, HMKeeperConstant.KEY_KEEP_ALIVE_TIME_START, HMKeeperConstant.KEY_KEEP_ALIVE_TIME_END, HMKeeperConstant.SPEECH_KEY_FIRSTLY_SHOW_MIOT_PERSSION_PROMPT, HMKeeperConstant.SPEECH_KEY_FIRSTLY_SHOW_MIOT_PERSSION_PROMPT_USERID};

    private static Set<String> a(Object value) {
        if (value instanceof Set) {
            Set set = (Set) value;
            if (set.size() > 0) {
                HashSet hashSet = new HashSet();
                for (Object obj : set) {
                    if (!(obj instanceof String)) {
                        return null;
                    }
                    hashSet.add((String) obj);
                }
                return hashSet;
            }
        }
        return null;
    }

    private static void b(Map<String, Object> dest) {
        SharedPreferences.Editor editorEdit = HMKeeper.getSharedPref().edit();
        for (String str : dest.keySet()) {
            Object obj = dest.get(str);
            if (obj instanceof Boolean) {
                editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editorEdit.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editorEdit.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editorEdit.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                editorEdit.putString(str, (String) obj);
            } else {
                Set<String> setA = a(obj);
                if (setA != null) {
                    editorEdit.putStringSet(str, setA);
                }
            }
        }
        editorEdit.apply();
    }

    private static void c(Map<String, ?> src, Map<String, Object> dest) {
        for (String str : b) {
            if (src.containsKey(str)) {
                Object objValueOf = src.get(str);
                if (HMKeeperConstant.BIND_USER_ID.equals(str) && (objValueOf instanceof Long)) {
                    objValueOf = String.valueOf(((Long) objValueOf).longValue());
                }
                dest.put(str, objValueOf);
            }
        }
    }

    private static void d(Map<String, ?> src, Map<String, Object> dest) {
        if (GlobalConfig.get().isBuildInner()) {
            for (String str : a) {
                if (src.containsKey(str)) {
                    dest.put(str, src.get(str));
                }
            }
        }
    }

    public static void keepData() {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        String huamiUid = hMAccountKeeper.readLoginData().getHuamiUid();
        if (TextUtils.isEmpty(huamiUid)) {
            HMKeeper.clear();
            return;
        }
        Map<String, ?> all = HMKeeper.getAll();
        HashMap map = new HashMap();
        c(all, map);
        d(all, map);
        HMKeeper.clear();
        b(map);
        hMAccountKeeper.setLastLoginUid(huamiUid);
    }

    public static void removeData(String uid) {
        String lastLoginUid = HMAccountKeeper.INSTANCE.getLastLoginUid();
        if (TextUtils.isEmpty(uid) || TextUtils.isEmpty(lastLoginUid) || uid.equals(lastLoginUid)) {
            return;
        }
        SharedPreferences sharedPref = HMKeeper.getSharedPref();
        SharedPreferences.Editor editorEdit = HMKeeper.getSharedPref().edit();
        for (String str : b) {
            if (sharedPref.contains(str)) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }
}
