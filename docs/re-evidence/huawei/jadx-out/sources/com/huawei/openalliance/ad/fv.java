package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.openalliance.ad.constant.TagConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class fv implements go {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static go f18828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18829c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18830a;
    private final byte[] d = new byte[0];
    private Map<String, String> e;

    @Override // com.huawei.openalliance.ad.go
    public long e(String str) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences == null) {
                return 0L;
            }
            return sharedPreferences.getLong(str + TagConstants.SYNC_TIME_SUFFIX, 0L);
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public long d(String str) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences == null) {
                return 0L;
            }
            return sharedPreferences.getLong(str + TagConstants.UPDATE_TIME_SUFFIX, 0L);
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public int c(String str) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences == null) {
                return -1;
            }
            return sharedPreferences.getInt(str + TagConstants.TRIGGER_MODE_SUFFIX, -1);
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public Map<String, String> b() {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences != null) {
                Map<String, String> map = this.e;
                if (map != null) {
                    return map;
                }
                String string = sharedPreferences.getString("user_tag", "");
                if (!com.huawei.openalliance.ad.utils.dg.b(string)) {
                    Map<String, String> map2 = (Map) com.huawei.openalliance.ad.utils.bk.b(string, Map.class, new Class[0]);
                    this.e = map2;
                    return map2;
                }
            }
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public String b(String str) {
        String string;
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences == null) {
                string = "";
            } else {
                string = sharedPreferences.getString(str + TagConstants.TAG_VALUE_SUFFIX, "");
            }
        }
        return string;
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(List<String> list, long j) {
        synchronized (this.d) {
            if (this.f18830a != null && !com.huawei.openalliance.ad.utils.bm.a(list)) {
                SharedPreferences.Editor editorEdit = this.f18830a.edit();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    editorEdit.putLong(it.next() + TagConstants.SYNC_TIME_SUFFIX, j);
                }
                editorEdit.commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(String str, String str2) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str + TagConstants.TAG_VALUE_SUFFIX, str2).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(String str, long j) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong(str + TagConstants.UPDATE_TIME_SUFFIX, j).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(String str, int i) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(str + TagConstants.TRIGGER_MODE_SUFFIX, i).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(String str) {
        synchronized (this.d) {
            if (this.f18830a != null) {
                this.e = (Map) com.huawei.openalliance.ad.utils.bk.b(str, Map.class, new Class[0]);
                this.f18830a.edit().putString("user_tag", str).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public void a(long j) {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("last_query_tag_time", j).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.go
    public long a() {
        synchronized (this.d) {
            SharedPreferences sharedPreferences = this.f18830a;
            if (sharedPreferences == null) {
                return 0L;
            }
            return sharedPreferences.getLong("last_query_tag_time", 0L);
        }
    }

    private static go b(Context context) {
        go goVar;
        synchronized (f18829c) {
            if (f18828b == null) {
                f18828b = new fv(context);
            }
            goVar = f18828b;
        }
        return goVar;
    }

    public static go a(Context context) {
        return b(context);
    }

    private fv(Context context) {
        try {
            this.f18830a = context.getApplicationContext().getSharedPreferences("hiad_user_tags_sp", 0);
        } catch (Throwable th) {
            try {
                hw.c("UserTagSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
            } finally {
                this.f18830a = null;
            }
        }
    }
}
