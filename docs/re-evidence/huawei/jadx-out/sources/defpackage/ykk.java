package defpackage;

import com.huawei.pluginachievement.manager.model.MedalConstants;

/* JADX INFO: loaded from: classes20.dex */
public final class ykk {
    public static String d() {
        return "create table  IF NOT EXISTS tb_wear_engine_auth_info(key TEXT primary key not null,app_uid integer,user_id TEXT,app_id integer,permission TEXT,open_status integer,encrypted_string TEXT)";
    }

    public static String[] c() {
        return new String[]{MedalConstants.EVENT_KEY, "app_uid", "user_id", "app_id", "permission", "open_status", "encrypted_string"};
    }
}
