package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class SecondaryScreen {

    @SerializedName("secondaryscreen")
    @Expose
    private List<SecondaryScreenItem> secondaryscreen = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SecondaryScreen)) {
            return false;
        }
        List<SecondaryScreenItem> list = this.secondaryscreen;
        List<SecondaryScreenItem> list2 = ((SecondaryScreen) obj).secondaryscreen;
        if (list != list2) {
            return list != null && list.equals(list2);
        }
        return true;
    }

    public List<SecondaryScreenItem> getSecondaryscreen() {
        return this.secondaryscreen;
    }

    public int hashCode() {
        List<SecondaryScreenItem> list = this.secondaryscreen;
        return 31 + (list == null ? 0 : list.hashCode());
    }

    public void setSecondaryscreen(List<SecondaryScreenItem> list) {
        this.secondaryscreen = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecondaryScreen.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("secondaryscreen");
        sb.append('=');
        Object obj = this.secondaryscreen;
        if (obj == null) {
            obj = "<null>";
        }
        sb.append(obj);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
