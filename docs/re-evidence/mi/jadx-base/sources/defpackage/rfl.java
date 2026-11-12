package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface rfl {
    zsd getSchema(wwl wwlVar, Type type) throws JsonMappingException;

    zsd getSchema(wwl wwlVar, Type type, boolean z) throws JsonMappingException;
}
