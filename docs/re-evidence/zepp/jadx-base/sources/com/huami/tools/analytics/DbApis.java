package com.huami.tools.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.tools.analytics.internal.utils.Crypto;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
interface DbApis {

    public static class AnonymousDbApi extends BaseDbApi {
        public AnonymousDbApi() {
            super("HmStat-AnonymousDbApi");
        }

        @Override // com.huami.tools.analytics.f
        public void init(@NonNull Context context) {
            this.b = DbHelpers.AnonymousDbHelper.a(context);
        }
    }

    public static abstract class BaseDbApi implements f {
        public String a;
        public SQLiteOpenHelper b;

        public BaseDbApi(String str) {
            this.a = str;
        }

        @Override // com.huami.tools.analytics.f
        public void clearUselessContexts(@NonNull String str) {
        }

        @Override // com.huami.tools.analytics.f
        public void deleteEvents(@NonNull List<Event> list) {
            int iF = DbUtils.f(this.b.getWritableDatabase(), list);
            if (iF == list.size()) {
                p.b().d(this.a, String.format(Locale.CHINA, "成功删除了%d条记录", Integer.valueOf(iF)));
            } else {
                p.b().w(this.a, String.format(Locale.CHINA, "想要删除%d条记录，但实际删除了%d条记录", Integer.valueOf(list.size()), Integer.valueOf(iF)));
            }
        }

        @Override // com.huami.tools.analytics.f
        public boolean hasContext(@Nullable String str) {
            return DbUtils.g(this.b.getReadableDatabase(), str);
        }

        @Override // com.huami.tools.analytics.f
        public boolean insertContext(@NonNull d dVar) {
            if (dVar.a == null) {
                dVar.a = Crypto.getDigestOrRandomId(dVar.a());
            }
            try {
                if (DbUtils.h(this.b.getWritableDatabase(), dVar) > 0) {
                    p.b().v(this.a, String.format(Locale.CHINA, "上下文数据保存成功, %s", dVar));
                    return true;
                }
                p.b().w(this.a, String.format(Locale.CHINA, "上下文数据保存失败, %s", dVar));
                return false;
            } catch (Exception e) {
                p.b().w(this.a, e, String.format(Locale.CHINA, "上下文数据保存失败, %s", dVar));
                return false;
            }
        }

        @Override // com.huami.tools.analytics.f
        public void insertEvent(@NonNull Event event) {
            try {
                if (DbUtils.i(this.b.getWritableDatabase(), event) > 0) {
                    p.b().v(this.a, String.format(Locale.CHINA, "事件保存成功（%s）", event));
                } else {
                    p.b().w(this.a, String.format(Locale.CHINA, "事件保存失败（%s）", event));
                }
            } catch (Exception e) {
                p.b().w(this.a, e, String.format(Locale.CHINA, "事件保存失败（%s）", event));
            }
        }

        @Override // com.huami.tools.analytics.f
        @Nullable
        public d queryContext(@Nullable String str) {
            return DbUtils.k(this.b.getReadableDatabase(), str);
        }

        @Override // com.huami.tools.analytics.f
        @NonNull
        public List<Event> queryEvents() {
            return DbUtils.l(this.b.getReadableDatabase());
        }
    }

    public static class IdentifiedDbApi extends BaseDbApi {
        public IdentifiedDbApi() {
            super("HmStat-IdentifiedDbApi");
        }

        @Override // com.huami.tools.analytics.f
        public void init(@NonNull Context context) {
            this.b = DbHelpers.IdentifiedDbHelper.a(context);
        }
    }
}
