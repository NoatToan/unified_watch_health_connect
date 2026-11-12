package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import java.io.Serializable;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes21.dex */
public final class yt extends MapperConfigBase<SerializationFeature, yt> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final PrettyPrinter f53832b = new DefaultPrettyPrinter();
    private static final int i = collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final FilterProvider f53833a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f53834c;
    protected final int d;
    protected final PrettyPrinter e;
    protected final int f;
    protected final int g;
    protected final int j;

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* synthetic */ MapperConfigBase withView(Class cls) {
        return e((Class<?>) cls);
    }

    public yt(yy yyVar, SubtypeResolver subtypeResolver, ada adaVar, aie aieVar, yw ywVar) {
        super(yyVar, subtypeResolver, adaVar, aieVar, ywVar);
        this.f = i;
        this.f53833a = null;
        this.e = f53832b;
        this.j = 0;
        this.g = 0;
        this.d = 0;
        this.f53834c = 0;
    }

    private yt(yt ytVar, SubtypeResolver subtypeResolver) {
        super(ytVar, subtypeResolver);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    private yt(yt ytVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(ytVar, i2);
        this.f = i3;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = i4;
        this.g = i5;
        this.d = i6;
        this.f53834c = i7;
    }

    private yt(yt ytVar, yy yyVar) {
        super(ytVar, yyVar);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    private yt(yt ytVar, FilterProvider filterProvider) {
        super(ytVar);
        this.f = ytVar.f;
        this.f53833a = filterProvider;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    private yt(yt ytVar, Class<?> cls) {
        super(ytVar, cls);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    private yt(yt ytVar, ys ysVar) {
        super(ytVar, ysVar);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    protected yt(yt ytVar, ContextAttributes contextAttributes) {
        super(ytVar, contextAttributes);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = ytVar.e;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    protected yt(yt ytVar, PrettyPrinter prettyPrinter) {
        super(ytVar);
        this.f = ytVar.f;
        this.f53833a = ytVar.f53833a;
        this.e = prettyPrinter;
        this.j = ytVar.j;
        this.g = ytVar.g;
        this.d = ytVar.d;
        this.f53834c = ytVar.f53834c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yt _withBase(yy yyVar) {
        return this._base == yyVar ? this : new yt(this, yyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yt _withMapperFeatures(int i2) {
        return new yt(this, i2, this.f, this.j, this.g, this.d, this.f53834c);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yt withRootName(ys ysVar) {
        return (ysVar != null ? !ysVar.equals(this._rootName) : this._rootName != null) ? new yt(this, ysVar) : this;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yt with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new yt(this, subtypeResolver);
    }

    public yt e(Class<?> cls) {
        return this._view == cls ? this : new yt(this, cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public yt with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new yt(this, contextAttributes);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yt with(DateFormat dateFormat) {
        yt ytVar = (yt) super.with(dateFormat);
        if (dateFormat == null) {
            return ytVar.c(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return ytVar.b(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public yt c(SerializationFeature serializationFeature) {
        int mask = this.f | serializationFeature.getMask();
        return mask == this.f ? this : new yt(this, this._mapperFeatures, mask, this.j, this.g, this.d, this.f53834c);
    }

    public yt b(SerializationFeature serializationFeature) {
        int i2 = this.f & (~serializationFeature.getMask());
        return i2 == this.f ? this : new yt(this, this._mapperFeatures, i2, this.j, this.g, this.d, this.f53834c);
    }

    public yt e(JsonGenerator.Feature feature) {
        int i2 = this.j & (~feature.getMask());
        int mask = this.g | feature.getMask();
        return (this.j == i2 && this.g == mask) ? this : new yt(this, this._mapperFeatures, this.f, i2, mask, this.d, this.f53834c);
    }

    public yt b(FilterProvider filterProvider) {
        return filterProvider == this.f53833a ? this : new yt(this, filterProvider);
    }

    public yt b(PrettyPrinter prettyPrinter) {
        return this.e == prettyPrinter ? this : new yt(this, prettyPrinter);
    }

    public PrettyPrinter e() {
        PrettyPrinter prettyPrinter = this.e;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    public void b(JsonGenerator jsonGenerator) {
        PrettyPrinter prettyPrinterE;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this.f) && jsonGenerator.getPrettyPrinter() == null && (prettyPrinterE = e()) != null) {
            jsonGenerator.setPrettyPrinter(prettyPrinterE);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f);
        int i2 = this.g;
        if (i2 != 0 || zEnabledIn) {
            int i3 = this.j;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i3 |= mask;
                i2 |= mask;
            }
            jsonGenerator.overrideStdFeatures(i3, i2);
        }
        int i4 = this.f53834c;
        if (i4 != 0) {
            jsonGenerator.overrideFormatFeatures(this.d, i4);
        }
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        if (this._rootName != null) {
            return !this._rootName.a();
        }
        return a(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public final boolean a(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this.f) != 0;
    }

    public final boolean e(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this.g) != 0) {
            return (feature.getMask() & this.j) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public final boolean c(int i2) {
        return (this.f & i2) == i2;
    }

    public FilterProvider a() {
        return this.f53833a;
    }

    public PrettyPrinter b() {
        return this.e;
    }

    public BeanDescription d(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }
}
