package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import defpackage.zj;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    public abstract void assign(Object obj) throws IOException;

    protected PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }

    public static final class d extends PropertyValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SettableBeanProperty f4122a;

        public d(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this.f4122a = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) throws IOException {
            this.f4122a.set(obj, this.value);
        }
    }

    public static final class a extends PropertyValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final zj f4119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f4120b;

        public a(PropertyValue propertyValue, Object obj, zj zjVar, String str) {
            super(propertyValue, obj);
            this.f4119a = zjVar;
            this.f4120b = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) throws IOException {
            this.f4119a.d(obj, this.f4120b, this.value);
        }
    }

    public static final class b extends PropertyValue {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f4121b;

        public b(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this.f4121b = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) throws IOException {
            ((Map) obj).put(this.f4121b, this.value);
        }
    }
}
