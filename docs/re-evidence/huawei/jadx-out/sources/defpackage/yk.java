package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class yk extends JsonFactory {
    private static final long serialVersionUID = -1;

    public yk() {
        this(null);
    }

    public yk(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            d((ObjectCodec) new ObjectMapper(this));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ObjectMapper c() {
        return (ObjectMapper) this.l;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory, com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        return "JSON";
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public MatchStrength a(InputAccessor inputAccessor) throws IOException {
        if (getClass() == yk.class) {
            return e(inputAccessor);
        }
        return null;
    }
}
