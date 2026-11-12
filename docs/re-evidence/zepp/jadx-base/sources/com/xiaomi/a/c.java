package com.xiaomi.a;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

/* JADX INFO: loaded from: classes18.dex */
public class c extends Module {
    public boolean a = false;

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public String getModuleName() {
        return "Jdk8Module";
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.Module
    public void setupModule(Module.SetupContext setupContext) {
        setupContext.addSerializers(new e());
        setupContext.addDeserializers(new b());
        setupContext.addTypeModifier(new f());
        if (this.a) {
            setupContext.addBeanSerializerModifier(new a());
        }
    }

    @Override // com.fasterxml.jackson.databind.Module, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return j.a;
    }
}
