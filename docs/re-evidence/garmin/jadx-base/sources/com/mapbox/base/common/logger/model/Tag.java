package com.mapbox.base.common.logger.model;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/base/common/logger/model/Tag;", "", HeaderParameterNames.AUTHENTICATION_TAG, "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Tag {
    private final String tag;

    public Tag(String str) {
        str.getClass();
        this.tag = str;
    }

    public static /* synthetic */ Tag copy$default(Tag tag, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = tag.tag;
        }
        return tag.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final Tag copy(String tag) {
        tag.getClass();
        return new Tag(tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tag) && s.g(this.tag, ((Tag) other).tag);
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.tag.hashCode();
    }

    public String toString() {
        return a0.m(new StringBuilder("Tag(tag="), this.tag, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
