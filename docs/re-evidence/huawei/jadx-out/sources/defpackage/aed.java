package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class aed implements KeyDeserializers, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HashMap<ahd, KeyDeserializer> f319c = null;

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public KeyDeserializer findKeyDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) {
        HashMap<ahd, KeyDeserializer> map = this.f319c;
        if (map == null) {
            return null;
        }
        return map.get(new ahd(javaType.getRawClass()));
    }
}
