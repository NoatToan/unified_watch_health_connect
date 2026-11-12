package defpackage;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kc4 {
    protected JsonFormat.Value _format;
    protected JsonIgnoreProperties.Value _ignorals;
    protected JsonInclude.Value _include;
    protected JsonInclude.Value _includeAsProperty;
    protected Boolean _isIgnoredType;
    protected Boolean _mergeable;
    protected JsonSetter.Value _setterInfo;
    protected JsonAutoDetect.Value _visibility;

    public static final class a extends kc4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23707a = new a();
    }

    public kc4() {
    }

    public kc4(kc4 kc4Var) {
        this._format = kc4Var._format;
        this._include = kc4Var._include;
        this._includeAsProperty = kc4Var._includeAsProperty;
        this._ignorals = kc4Var._ignorals;
        this._setterInfo = kc4Var._setterInfo;
        this._visibility = kc4Var._visibility;
        this._isIgnoredType = kc4Var._isIgnoredType;
        this._mergeable = kc4Var._mergeable;
    }

    public static kc4 empty() {
        return a.f23707a;
    }

    public JsonFormat.Value getFormat() {
        return this._format;
    }

    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    public JsonInclude.Value getInclude() {
        return this._include;
    }

    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }
}
