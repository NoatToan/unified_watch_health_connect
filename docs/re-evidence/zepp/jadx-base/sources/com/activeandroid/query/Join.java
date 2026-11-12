package com.activeandroid.query;

import android.text.TextUtils;
import com.activeandroid.Cache;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes2.dex */
public final class Join implements Sqlable {
    private String mAlias;
    private From mFrom;
    private JoinType mJoinType;
    private String mOn;
    private Class<? extends Model> mType;
    private String[] mUsing;

    public enum JoinType {
        LEFT,
        OUTER,
        INNER,
        CROSS
    }

    public Join(From from, Class<? extends Model> cls, JoinType joinType) {
        this.mFrom = from;
        this.mType = cls;
        this.mJoinType = joinType;
    }

    public Join as(String str) {
        this.mAlias = str;
        return this;
    }

    public From on(String str) {
        this.mOn = str;
        return this.mFrom;
    }

    @Override // com.activeandroid.query.Sqlable
    public String toSql() {
        StringBuilder sb = new StringBuilder();
        JoinType joinType = this.mJoinType;
        if (joinType != null) {
            sb.append(joinType.toString());
            sb.append(" ");
        }
        sb.append("JOIN ");
        sb.append(Cache.getTableName(this.mType));
        sb.append(" ");
        if (this.mAlias != null) {
            sb.append("AS ");
            sb.append(this.mAlias);
            sb.append(" ");
        }
        if (this.mOn != null) {
            sb.append("ON ");
            sb.append(this.mOn);
            sb.append(" ");
        } else if (this.mUsing != null) {
            sb.append("USING (");
            sb.append(TextUtils.join(", ", this.mUsing));
            sb.append(") ");
        }
        return sb.toString();
    }

    public From using(String... strArr) {
        this.mUsing = strArr;
        return this.mFrom;
    }

    public From on(String str, Object... objArr) {
        this.mOn = str;
        this.mFrom.addArguments(objArr);
        return this.mFrom;
    }
}
