package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ConfigOverride {
    protected JsonFormat.c _format;
    protected JsonIgnoreProperties.b _ignorals;
    protected JsonInclude.b _include;
    protected JsonInclude.b _includeAsProperty;
    protected Boolean _isIgnoredType;
    protected Boolean _mergeable;
    protected JsonSetter.e _setterInfo;
    protected JsonAutoDetect.d _visibility;

    public ConfigOverride() {
    }

    protected ConfigOverride(ConfigOverride configOverride) {
        this._format = configOverride._format;
        this._include = configOverride._include;
        this._includeAsProperty = configOverride._includeAsProperty;
        this._ignorals = configOverride._ignorals;
        this._setterInfo = configOverride._setterInfo;
        this._visibility = configOverride._visibility;
        this._isIgnoredType = configOverride._isIgnoredType;
        this._mergeable = configOverride._mergeable;
    }

    public static ConfigOverride empty() {
        return b.f4100c;
    }

    public JsonFormat.c getFormat() {
        return this._format;
    }

    public JsonInclude.b getInclude() {
        return this._include;
    }

    public JsonInclude.b getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public JsonIgnoreProperties.b getIgnorals() {
        return this._ignorals;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public JsonSetter.e getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.d getVisibility() {
        return this._visibility;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    static final class b extends ConfigOverride {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f4100c = new b();

        private b() {
        }
    }
}
