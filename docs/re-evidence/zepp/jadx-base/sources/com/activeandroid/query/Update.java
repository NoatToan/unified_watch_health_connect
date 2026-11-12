package com.activeandroid.query;

import com.activeandroid.Cache;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes2.dex */
public final class Update implements Sqlable {
    private Class<? extends Model> mType;

    public Update(Class<? extends Model> cls) {
        this.mType = cls;
    }

    public Class<? extends Model> getType() {
        return this.mType;
    }

    public Set set(String str) {
        return new Set(this, str);
    }

    @Override // com.activeandroid.query.Sqlable
    public String toSql() {
        return "UPDATE " + Cache.getTableName(this.mType) + " ";
    }

    public Set set(String str, Object... objArr) {
        return new Set(this, str, objArr);
    }
}
