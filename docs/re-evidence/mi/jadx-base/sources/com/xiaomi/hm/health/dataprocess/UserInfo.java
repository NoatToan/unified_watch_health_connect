package com.xiaomi.hm.health.dataprocess;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class UserInfo {
    public int gender = 1;
    public int height = 172;
    public float weight = 65.0f;
    public int goal = 8000;
    public int age = 28;

    public String toString() {
        return "UserInfo{gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", goal=" + this.goal + ", age=" + this.age + AbstractJsonLexerKt.END_OBJ;
    }
}
