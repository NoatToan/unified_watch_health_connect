/*!
 * @zeppos-js-framework
 * project mobile-main-service
 * version v1.0.7
 * build-date 2021-09-01T11:01:24.533Z
 * commit 3b80ccc
 * (c) 2020-2021 huangtao1@zepp.com
 */
(function () {
    'use strict';

    /*! *****************************************************************************
    Copyright (c) Microsoft Corporation.

    Permission to use, copy, modify, and/or distribute this software for any
    purpose with or without fee is hereby granted.

    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
    REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
    AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
    INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
    LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
    OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
    PERFORMANCE OF THIS SOFTWARE.
    ***************************************************************************** */

    function __awaiter(thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    }

    (function () {
        // Get a handle on the global object
        let local;
        if (typeof globalThis !== 'undefined')
            local = globalThis;
        else if (typeof window !== 'undefined' && window.document)
            local = window;
        else
            local = self;
        // It's replaced unconditionally to preserve the expected behavior
        // in programs even if there's ever a native finally.
        if (!local.Promise.prototype.finally) {
            local.Promise.prototype['finally'] = function finallyPolyfill(callback) {
                const constructor = this.constructor;
                return this.then(function (value) {
                    return constructor.resolve(callback()).then(function () {
                        return value;
                    });
                }, function (reason) {
                    return constructor.resolve(callback()).then(function () {
                        throw reason;
                    });
                });
            };
        }
    })();

    const JSON_RPC_VERSION = 'hmV1.0';
    function JsonRpcId(id) {
        return id;
    }
    // 'ParseError' | 'InvalidRequest' | 'MethodNotFound' | 'InvalidParams' | 'InternalError,
    const JsonRpcError = {
        ParseError: {
            code: -32700,
            message: 'Parse error',
        },
        InvalidRequest: {
            code: -32600,
            message: 'Invalid Request',
        },
        MethodNotFound: {
            code: -32601,
            message: 'Method not found',
        },
        InvalidParams: {
            code: -32602,
            message: 'Invalid params',
        },
        InternalError: {
            code: -32603,
            message: 'Internal error',
        },
    };

    class JsonRpcRequestBuilder {
        constructor() {
            this.jsonrpc = JSON_RPC_VERSION;
        }
        setId(id) {
            return Object.assign(this, { id });
        }
        setMethod(method) {
            return Object.assign(this, { method });
        }
        setParams(params) {
            return Object.assign(this, { params });
        }
        build() {
            return this;
        }
    }
    class JsonRpcRequestNotifyBuilder {
        constructor() {
            this.jsonrpc = JSON_RPC_VERSION;
        }
        setMethod(method) {
            return Object.assign(this, { method });
        }
        setParams(params) {
            return Object.assign(this, { params });
        }
        build() {
            return this;
        }
    }
    class JsonRpcResponseBuilder {
        constructor() {
            this.jsonrpc = JSON_RPC_VERSION;
        }
        setId(id) {
            return Object.assign(this, { id });
        }
        setResult(result) {
            return Object.assign(this, { result });
        }
        build() {
            return this;
        }
    }
    class JsonRpcResponseErrorBuilder {
        constructor() {
            this.jsonrpc = JSON_RPC_VERSION;
            this.id = null;
        }
        setError(error) {
            return Object.assign(this, { error });
        }
        build() {
            return this;
        }
    }
    class JsonRpcErrorBuilder {
        setCode(code) {
            return Object.assign(this, { code });
        }
        setMessage(message) {
            return Object.assign(this, { message });
        }
        setData(data) {
            return Object.assign(this, { data });
        }
        build() {
            return this;
        }
    }
    JsonRpcErrorBuilder.ERROR = JsonRpcError;
    function generateUUID() {
        return new Array(4)
            .fill(0)
            .map(() => Math.floor(Math.random() * Number.MAX_SAFE_INTEGER).toString(16))
            .join('-');
    }
    function isJsonRequest(msg) {
        return msg.jsonrpc === JSON_RPC_VERSION && 'method' in msg;
    }
    function isJsonRpcRequestMessage(msg) {
        return isJsonRequest(msg) && 'id' in msg;
    }
    function isJsonRpcRequestNotify(msg) {
        return isJsonRequest(msg) && !('id' in msg);
    }
    function isJsonResponseSuccess(res) {
        return res.jsonrpc === JSON_RPC_VERSION && 'result' in res;
    }
    function isJsonResponseError(res) {
        return res.jsonrpc === JSON_RPC_VERSION && 'error' in res;
    }

    function funcToSource(fn, sourcemapArg) {
        var sourcemap = sourcemapArg === undefined ? null : sourcemapArg;
        var source = fn.toString();
        var lines = source.split('\n');
        lines.pop();
        lines.shift();
        var blankPrefixLength = lines[0].search(/\S/);
        var regex = /(['"])__worker_loader_strict__(['"])/g;
        for (var i = 0, n = lines.length; i < n; ++i) {
            lines[i] = lines[i].substring(blankPrefixLength).replace(regex, '$1use strict$2') + '\n';
        }
        if (sourcemap) {
            lines.push('\/\/# sourceMappingURL=' + sourcemap + '\n');
        }
        return lines;
    }

    function createURL(fn, sourcemapArg) {
        var lines = funcToSource(fn, sourcemapArg);
        var blob = new Blob(lines, { type: 'application/javascript' });
        return URL.createObjectURL(blob);
    }

    function createInlineWorkerFactory(fn, sourcemapArg) {
        var url;
        return function WorkerFactory(options) {
            url = url || createURL(fn, sourcemapArg);
            return new Worker(url, options);
        };
    }

    var WorkerFactory = createInlineWorkerFactory(/* rollup-plugin-web-worker-loader */function () {
    ((function (exports) {
        '__worker_loader_strict__';

        /*! *****************************************************************************
        Copyright (c) Microsoft Corporation.

        Permission to use, copy, modify, and/or distribute this software for any
        purpose with or without fee is hereby granted.

        THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
        REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
        AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
        INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
        LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
        OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
        PERFORMANCE OF THIS SOFTWARE.
        ***************************************************************************** */

        function __awaiter(thisArg, _arguments, P, generator) {
            function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
            return new (P || (P = Promise))(function (resolve, reject) {
                function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
                function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
                function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
                step((generator = generator.apply(thisArg, _arguments || [])).next());
            });
        }

        (function () {
            // Get a handle on the global object
            let local;
            if (typeof globalThis !== 'undefined')
                local = globalThis;
            else if (typeof window !== 'undefined' && window.document)
                local = window;
            else
                local = self;
            // It's replaced unconditionally to preserve the expected behavior
            // in programs even if there's ever a native finally.
            if (!local.Promise.prototype.finally) {
                local.Promise.prototype['finally'] = function finallyPolyfill(callback) {
                    const constructor = this.constructor;
                    return this.then(function (value) {
                        return constructor.resolve(callback()).then(function () {
                            return value;
                        });
                    }, function (reason) {
                        return constructor.resolve(callback()).then(function () {
                            throw reason;
                        });
                    });
                };
            }
        })();

        const JSON_RPC_VERSION = 'hmV1.0';
        function JsonRpcId(id) {
            return id;
        }
        // 'ParseError' | 'InvalidRequest' | 'MethodNotFound' | 'InvalidParams' | 'InternalError,
        const JsonRpcError = {
            ParseError: {
                code: -32700,
                message: 'Parse error',
            },
            InvalidRequest: {
                code: -32600,
                message: 'Invalid Request',
            },
            MethodNotFound: {
                code: -32601,
                message: 'Method not found',
            },
            InvalidParams: {
                code: -32602,
                message: 'Invalid params',
            },
            InternalError: {
                code: -32603,
                message: 'Internal error',
            },
        };

        class JsonRpcRequestBuilder {
            constructor() {
                this.jsonrpc = JSON_RPC_VERSION;
            }
            setId(id) {
                return Object.assign(this, { id });
            }
            setMethod(method) {
                return Object.assign(this, { method });
            }
            setParams(params) {
                return Object.assign(this, { params });
            }
            build() {
                return this;
            }
        }
        class JsonRpcRequestNotifyBuilder {
            constructor() {
                this.jsonrpc = JSON_RPC_VERSION;
            }
            setMethod(method) {
                return Object.assign(this, { method });
            }
            setParams(params) {
                return Object.assign(this, { params });
            }
            build() {
                return this;
            }
        }
        class JsonRpcResponseBuilder {
            constructor() {
                this.jsonrpc = JSON_RPC_VERSION;
            }
            setId(id) {
                return Object.assign(this, { id });
            }
            setResult(result) {
                return Object.assign(this, { result });
            }
            build() {
                return this;
            }
        }
        class JsonRpcResponseErrorBuilder {
            constructor() {
                this.jsonrpc = JSON_RPC_VERSION;
                this.id = null;
            }
            setError(error) {
                return Object.assign(this, { error });
            }
            build() {
                return this;
            }
        }
        class JsonRpcErrorBuilder {
            setCode(code) {
                return Object.assign(this, { code });
            }
            setMessage(message) {
                return Object.assign(this, { message });
            }
            setData(data) {
                return Object.assign(this, { data });
            }
            build() {
                return this;
            }
        }
        JsonRpcErrorBuilder.ERROR = JsonRpcError;
        function generateUUID() {
            return new Array(4)
                .fill(0)
                .map(() => Math.floor(Math.random() * Number.MAX_SAFE_INTEGER).toString(16))
                .join('-');
        }
        function isJsonRequest(msg) {
            return msg.jsonrpc === JSON_RPC_VERSION && 'method' in msg;
        }
        function isJsonRpcRequestMessage(msg) {
            return isJsonRequest(msg) && 'id' in msg;
        }
        function isJsonRpcRequestNotify(msg) {
            return isJsonRequest(msg) && !('id' in msg);
        }
        function isJsonResponseSuccess(res) {
            return res.jsonrpc === JSON_RPC_VERSION && 'result' in res;
        }
        function isJsonResponseError(res) {
            return res.jsonrpc === JSON_RPC_VERSION && 'error' in res;
        }

        function isObject$4(arg) {
            return typeof arg === 'object' && arg !== null;
        }
        function isNull(arg) {
            return arg === null;
        }
        function inspect(x) {
            try {
                return JSON.stringify(x);
            }
            catch (_) {
                return '[Circular]';
            }
        }
        const formatRegExp = /%[sdj%]/g;
        function format(f, ...args) {
            let i = 0;
            const len = args.length;
            let str = String(f).replace(formatRegExp, function (x) {
                if (x === '%%')
                    return '%';
                if (i >= len)
                    return x;
                switch (x) {
                    case '%s':
                        return String(args[i++]);
                    case '%d':
                        return Number(args[i++]).toString();
                    case '%j':
                        try {
                            return JSON.stringify(args[i++]);
                        }
                        catch (_) {
                            return '[Circular]';
                        }
                    default:
                        return x;
                }
            });
            for (let x = args[i]; i < len; x = args[++i]) {
                if (isNull(x) || !isObject$4(x)) {
                    str += ' ' + x;
                }
                else {
                    str += ' ' + inspect(x);
                }
            }
            return str;
        }
        function printf(f, ...args) {
            console.log(format(f, ...args));
        }
        function sprintf(f, ...args) {
            return format(f, ...args);
        }

        function gettextFactory(langTable, currentLang, defaultLang) {
            let msgTable = langTable[currentLang.getLang()] || langTable[defaultLang] || {};
            function gettext(msgId, ...args) {
                return format(msgTable[msgId] || msgId, ...args);
            }
            gettext.locale = function (locale) {
                currentLang.setLang(locale);
                msgTable = langTable[currentLang.getLang()] || langTable[defaultLang] || {};
            };
            return gettext;
        }

        var LANGUAGE_TABLE;
        (function (LANGUAGE_TABLE) {
            LANGUAGE_TABLE[LANGUAGE_TABLE["zh-CN"] = 0] = "zh-CN";
            LANGUAGE_TABLE[LANGUAGE_TABLE["zh-TW"] = 1] = "zh-TW";
            LANGUAGE_TABLE[LANGUAGE_TABLE["en-US"] = 2] = "en-US";
            LANGUAGE_TABLE[LANGUAGE_TABLE["es-ES"] = 3] = "es-ES";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ru-RU"] = 4] = "ru-RU";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ko-KR"] = 5] = "ko-KR";
            LANGUAGE_TABLE[LANGUAGE_TABLE["fr-FR"] = 6] = "fr-FR";
            LANGUAGE_TABLE[LANGUAGE_TABLE["de-DE"] = 7] = "de-DE";
            LANGUAGE_TABLE[LANGUAGE_TABLE["id-ID"] = 8] = "id-ID";
            LANGUAGE_TABLE[LANGUAGE_TABLE["pl-PL"] = 9] = "pl-PL";
            LANGUAGE_TABLE[LANGUAGE_TABLE["it-IT"] = 10] = "it-IT";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ja-JP"] = 11] = "ja-JP";
            LANGUAGE_TABLE[LANGUAGE_TABLE["th-TH"] = 12] = "th-TH";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ar-EG"] = 13] = "ar-EG";
            LANGUAGE_TABLE[LANGUAGE_TABLE["vi"] = 14] = "vi";
            LANGUAGE_TABLE[LANGUAGE_TABLE["pt"] = 15] = "pt";
            LANGUAGE_TABLE[LANGUAGE_TABLE["nl"] = 16] = "nl";
            LANGUAGE_TABLE[LANGUAGE_TABLE["tr-TR"] = 17] = "tr-TR";
            LANGUAGE_TABLE[LANGUAGE_TABLE["uk"] = 18] = "uk";
            LANGUAGE_TABLE[LANGUAGE_TABLE["he"] = 19] = "he";
            LANGUAGE_TABLE[LANGUAGE_TABLE["pt-BR"] = 20] = "pt-BR";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ro"] = 21] = "ro";
            LANGUAGE_TABLE[LANGUAGE_TABLE["cs"] = 22] = "cs";
            LANGUAGE_TABLE[LANGUAGE_TABLE["el"] = 23] = "el";
            LANGUAGE_TABLE[LANGUAGE_TABLE["sr"] = 24] = "sr";
            LANGUAGE_TABLE[LANGUAGE_TABLE["ca-ES"] = 25] = "ca-ES";
        })(LANGUAGE_TABLE || (LANGUAGE_TABLE = {}));
        class Lang {
            constructor(lang) {
                this.lang = lang;
            }
            getLang() {
                return this.lang;
            }
            setLang(lang) {
                this.lang = lang;
                return this;
            }
        }
        function getDeviceLanguage() {
            const language = hmSetting.getLanguage();
            return LANGUAGE_TABLE[language];
        }
        function getSideLanguage(userSettings) {
            return userSettings.lang;
        }
        function getLanguage(setting) {
            if (setting) {
                return getSideLanguage(setting);
            }
            else {
                return getDeviceLanguage();
            }
        }

        class EventBus$1 {
            constructor() {
                this._events = new Map();
            }
            on(event, fn) {
                var _a;
                if (this._events.has(event)) {
                    (_a = this._events.get(event)) === null || _a === void 0 ? void 0 : _a.push(fn);
                }
                else {
                    this._events.set(event, [fn]);
                }
                return this;
            }
            once(event, fn) {
                const on = (...args) => {
                    this.off(event, on);
                    fn(...args);
                };
                this.on(event, on);
                return this;
            }
            off(event, fn) {
                if (event) {
                    if (fn) {
                        const cbs = this._events.get(event);
                        if (!cbs)
                            return this;
                        const index = cbs.lastIndexOf((i) => i === fn);
                        if (index >= 0) {
                            cbs.splice(index, 1);
                        }
                    }
                    else {
                        this._events.delete(event);
                    }
                }
                else {
                    this._events.clear();
                }
                return this;
            }
            emit(event, ...args) {
                var _a;
                for (const fn of (_a = this._events.get(event.toLowerCase())) !== null && _a !== void 0 ? _a : []) {
                    fn && fn(...args);
                }
                return this;
            }
            count(event) {
                var _a, _b;
                if (event) {
                    return (_b = (_a = this._events.get(event)) === null || _a === void 0 ? void 0 : _a.length) !== null && _b !== void 0 ? _b : 0;
                }
                return this._events.size;
            }
        }

        function isHmAppDefined() {
            return typeof hmApp !== 'undefined';
        }

        const log1 = (level, ...args) => {
            console.log(args.join(' '));
        };
        const log2 = (level, ...args) => {
            var _a, _b;
            (_b = (_a = console)[level]) === null || _b === void 0 ? void 0 : _b.call(_a, args.join(' '));
        };
        const consoleLog = isHmAppDefined() ? log1 : log2;
        function now() {
            let now = new Date();
            const offset = now.getTimezoneOffset();
            now = new Date(now.getTime() - offset * 60 * 1000);
            return now.toISOString();
        }
        const levels = {
            all: Number.MIN_VALUE,
            log: 1,
            debug: 2,
            info: 3,
            warn: 4,
            error: 5,
            off: Number.MAX_VALUE,
        };
        class Logger {
            constructor(name, level, logOut) {
                this.prefix = '';
                this.appId = -1;
                this.tag = '-';
                this.levels = levels;
                this.eventBus = new EventBus$1();
                this.line = 1;
                this._loggerMap = {};
                this.name = name;
                this._level = level;
                this._log = logOut;
            }
            getLogger(name) {
                let logger = this._loggerMap[name];
                if (!logger) {
                    logger = this._loggerMap[name] = new Logger(name, this._level, this._log);
                    logger.prefix = this.prefix;
                    logger.eventBus = this.eventBus;
                }
                return logger;
            }
            set level(level) {
                this._level = level;
                Object.values(this._loggerMap).forEach((l) => (l.level = level));
            }
            get level() {
                return this._level;
            }
            static getLogger(name, level = levels.all, logOut = consoleLog) {
                return new Logger(name, level, logOut);
            }
            stdout(level, ...args) {
                if (this.level > levels[level.toLowerCase()])
                    return;
                const str = args.join(' ');
                this.eventBus.emit('log', {
                    level,
                    appId: this.appId,
                    data: { prefix: this.prefix, name: this.name, tag: this.tag, log: str },
                });
                this._log(level, str);
            }
            // 固件日志传输日志
            connect(logger) {
                this.on('log', (data) => {
                    logger.log(JSON.stringify(data));
                });
            }
            on(event, fn) {
                this.eventBus.on(event, fn);
            }
            off(event, fn) {
                this.eventBus.off(event, fn);
            }
            formatLog(level, f, ...args) {
                const strs = [
                    // `${this.line++}`,
                    `[${now()}]`,
                    `[jsfwk.${level.padEnd(5, ' ')}]`,
                    `[${this.name}]`,
                    `[${this.tag}]`,
                    format(f, ...args),
                ];
                if (this.prefix) {
                    strs.unshift(`[${this.prefix}]`);
                }
                return strs.join(' ');
            }
            info(...args) {
                const [f, ...arg] = args;
                const level = 'info';
                this.stdout(level, this.formatLog(level, f, ...arg));
            }
            error(...args) {
                const [f, ...arg] = args;
                const level = 'error';
                this.stdout(level, this.formatLog(level, f, ...arg));
            }
            debug(...args) {
                const [f, ...arg] = args;
                const level = 'debug';
                this.stdout(level, this.formatLog(level, f, ...arg));
            }
            warn(...args) {
                const [f, ...arg] = args;
                const level = 'warn';
                this.stdout(level, this.formatLog(level, f, ...arg));
            }
            log(...args) {
                const [f, ...arg] = args;
                const level = 'log';
                this.stdout(level, this.formatLog(level, f, ...arg));
            }
        }
        Logger.levels = levels;

        function initProxy(target, ...source) {
            if (!target) {
                throw Error('target not undefined');
            }
            return new Proxy(target, {
                get(target, p) {
                    for (const s of [target, ...source].reverse()) {
                        if (!s)
                            continue;
                        if (p in s)
                            return s[p];
                    }
                },
                set(target, p, value) {
                    target[p] = value;
                    return true;
                },
            });
        }
        //
        function slot(options, context) {
            const onDestroy = options === null || options === void 0 ? void 0 : options.onDestroy;
            options.onDestroy = function () {
                if (typeof onDestroy === 'function') {
                    onDestroy && onDestroy.call(context);
                }
                options === null || options === void 0 ? void 0 : options.__$$clear$$__(context);
            };
            return options;
        }

        var HmUtils = /*#__PURE__*/Object.freeze({
            __proto__: null,
            initProxy: initProxy,
            slot: slot,
            format: format,
            printf: printf,
            sprintf: sprintf,
            gettextFactory: gettextFactory,
            Lang: Lang,
            getDeviceLanguage: getDeviceLanguage,
            getSideLanguage: getSideLanguage,
            getLanguage: getLanguage,
            EventBus: EventBus$1,
            Logger: Logger
        });

        var commonjsGlobal = typeof globalThis !== 'undefined' ? globalThis : typeof window !== 'undefined' ? window : typeof global !== 'undefined' ? global : typeof self !== 'undefined' ? self : {};

        /**
         * Checks if `value` is the
         * [language type](http://www.ecma-international.org/ecma-262/7.0/#sec-ecmascript-language-types)
         * of `Object`. (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
         *
         * @static
         * @memberOf _
         * @since 0.1.0
         * @category Lang
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is an object, else `false`.
         * @example
         *
         * _.isObject({});
         * // => true
         *
         * _.isObject([1, 2, 3]);
         * // => true
         *
         * _.isObject(_.noop);
         * // => true
         *
         * _.isObject(null);
         * // => false
         */

        function isObject$3(value) {
          var type = typeof value;
          return value != null && (type == 'object' || type == 'function');
        }

        var isObject_1 = isObject$3;

        var isObject$2 = isObject_1;

        /** Built-in value references. */
        var objectCreate = Object.create;

        /**
         * The base implementation of `_.create` without support for assigning
         * properties to the created object.
         *
         * @private
         * @param {Object} proto The object to inherit from.
         * @returns {Object} Returns the new object.
         */
        var baseCreate$2 = (function() {
          function object() {}
          return function(proto) {
            if (!isObject$2(proto)) {
              return {};
            }
            if (objectCreate) {
              return objectCreate(proto);
            }
            object.prototype = proto;
            var result = new object;
            object.prototype = undefined;
            return result;
          };
        }());

        var _baseCreate = baseCreate$2;

        /**
         * The function whose prototype chain sequence wrappers inherit from.
         *
         * @private
         */

        function baseLodash$3() {
          // No operation performed.
        }

        var _baseLodash = baseLodash$3;

        var baseCreate$1 = _baseCreate,
            baseLodash$2 = _baseLodash;

        /**
         * The base constructor for creating `lodash` wrapper objects.
         *
         * @private
         * @param {*} value The value to wrap.
         * @param {boolean} [chainAll] Enable explicit method chain sequences.
         */
        function LodashWrapper$3(value, chainAll) {
          this.__wrapped__ = value;
          this.__actions__ = [];
          this.__chain__ = !!chainAll;
          this.__index__ = 0;
          this.__values__ = undefined;
        }

        LodashWrapper$3.prototype = baseCreate$1(baseLodash$2.prototype);
        LodashWrapper$3.prototype.constructor = LodashWrapper$3;

        var _LodashWrapper = LodashWrapper$3;

        /**
         * Appends the elements of `values` to `array`.
         *
         * @private
         * @param {Array} array The array to modify.
         * @param {Array} values The values to append.
         * @returns {Array} Returns `array`.
         */

        function arrayPush$1(array, values) {
          var index = -1,
              length = values.length,
              offset = array.length;

          while (++index < length) {
            array[offset + index] = values[index];
          }
          return array;
        }

        var _arrayPush = arrayPush$1;

        /** Detect free variable `global` from Node.js. */

        var freeGlobal$1 = typeof commonjsGlobal == 'object' && commonjsGlobal && commonjsGlobal.Object === Object && commonjsGlobal;

        var _freeGlobal = freeGlobal$1;

        var freeGlobal = _freeGlobal;

        /** Detect free variable `self`. */
        var freeSelf = typeof self == 'object' && self && self.Object === Object && self;

        /** Used as a reference to the global object. */
        var root$3 = freeGlobal || freeSelf || Function('return this')();

        var _root = root$3;

        var root$2 = _root;

        /** Built-in value references. */
        var Symbol$4 = root$2.Symbol;

        var _Symbol = Symbol$4;

        var Symbol$3 = _Symbol;

        /** Used for built-in method references. */
        var objectProto$5 = Object.prototype;

        /** Used to check objects for own properties. */
        var hasOwnProperty$4 = objectProto$5.hasOwnProperty;

        /**
         * Used to resolve the
         * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
         * of values.
         */
        var nativeObjectToString$1 = objectProto$5.toString;

        /** Built-in value references. */
        var symToStringTag$1 = Symbol$3 ? Symbol$3.toStringTag : undefined;

        /**
         * A specialized version of `baseGetTag` which ignores `Symbol.toStringTag` values.
         *
         * @private
         * @param {*} value The value to query.
         * @returns {string} Returns the raw `toStringTag`.
         */
        function getRawTag$1(value) {
          var isOwn = hasOwnProperty$4.call(value, symToStringTag$1),
              tag = value[symToStringTag$1];

          try {
            value[symToStringTag$1] = undefined;
            var unmasked = true;
          } catch (e) {}

          var result = nativeObjectToString$1.call(value);
          if (unmasked) {
            if (isOwn) {
              value[symToStringTag$1] = tag;
            } else {
              delete value[symToStringTag$1];
            }
          }
          return result;
        }

        var _getRawTag = getRawTag$1;

        /** Used for built-in method references. */

        var objectProto$4 = Object.prototype;

        /**
         * Used to resolve the
         * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
         * of values.
         */
        var nativeObjectToString = objectProto$4.toString;

        /**
         * Converts `value` to a string using `Object.prototype.toString`.
         *
         * @private
         * @param {*} value The value to convert.
         * @returns {string} Returns the converted string.
         */
        function objectToString$1(value) {
          return nativeObjectToString.call(value);
        }

        var _objectToString = objectToString$1;

        var Symbol$2 = _Symbol,
            getRawTag = _getRawTag,
            objectToString = _objectToString;

        /** `Object#toString` result references. */
        var nullTag = '[object Null]',
            undefinedTag = '[object Undefined]';

        /** Built-in value references. */
        var symToStringTag = Symbol$2 ? Symbol$2.toStringTag : undefined;

        /**
         * The base implementation of `getTag` without fallbacks for buggy environments.
         *
         * @private
         * @param {*} value The value to query.
         * @returns {string} Returns the `toStringTag`.
         */
        function baseGetTag$2(value) {
          if (value == null) {
            return value === undefined ? undefinedTag : nullTag;
          }
          return (symToStringTag && symToStringTag in Object(value))
            ? getRawTag(value)
            : objectToString(value);
        }

        var _baseGetTag = baseGetTag$2;

        /**
         * Checks if `value` is object-like. A value is object-like if it's not `null`
         * and has a `typeof` result of "object".
         *
         * @static
         * @memberOf _
         * @since 4.0.0
         * @category Lang
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is object-like, else `false`.
         * @example
         *
         * _.isObjectLike({});
         * // => true
         *
         * _.isObjectLike([1, 2, 3]);
         * // => true
         *
         * _.isObjectLike(_.noop);
         * // => false
         *
         * _.isObjectLike(null);
         * // => false
         */

        function isObjectLike$3(value) {
          return value != null && typeof value == 'object';
        }

        var isObjectLike_1 = isObjectLike$3;

        var baseGetTag$1 = _baseGetTag,
            isObjectLike$2 = isObjectLike_1;

        /** `Object#toString` result references. */
        var argsTag = '[object Arguments]';

        /**
         * The base implementation of `_.isArguments`.
         *
         * @private
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is an `arguments` object,
         */
        function baseIsArguments$1(value) {
          return isObjectLike$2(value) && baseGetTag$1(value) == argsTag;
        }

        var _baseIsArguments = baseIsArguments$1;

        var baseIsArguments = _baseIsArguments,
            isObjectLike$1 = isObjectLike_1;

        /** Used for built-in method references. */
        var objectProto$3 = Object.prototype;

        /** Used to check objects for own properties. */
        var hasOwnProperty$3 = objectProto$3.hasOwnProperty;

        /** Built-in value references. */
        var propertyIsEnumerable = objectProto$3.propertyIsEnumerable;

        /**
         * Checks if `value` is likely an `arguments` object.
         *
         * @static
         * @memberOf _
         * @since 0.1.0
         * @category Lang
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is an `arguments` object,
         *  else `false`.
         * @example
         *
         * _.isArguments(function() { return arguments; }());
         * // => true
         *
         * _.isArguments([1, 2, 3]);
         * // => false
         */
        var isArguments$1 = baseIsArguments(function() { return arguments; }()) ? baseIsArguments : function(value) {
          return isObjectLike$1(value) && hasOwnProperty$3.call(value, 'callee') &&
            !propertyIsEnumerable.call(value, 'callee');
        };

        var isArguments_1 = isArguments$1;

        /**
         * Checks if `value` is classified as an `Array` object.
         *
         * @static
         * @memberOf _
         * @since 0.1.0
         * @category Lang
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is an array, else `false`.
         * @example
         *
         * _.isArray([1, 2, 3]);
         * // => true
         *
         * _.isArray(document.body.children);
         * // => false
         *
         * _.isArray('abc');
         * // => false
         *
         * _.isArray(_.noop);
         * // => false
         */

        var isArray$3 = Array.isArray;

        var isArray_1 = isArray$3;

        var Symbol$1 = _Symbol,
            isArguments = isArguments_1,
            isArray$2 = isArray_1;

        /** Built-in value references. */
        var spreadableSymbol = Symbol$1 ? Symbol$1.isConcatSpreadable : undefined;

        /**
         * Checks if `value` is a flattenable `arguments` object or array.
         *
         * @private
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is flattenable, else `false`.
         */
        function isFlattenable$1(value) {
          return isArray$2(value) || isArguments(value) ||
            !!(spreadableSymbol && value && value[spreadableSymbol]);
        }

        var _isFlattenable = isFlattenable$1;

        var arrayPush = _arrayPush,
            isFlattenable = _isFlattenable;

        /**
         * The base implementation of `_.flatten` with support for restricting flattening.
         *
         * @private
         * @param {Array} array The array to flatten.
         * @param {number} depth The maximum recursion depth.
         * @param {boolean} [predicate=isFlattenable] The function invoked per iteration.
         * @param {boolean} [isStrict] Restrict to values that pass `predicate` checks.
         * @param {Array} [result=[]] The initial result value.
         * @returns {Array} Returns the new flattened array.
         */
        function baseFlatten$1(array, depth, predicate, isStrict, result) {
          var index = -1,
              length = array.length;

          predicate || (predicate = isFlattenable);
          result || (result = []);

          while (++index < length) {
            var value = array[index];
            if (depth > 0 && predicate(value)) {
              if (depth > 1) {
                // Recursively flatten arrays (susceptible to call stack limits).
                baseFlatten$1(value, depth - 1, predicate, isStrict, result);
              } else {
                arrayPush(result, value);
              }
            } else if (!isStrict) {
              result[result.length] = value;
            }
          }
          return result;
        }

        var _baseFlatten = baseFlatten$1;

        var baseFlatten = _baseFlatten;

        /**
         * Flattens `array` a single level deep.
         *
         * @static
         * @memberOf _
         * @since 0.1.0
         * @category Array
         * @param {Array} array The array to flatten.
         * @returns {Array} Returns the new flattened array.
         * @example
         *
         * _.flatten([1, [2, [3, [4]], 5]]);
         * // => [1, 2, [3, [4]], 5]
         */
        function flatten$1(array) {
          var length = array == null ? 0 : array.length;
          return length ? baseFlatten(array, 1) : [];
        }

        var flatten_1 = flatten$1;

        /**
         * A faster alternative to `Function#apply`, this function invokes `func`
         * with the `this` binding of `thisArg` and the arguments of `args`.
         *
         * @private
         * @param {Function} func The function to invoke.
         * @param {*} thisArg The `this` binding of `func`.
         * @param {Array} args The arguments to invoke `func` with.
         * @returns {*} Returns the result of `func`.
         */

        function apply$1(func, thisArg, args) {
          switch (args.length) {
            case 0: return func.call(thisArg);
            case 1: return func.call(thisArg, args[0]);
            case 2: return func.call(thisArg, args[0], args[1]);
            case 3: return func.call(thisArg, args[0], args[1], args[2]);
          }
          return func.apply(thisArg, args);
        }

        var _apply = apply$1;

        var apply = _apply;

        /* Built-in method references for those with the same name as other `lodash` methods. */
        var nativeMax = Math.max;

        /**
         * A specialized version of `baseRest` which transforms the rest array.
         *
         * @private
         * @param {Function} func The function to apply a rest parameter to.
         * @param {number} [start=func.length-1] The start position of the rest parameter.
         * @param {Function} transform The rest array transform.
         * @returns {Function} Returns the new function.
         */
        function overRest$1(func, start, transform) {
          start = nativeMax(start === undefined ? (func.length - 1) : start, 0);
          return function() {
            var args = arguments,
                index = -1,
                length = nativeMax(args.length - start, 0),
                array = Array(length);

            while (++index < length) {
              array[index] = args[start + index];
            }
            index = -1;
            var otherArgs = Array(start + 1);
            while (++index < start) {
              otherArgs[index] = args[index];
            }
            otherArgs[start] = transform(array);
            return apply(func, this, otherArgs);
          };
        }

        var _overRest = overRest$1;

        /**
         * Creates a function that returns `value`.
         *
         * @static
         * @memberOf _
         * @since 2.4.0
         * @category Util
         * @param {*} value The value to return from the new function.
         * @returns {Function} Returns the new constant function.
         * @example
         *
         * var objects = _.times(2, _.constant({ 'a': 1 }));
         *
         * console.log(objects);
         * // => [{ 'a': 1 }, { 'a': 1 }]
         *
         * console.log(objects[0] === objects[1]);
         * // => true
         */

        function constant$1(value) {
          return function() {
            return value;
          };
        }

        var constant_1 = constant$1;

        var baseGetTag = _baseGetTag,
            isObject$1 = isObject_1;

        /** `Object#toString` result references. */
        var asyncTag = '[object AsyncFunction]',
            funcTag = '[object Function]',
            genTag = '[object GeneratorFunction]',
            proxyTag = '[object Proxy]';

        /**
         * Checks if `value` is classified as a `Function` object.
         *
         * @static
         * @memberOf _
         * @since 0.1.0
         * @category Lang
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is a function, else `false`.
         * @example
         *
         * _.isFunction(_);
         * // => true
         *
         * _.isFunction(/abc/);
         * // => false
         */
        function isFunction$1(value) {
          if (!isObject$1(value)) {
            return false;
          }
          // The use of `Object#toString` avoids issues with the `typeof` operator
          // in Safari 9 which returns 'object' for typed arrays and other constructors.
          var tag = baseGetTag(value);
          return tag == funcTag || tag == genTag || tag == asyncTag || tag == proxyTag;
        }

        var isFunction_1 = isFunction$1;

        var root$1 = _root;

        /** Used to detect overreaching core-js shims. */
        var coreJsData$1 = root$1['__core-js_shared__'];

        var _coreJsData = coreJsData$1;

        var coreJsData = _coreJsData;

        /** Used to detect methods masquerading as native. */
        var maskSrcKey = (function() {
          var uid = /[^.]+$/.exec(coreJsData && coreJsData.keys && coreJsData.keys.IE_PROTO || '');
          return uid ? ('Symbol(src)_1.' + uid) : '';
        }());

        /**
         * Checks if `func` has its source masked.
         *
         * @private
         * @param {Function} func The function to check.
         * @returns {boolean} Returns `true` if `func` is masked, else `false`.
         */
        function isMasked$1(func) {
          return !!maskSrcKey && (maskSrcKey in func);
        }

        var _isMasked = isMasked$1;

        /** Used for built-in method references. */

        var funcProto$1 = Function.prototype;

        /** Used to resolve the decompiled source of functions. */
        var funcToString$1 = funcProto$1.toString;

        /**
         * Converts `func` to its source code.
         *
         * @private
         * @param {Function} func The function to convert.
         * @returns {string} Returns the source code.
         */
        function toSource$1(func) {
          if (func != null) {
            try {
              return funcToString$1.call(func);
            } catch (e) {}
            try {
              return (func + '');
            } catch (e) {}
          }
          return '';
        }

        var _toSource = toSource$1;

        var isFunction = isFunction_1,
            isMasked = _isMasked,
            isObject = isObject_1,
            toSource = _toSource;

        /**
         * Used to match `RegExp`
         * [syntax characters](http://ecma-international.org/ecma-262/7.0/#sec-patterns).
         */
        var reRegExpChar = /[\\^$.*+?()[\]{}|]/g;

        /** Used to detect host constructors (Safari). */
        var reIsHostCtor = /^\[object .+?Constructor\]$/;

        /** Used for built-in method references. */
        var funcProto = Function.prototype,
            objectProto$2 = Object.prototype;

        /** Used to resolve the decompiled source of functions. */
        var funcToString = funcProto.toString;

        /** Used to check objects for own properties. */
        var hasOwnProperty$2 = objectProto$2.hasOwnProperty;

        /** Used to detect if a method is native. */
        var reIsNative = RegExp('^' +
          funcToString.call(hasOwnProperty$2).replace(reRegExpChar, '\\$&')
          .replace(/hasOwnProperty|(function).*?(?=\\\()| for .+?(?=\\\])/g, '$1.*?') + '$'
        );

        /**
         * The base implementation of `_.isNative` without bad shim checks.
         *
         * @private
         * @param {*} value The value to check.
         * @returns {boolean} Returns `true` if `value` is a native function,
         *  else `false`.
         */
        function baseIsNative$1(value) {
          if (!isObject(value) || isMasked(value)) {
            return false;
          }
          var pattern = isFunction(value) ? reIsNative : reIsHostCtor;
          return pattern.test(toSource(value));
        }

        var _baseIsNative = baseIsNative$1;

        /**
         * Gets the value at `key` of `object`.
         *
         * @private
         * @param {Object} [object] The object to query.
         * @param {string} key The key of the property to get.
         * @returns {*} Returns the property value.
         */

        function getValue$1(object, key) {
          return object == null ? undefined : object[key];
        }

        var _getValue = getValue$1;

        var baseIsNative = _baseIsNative,
            getValue = _getValue;

        /**
         * Gets the native function at `key` of `object`.
         *
         * @private
         * @param {Object} object The object to query.
         * @param {string} key The key of the method to get.
         * @returns {*} Returns the function if it's native, else `undefined`.
         */
        function getNative$2(object, key) {
          var value = getValue(object, key);
          return baseIsNative(value) ? value : undefined;
        }

        var _getNative = getNative$2;

        var getNative$1 = _getNative;

        var defineProperty$1 = (function() {
          try {
            var func = getNative$1(Object, 'defineProperty');
            func({}, '', {});
            return func;
          } catch (e) {}
        }());

        var _defineProperty = defineProperty$1;

        /**
         * This method returns the first argument it receives.
         *
         * @static
         * @since 0.1.0
         * @memberOf _
         * @category Util
         * @param {*} value Any value.
         * @returns {*} Returns `value`.
         * @example
         *
         * var object = { 'a': 1 };
         *
         * console.log(_.identity(object) === object);
         * // => true
         */

        function identity$1(value) {
          return value;
        }

        var identity_1 = identity$1;

        var constant = constant_1,
            defineProperty = _defineProperty,
            identity = identity_1;

        /**
         * The base implementation of `setToString` without support for hot loop shorting.
         *
         * @private
         * @param {Function} func The function to modify.
         * @param {Function} string The `toString` result.
         * @returns {Function} Returns `func`.
         */
        var baseSetToString$1 = !defineProperty ? identity : function(func, string) {
          return defineProperty(func, 'toString', {
            'configurable': true,
            'enumerable': false,
            'value': constant(string),
            'writable': true
          });
        };

        var _baseSetToString = baseSetToString$1;

        /** Used to detect hot functions by number of calls within a span of milliseconds. */

        var HOT_COUNT = 800,
            HOT_SPAN = 16;

        /* Built-in method references for those with the same name as other `lodash` methods. */
        var nativeNow = Date.now;

        /**
         * Creates a function that'll short out and invoke `identity` instead
         * of `func` when it's called `HOT_COUNT` or more times in `HOT_SPAN`
         * milliseconds.
         *
         * @private
         * @param {Function} func The function to restrict.
         * @returns {Function} Returns the new shortable function.
         */
        function shortOut$1(func) {
          var count = 0,
              lastCalled = 0;

          return function() {
            var stamp = nativeNow(),
                remaining = HOT_SPAN - (stamp - lastCalled);

            lastCalled = stamp;
            if (remaining > 0) {
              if (++count >= HOT_COUNT) {
                return arguments[0];
              }
            } else {
              count = 0;
            }
            return func.apply(undefined, arguments);
          };
        }

        var _shortOut = shortOut$1;

        var baseSetToString = _baseSetToString,
            shortOut = _shortOut;

        /**
         * Sets the `toString` method of `func` to return `string`.
         *
         * @private
         * @param {Function} func The function to modify.
         * @param {Function} string The `toString` result.
         * @returns {Function} Returns `func`.
         */
        var setToString$1 = shortOut(baseSetToString);

        var _setToString = setToString$1;

        var flatten = flatten_1,
            overRest = _overRest,
            setToString = _setToString;

        /**
         * A specialized version of `baseRest` which flattens the rest array.
         *
         * @private
         * @param {Function} func The function to apply a rest parameter to.
         * @returns {Function} Returns the new function.
         */
        function flatRest$1(func) {
          return setToString(overRest(func, undefined, flatten), func + '');
        }

        var _flatRest = flatRest$1;

        var getNative = _getNative,
            root = _root;

        /* Built-in method references that are verified to be native. */
        var WeakMap$1 = getNative(root, 'WeakMap');

        var _WeakMap = WeakMap$1;

        var WeakMap = _WeakMap;

        /** Used to store function metadata. */
        var metaMap$1 = WeakMap && new WeakMap;

        var _metaMap = metaMap$1;

        /**
         * This method returns `undefined`.
         *
         * @static
         * @memberOf _
         * @since 2.3.0
         * @category Util
         * @example
         *
         * _.times(2, _.noop);
         * // => [undefined, undefined]
         */

        function noop$2() {
          // No operation performed.
        }

        var noop_1 = noop$2;

        var metaMap = _metaMap,
            noop$1 = noop_1;

        /**
         * Gets metadata for `func`.
         *
         * @private
         * @param {Function} func The function to query.
         * @returns {*} Returns the metadata for `func`.
         */
        var getData$2 = !metaMap ? noop$1 : function(func) {
          return metaMap.get(func);
        };

        var _getData = getData$2;

        /** Used to lookup unminified function names. */

        var realNames$1 = {};

        var _realNames = realNames$1;

        var realNames = _realNames;

        /** Used for built-in method references. */
        var objectProto$1 = Object.prototype;

        /** Used to check objects for own properties. */
        var hasOwnProperty$1 = objectProto$1.hasOwnProperty;

        /**
         * Gets the name of `func`.
         *
         * @private
         * @param {Function} func The function to query.
         * @returns {string} Returns the function name.
         */
        function getFuncName$2(func) {
          var result = (func.name + ''),
              array = realNames[result],
              length = hasOwnProperty$1.call(realNames, result) ? array.length : 0;

          while (length--) {
            var data = array[length],
                otherFunc = data.func;
            if (otherFunc == null || otherFunc == func) {
              return data.name;
            }
          }
          return result;
        }

        var _getFuncName = getFuncName$2;

        var baseCreate = _baseCreate,
            baseLodash$1 = _baseLodash;

        /** Used as references for the maximum length and index of an array. */
        var MAX_ARRAY_LENGTH = 4294967295;

        /**
         * Creates a lazy wrapper object which wraps `value` to enable lazy evaluation.
         *
         * @private
         * @constructor
         * @param {*} value The value to wrap.
         */
        function LazyWrapper$3(value) {
          this.__wrapped__ = value;
          this.__actions__ = [];
          this.__dir__ = 1;
          this.__filtered__ = false;
          this.__iteratees__ = [];
          this.__takeCount__ = MAX_ARRAY_LENGTH;
          this.__views__ = [];
        }

        // Ensure `LazyWrapper` is an instance of `baseLodash`.
        LazyWrapper$3.prototype = baseCreate(baseLodash$1.prototype);
        LazyWrapper$3.prototype.constructor = LazyWrapper$3;

        var _LazyWrapper = LazyWrapper$3;

        /**
         * Copies the values of `source` to `array`.
         *
         * @private
         * @param {Array} source The array to copy values from.
         * @param {Array} [array=[]] The array to copy values to.
         * @returns {Array} Returns `array`.
         */

        function copyArray$1(source, array) {
          var index = -1,
              length = source.length;

          array || (array = Array(length));
          while (++index < length) {
            array[index] = source[index];
          }
          return array;
        }

        var _copyArray = copyArray$1;

        var LazyWrapper$2 = _LazyWrapper,
            LodashWrapper$2 = _LodashWrapper,
            copyArray = _copyArray;

        /**
         * Creates a clone of `wrapper`.
         *
         * @private
         * @param {Object} wrapper The wrapper to clone.
         * @returns {Object} Returns the cloned wrapper.
         */
        function wrapperClone$1(wrapper) {
          if (wrapper instanceof LazyWrapper$2) {
            return wrapper.clone();
          }
          var result = new LodashWrapper$2(wrapper.__wrapped__, wrapper.__chain__);
          result.__actions__ = copyArray(wrapper.__actions__);
          result.__index__  = wrapper.__index__;
          result.__values__ = wrapper.__values__;
          return result;
        }

        var _wrapperClone = wrapperClone$1;

        var LazyWrapper$1 = _LazyWrapper,
            LodashWrapper$1 = _LodashWrapper,
            baseLodash = _baseLodash,
            isArray$1 = isArray_1,
            isObjectLike = isObjectLike_1,
            wrapperClone = _wrapperClone;

        /** Used for built-in method references. */
        var objectProto = Object.prototype;

        /** Used to check objects for own properties. */
        var hasOwnProperty = objectProto.hasOwnProperty;

        /**
         * Creates a `lodash` object which wraps `value` to enable implicit method
         * chain sequences. Methods that operate on and return arrays, collections,
         * and functions can be chained together. Methods that retrieve a single value
         * or may return a primitive value will automatically end the chain sequence
         * and return the unwrapped value. Otherwise, the value must be unwrapped
         * with `_#value`.
         *
         * Explicit chain sequences, which must be unwrapped with `_#value`, may be
         * enabled using `_.chain`.
         *
         * The execution of chained methods is lazy, that is, it's deferred until
         * `_#value` is implicitly or explicitly called.
         *
         * Lazy evaluation allows several methods to support shortcut fusion.
         * Shortcut fusion is an optimization to merge iteratee calls; this avoids
         * the creation of intermediate arrays and can greatly reduce the number of
         * iteratee executions. Sections of a chain sequence qualify for shortcut
         * fusion if the section is applied to an array and iteratees accept only
         * one argument. The heuristic for whether a section qualifies for shortcut
         * fusion is subject to change.
         *
         * Chaining is supported in custom builds as long as the `_#value` method is
         * directly or indirectly included in the build.
         *
         * In addition to lodash methods, wrappers have `Array` and `String` methods.
         *
         * The wrapper `Array` methods are:
         * `concat`, `join`, `pop`, `push`, `shift`, `sort`, `splice`, and `unshift`
         *
         * The wrapper `String` methods are:
         * `replace` and `split`
         *
         * The wrapper methods that support shortcut fusion are:
         * `at`, `compact`, `drop`, `dropRight`, `dropWhile`, `filter`, `find`,
         * `findLast`, `head`, `initial`, `last`, `map`, `reject`, `reverse`, `slice`,
         * `tail`, `take`, `takeRight`, `takeRightWhile`, `takeWhile`, and `toArray`
         *
         * The chainable wrapper methods are:
         * `after`, `ary`, `assign`, `assignIn`, `assignInWith`, `assignWith`, `at`,
         * `before`, `bind`, `bindAll`, `bindKey`, `castArray`, `chain`, `chunk`,
         * `commit`, `compact`, `concat`, `conforms`, `constant`, `countBy`, `create`,
         * `curry`, `debounce`, `defaults`, `defaultsDeep`, `defer`, `delay`,
         * `difference`, `differenceBy`, `differenceWith`, `drop`, `dropRight`,
         * `dropRightWhile`, `dropWhile`, `extend`, `extendWith`, `fill`, `filter`,
         * `flatMap`, `flatMapDeep`, `flatMapDepth`, `flatten`, `flattenDeep`,
         * `flattenDepth`, `flip`, `flow`, `flowRight`, `fromPairs`, `functions`,
         * `functionsIn`, `groupBy`, `initial`, `intersection`, `intersectionBy`,
         * `intersectionWith`, `invert`, `invertBy`, `invokeMap`, `iteratee`, `keyBy`,
         * `keys`, `keysIn`, `map`, `mapKeys`, `mapValues`, `matches`, `matchesProperty`,
         * `memoize`, `merge`, `mergeWith`, `method`, `methodOf`, `mixin`, `negate`,
         * `nthArg`, `omit`, `omitBy`, `once`, `orderBy`, `over`, `overArgs`,
         * `overEvery`, `overSome`, `partial`, `partialRight`, `partition`, `pick`,
         * `pickBy`, `plant`, `property`, `propertyOf`, `pull`, `pullAll`, `pullAllBy`,
         * `pullAllWith`, `pullAt`, `push`, `range`, `rangeRight`, `rearg`, `reject`,
         * `remove`, `rest`, `reverse`, `sampleSize`, `set`, `setWith`, `shuffle`,
         * `slice`, `sort`, `sortBy`, `splice`, `spread`, `tail`, `take`, `takeRight`,
         * `takeRightWhile`, `takeWhile`, `tap`, `throttle`, `thru`, `toArray`,
         * `toPairs`, `toPairsIn`, `toPath`, `toPlainObject`, `transform`, `unary`,
         * `union`, `unionBy`, `unionWith`, `uniq`, `uniqBy`, `uniqWith`, `unset`,
         * `unshift`, `unzip`, `unzipWith`, `update`, `updateWith`, `values`,
         * `valuesIn`, `without`, `wrap`, `xor`, `xorBy`, `xorWith`, `zip`,
         * `zipObject`, `zipObjectDeep`, and `zipWith`
         *
         * The wrapper methods that are **not** chainable by default are:
         * `add`, `attempt`, `camelCase`, `capitalize`, `ceil`, `clamp`, `clone`,
         * `cloneDeep`, `cloneDeepWith`, `cloneWith`, `conformsTo`, `deburr`,
         * `defaultTo`, `divide`, `each`, `eachRight`, `endsWith`, `eq`, `escape`,
         * `escapeRegExp`, `every`, `find`, `findIndex`, `findKey`, `findLast`,
         * `findLastIndex`, `findLastKey`, `first`, `floor`, `forEach`, `forEachRight`,
         * `forIn`, `forInRight`, `forOwn`, `forOwnRight`, `get`, `gt`, `gte`, `has`,
         * `hasIn`, `head`, `identity`, `includes`, `indexOf`, `inRange`, `invoke`,
         * `isArguments`, `isArray`, `isArrayBuffer`, `isArrayLike`, `isArrayLikeObject`,
         * `isBoolean`, `isBuffer`, `isDate`, `isElement`, `isEmpty`, `isEqual`,
         * `isEqualWith`, `isError`, `isFinite`, `isFunction`, `isInteger`, `isLength`,
         * `isMap`, `isMatch`, `isMatchWith`, `isNaN`, `isNative`, `isNil`, `isNull`,
         * `isNumber`, `isObject`, `isObjectLike`, `isPlainObject`, `isRegExp`,
         * `isSafeInteger`, `isSet`, `isString`, `isUndefined`, `isTypedArray`,
         * `isWeakMap`, `isWeakSet`, `join`, `kebabCase`, `last`, `lastIndexOf`,
         * `lowerCase`, `lowerFirst`, `lt`, `lte`, `max`, `maxBy`, `mean`, `meanBy`,
         * `min`, `minBy`, `multiply`, `noConflict`, `noop`, `now`, `nth`, `pad`,
         * `padEnd`, `padStart`, `parseInt`, `pop`, `random`, `reduce`, `reduceRight`,
         * `repeat`, `result`, `round`, `runInContext`, `sample`, `shift`, `size`,
         * `snakeCase`, `some`, `sortedIndex`, `sortedIndexBy`, `sortedLastIndex`,
         * `sortedLastIndexBy`, `startCase`, `startsWith`, `stubArray`, `stubFalse`,
         * `stubObject`, `stubString`, `stubTrue`, `subtract`, `sum`, `sumBy`,
         * `template`, `times`, `toFinite`, `toInteger`, `toJSON`, `toLength`,
         * `toLower`, `toNumber`, `toSafeInteger`, `toString`, `toUpper`, `trim`,
         * `trimEnd`, `trimStart`, `truncate`, `unescape`, `uniqueId`, `upperCase`,
         * `upperFirst`, `value`, and `words`
         *
         * @name _
         * @constructor
         * @category Seq
         * @param {*} value The value to wrap in a `lodash` instance.
         * @returns {Object} Returns the new `lodash` wrapper instance.
         * @example
         *
         * function square(n) {
         *   return n * n;
         * }
         *
         * var wrapped = _([1, 2, 3]);
         *
         * // Returns an unwrapped value.
         * wrapped.reduce(_.add);
         * // => 6
         *
         * // Returns a wrapped value.
         * var squares = wrapped.map(square);
         *
         * _.isArray(squares);
         * // => false
         *
         * _.isArray(squares.value());
         * // => true
         */
        function lodash$1(value) {
          if (isObjectLike(value) && !isArray$1(value) && !(value instanceof LazyWrapper$1)) {
            if (value instanceof LodashWrapper$1) {
              return value;
            }
            if (hasOwnProperty.call(value, '__wrapped__')) {
              return wrapperClone(value);
            }
          }
          return new LodashWrapper$1(value);
        }

        // Ensure wrappers are instances of `baseLodash`.
        lodash$1.prototype = baseLodash.prototype;
        lodash$1.prototype.constructor = lodash$1;

        var wrapperLodash = lodash$1;

        var LazyWrapper = _LazyWrapper,
            getData$1 = _getData,
            getFuncName$1 = _getFuncName,
            lodash = wrapperLodash;

        /**
         * Checks if `func` has a lazy counterpart.
         *
         * @private
         * @param {Function} func The function to check.
         * @returns {boolean} Returns `true` if `func` has a lazy counterpart,
         *  else `false`.
         */
        function isLaziable$1(func) {
          var funcName = getFuncName$1(func),
              other = lodash[funcName];

          if (typeof other != 'function' || !(funcName in LazyWrapper.prototype)) {
            return false;
          }
          if (func === other) {
            return true;
          }
          var data = getData$1(other);
          return !!data && func === data[0];
        }

        var _isLaziable = isLaziable$1;

        var LodashWrapper = _LodashWrapper,
            flatRest = _flatRest,
            getData = _getData,
            getFuncName = _getFuncName,
            isArray = isArray_1,
            isLaziable = _isLaziable;

        /** Error message constants. */
        var FUNC_ERROR_TEXT = 'Expected a function';

        /** Used to compose bitmasks for function metadata. */
        var WRAP_CURRY_FLAG = 8,
            WRAP_PARTIAL_FLAG = 32,
            WRAP_ARY_FLAG = 128,
            WRAP_REARG_FLAG = 256;

        /**
         * Creates a `_.flow` or `_.flowRight` function.
         *
         * @private
         * @param {boolean} [fromRight] Specify iterating from right to left.
         * @returns {Function} Returns the new flow function.
         */
        function createFlow$1(fromRight) {
          return flatRest(function(funcs) {
            var length = funcs.length,
                index = length,
                prereq = LodashWrapper.prototype.thru;

            if (fromRight) {
              funcs.reverse();
            }
            while (index--) {
              var func = funcs[index];
              if (typeof func != 'function') {
                throw new TypeError(FUNC_ERROR_TEXT);
              }
              if (prereq && !wrapper && getFuncName(func) == 'wrapper') {
                var wrapper = new LodashWrapper([], true);
              }
            }
            index = wrapper ? index : length;
            while (++index < length) {
              func = funcs[index];

              var funcName = getFuncName(func),
                  data = funcName == 'wrapper' ? getData(func) : undefined;

              if (data && isLaziable(data[0]) &&
                    data[1] == (WRAP_ARY_FLAG | WRAP_CURRY_FLAG | WRAP_PARTIAL_FLAG | WRAP_REARG_FLAG) &&
                    !data[4].length && data[9] == 1
                  ) {
                wrapper = wrapper[getFuncName(data[0])].apply(wrapper, data[3]);
              } else {
                wrapper = (func.length == 1 && isLaziable(func))
                  ? wrapper[funcName]()
                  : wrapper.thru(func);
              }
            }
            return function() {
              var args = arguments,
                  value = args[0];

              if (wrapper && args.length == 1 && isArray(value)) {
                return wrapper.plant(value).value();
              }
              var index = 0,
                  result = length ? funcs[index].apply(this, args) : value;

              while (++index < length) {
                result = funcs[index].call(this, result);
              }
              return result;
            };
          });
        }

        var _createFlow = createFlow$1;

        var createFlow = _createFlow;

        /**
         * Creates a function that returns the result of invoking the given functions
         * with the `this` binding of the created function, where each successive
         * invocation is supplied the return value of the previous.
         *
         * @static
         * @memberOf _
         * @since 3.0.0
         * @category Util
         * @param {...(Function|Function[])} [funcs] The functions to invoke.
         * @returns {Function} Returns the new composite function.
         * @see _.flowRight
         * @example
         *
         * function square(n) {
         *   return n * n;
         * }
         *
         * var addSquare = _.flow([_.add, square]);
         * addSquare(1, 2);
         * // => 9
         */
        var flow = createFlow();

        var flow_1 = flow;

        var buffer = {};

        var base64Js = {};

        base64Js.byteLength = byteLength;
        base64Js.toByteArray = toByteArray;
        base64Js.fromByteArray = fromByteArray;

        var lookup = [];
        var revLookup = [];
        var Arr = typeof Uint8Array !== 'undefined' ? Uint8Array : Array;

        var code = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
        for (var i = 0, len = code.length; i < len; ++i) {
          lookup[i] = code[i];
          revLookup[code.charCodeAt(i)] = i;
        }

        // Support decoding URL-safe base64 strings, as Node.js does.
        // See: https://en.wikipedia.org/wiki/Base64#URL_applications
        revLookup['-'.charCodeAt(0)] = 62;
        revLookup['_'.charCodeAt(0)] = 63;

        function getLens (b64) {
          var len = b64.length;

          if (len % 4 > 0) {
            throw new Error('Invalid string. Length must be a multiple of 4')
          }

          // Trim off extra bytes after placeholder bytes are found
          // See: https://github.com/beatgammit/base64-js/issues/42
          var validLen = b64.indexOf('=');
          if (validLen === -1) validLen = len;

          var placeHoldersLen = validLen === len
            ? 0
            : 4 - (validLen % 4);

          return [validLen, placeHoldersLen]
        }

        // base64 is 4/3 + up to two characters of the original data
        function byteLength (b64) {
          var lens = getLens(b64);
          var validLen = lens[0];
          var placeHoldersLen = lens[1];
          return ((validLen + placeHoldersLen) * 3 / 4) - placeHoldersLen
        }

        function _byteLength (b64, validLen, placeHoldersLen) {
          return ((validLen + placeHoldersLen) * 3 / 4) - placeHoldersLen
        }

        function toByteArray (b64) {
          var tmp;
          var lens = getLens(b64);
          var validLen = lens[0];
          var placeHoldersLen = lens[1];

          var arr = new Arr(_byteLength(b64, validLen, placeHoldersLen));

          var curByte = 0;

          // if there are placeholders, only get up to the last complete 4 chars
          var len = placeHoldersLen > 0
            ? validLen - 4
            : validLen;

          var i;
          for (i = 0; i < len; i += 4) {
            tmp =
              (revLookup[b64.charCodeAt(i)] << 18) |
              (revLookup[b64.charCodeAt(i + 1)] << 12) |
              (revLookup[b64.charCodeAt(i + 2)] << 6) |
              revLookup[b64.charCodeAt(i + 3)];
            arr[curByte++] = (tmp >> 16) & 0xFF;
            arr[curByte++] = (tmp >> 8) & 0xFF;
            arr[curByte++] = tmp & 0xFF;
          }

          if (placeHoldersLen === 2) {
            tmp =
              (revLookup[b64.charCodeAt(i)] << 2) |
              (revLookup[b64.charCodeAt(i + 1)] >> 4);
            arr[curByte++] = tmp & 0xFF;
          }

          if (placeHoldersLen === 1) {
            tmp =
              (revLookup[b64.charCodeAt(i)] << 10) |
              (revLookup[b64.charCodeAt(i + 1)] << 4) |
              (revLookup[b64.charCodeAt(i + 2)] >> 2);
            arr[curByte++] = (tmp >> 8) & 0xFF;
            arr[curByte++] = tmp & 0xFF;
          }

          return arr
        }

        function tripletToBase64 (num) {
          return lookup[num >> 18 & 0x3F] +
            lookup[num >> 12 & 0x3F] +
            lookup[num >> 6 & 0x3F] +
            lookup[num & 0x3F]
        }

        function encodeChunk (uint8, start, end) {
          var tmp;
          var output = [];
          for (var i = start; i < end; i += 3) {
            tmp =
              ((uint8[i] << 16) & 0xFF0000) +
              ((uint8[i + 1] << 8) & 0xFF00) +
              (uint8[i + 2] & 0xFF);
            output.push(tripletToBase64(tmp));
          }
          return output.join('')
        }

        function fromByteArray (uint8) {
          var tmp;
          var len = uint8.length;
          var extraBytes = len % 3; // if we have 1 byte left, pad 2 bytes
          var parts = [];
          var maxChunkLength = 16383; // must be multiple of 3

          // go through the array every three bytes, we'll deal with trailing stuff later
          for (var i = 0, len2 = len - extraBytes; i < len2; i += maxChunkLength) {
            parts.push(encodeChunk(uint8, i, (i + maxChunkLength) > len2 ? len2 : (i + maxChunkLength)));
          }

          // pad the end with zeros, but make sure to not forget the extra bytes
          if (extraBytes === 1) {
            tmp = uint8[len - 1];
            parts.push(
              lookup[tmp >> 2] +
              lookup[(tmp << 4) & 0x3F] +
              '=='
            );
          } else if (extraBytes === 2) {
            tmp = (uint8[len - 2] << 8) + uint8[len - 1];
            parts.push(
              lookup[tmp >> 10] +
              lookup[(tmp >> 4) & 0x3F] +
              lookup[(tmp << 2) & 0x3F] +
              '='
            );
          }

          return parts.join('')
        }

        var ieee754 = {};

        /*! ieee754. BSD-3-Clause License. Feross Aboukhadijeh <https://feross.org/opensource> */

        ieee754.read = function (buffer, offset, isLE, mLen, nBytes) {
          var e, m;
          var eLen = (nBytes * 8) - mLen - 1;
          var eMax = (1 << eLen) - 1;
          var eBias = eMax >> 1;
          var nBits = -7;
          var i = isLE ? (nBytes - 1) : 0;
          var d = isLE ? -1 : 1;
          var s = buffer[offset + i];

          i += d;

          e = s & ((1 << (-nBits)) - 1);
          s >>= (-nBits);
          nBits += eLen;
          for (; nBits > 0; e = (e * 256) + buffer[offset + i], i += d, nBits -= 8) {}

          m = e & ((1 << (-nBits)) - 1);
          e >>= (-nBits);
          nBits += mLen;
          for (; nBits > 0; m = (m * 256) + buffer[offset + i], i += d, nBits -= 8) {}

          if (e === 0) {
            e = 1 - eBias;
          } else if (e === eMax) {
            return m ? NaN : ((s ? -1 : 1) * Infinity)
          } else {
            m = m + Math.pow(2, mLen);
            e = e - eBias;
          }
          return (s ? -1 : 1) * m * Math.pow(2, e - mLen)
        };

        ieee754.write = function (buffer, value, offset, isLE, mLen, nBytes) {
          var e, m, c;
          var eLen = (nBytes * 8) - mLen - 1;
          var eMax = (1 << eLen) - 1;
          var eBias = eMax >> 1;
          var rt = (mLen === 23 ? Math.pow(2, -24) - Math.pow(2, -77) : 0);
          var i = isLE ? 0 : (nBytes - 1);
          var d = isLE ? 1 : -1;
          var s = value < 0 || (value === 0 && 1 / value < 0) ? 1 : 0;

          value = Math.abs(value);

          if (isNaN(value) || value === Infinity) {
            m = isNaN(value) ? 1 : 0;
            e = eMax;
          } else {
            e = Math.floor(Math.log(value) / Math.LN2);
            if (value * (c = Math.pow(2, -e)) < 1) {
              e--;
              c *= 2;
            }
            if (e + eBias >= 1) {
              value += rt / c;
            } else {
              value += rt * Math.pow(2, 1 - eBias);
            }
            if (value * c >= 2) {
              e++;
              c /= 2;
            }

            if (e + eBias >= eMax) {
              m = 0;
              e = eMax;
            } else if (e + eBias >= 1) {
              m = ((value * c) - 1) * Math.pow(2, mLen);
              e = e + eBias;
            } else {
              m = value * Math.pow(2, eBias - 1) * Math.pow(2, mLen);
              e = 0;
            }
          }

          for (; mLen >= 8; buffer[offset + i] = m & 0xff, i += d, m /= 256, mLen -= 8) {}

          e = (e << mLen) | m;
          eLen += mLen;
          for (; eLen > 0; buffer[offset + i] = e & 0xff, i += d, e /= 256, eLen -= 8) {}

          buffer[offset + i - d] |= s * 128;
        };

        /*!
         * The buffer module from node.js, for the browser.
         *
         * @author   Feross Aboukhadijeh <https://feross.org>
         * @license  MIT
         */

        (function (exports) {

        const base64 = base64Js;
        const ieee754$1 = ieee754;
        const customInspectSymbol =
          (typeof Symbol === 'function' && typeof Symbol['for'] === 'function') // eslint-disable-line dot-notation
            ? Symbol['for']('nodejs.util.inspect.custom') // eslint-disable-line dot-notation
            : null;

        exports.Buffer = Buffer;
        exports.SlowBuffer = SlowBuffer;
        exports.INSPECT_MAX_BYTES = 50;

        const K_MAX_LENGTH = 0x7fffffff;
        exports.kMaxLength = K_MAX_LENGTH;

        /**
         * If `Buffer.TYPED_ARRAY_SUPPORT`:
         *   === true    Use Uint8Array implementation (fastest)
         *   === false   Print warning and recommend using `buffer` v4.x which has an Object
         *               implementation (most compatible, even IE6)
         *
         * Browsers that support typed arrays are IE 10+, Firefox 4+, Chrome 7+, Safari 5.1+,
         * Opera 11.6+, iOS 4.2+.
         *
         * We report that the browser does not support typed arrays if the are not subclassable
         * using __proto__. Firefox 4-29 lacks support for adding new properties to `Uint8Array`
         * (See: https://bugzilla.mozilla.org/show_bug.cgi?id=695438). IE 10 lacks support
         * for __proto__ and has a buggy typed array implementation.
         */
        Buffer.TYPED_ARRAY_SUPPORT = typedArraySupport();

        if (!Buffer.TYPED_ARRAY_SUPPORT && typeof console !== 'undefined' &&
            typeof console.error === 'function') {
          console.error(
            'This browser lacks typed array (Uint8Array) support which is required by ' +
            '`buffer` v5.x. Use `buffer` v4.x if you require old browser support.'
          );
        }

        function typedArraySupport () {
          // Can typed array instances can be augmented?
          try {
            const arr = new Uint8Array(1);
            const proto = { foo: function () { return 42 } };
            Object.setPrototypeOf(proto, Uint8Array.prototype);
            Object.setPrototypeOf(arr, proto);
            return arr.foo() === 42
          } catch (e) {
            return false
          }
        }

        Object.defineProperty(Buffer.prototype, 'parent', {
          enumerable: true,
          get: function () {
            if (!Buffer.isBuffer(this)) return undefined
            return this.buffer
          }
        });

        Object.defineProperty(Buffer.prototype, 'offset', {
          enumerable: true,
          get: function () {
            if (!Buffer.isBuffer(this)) return undefined
            return this.byteOffset
          }
        });

        function createBuffer (length) {
          if (length > K_MAX_LENGTH) {
            throw new RangeError('The value "' + length + '" is invalid for option "size"')
          }
          // Return an augmented `Uint8Array` instance
          const buf = new Uint8Array(length);
          Object.setPrototypeOf(buf, Buffer.prototype);
          return buf
        }

        /**
         * The Buffer constructor returns instances of `Uint8Array` that have their
         * prototype changed to `Buffer.prototype`. Furthermore, `Buffer` is a subclass of
         * `Uint8Array`, so the returned instances will have all the node `Buffer` methods
         * and the `Uint8Array` methods. Square bracket notation works as expected -- it
         * returns a single octet.
         *
         * The `Uint8Array` prototype remains unmodified.
         */

        function Buffer (arg, encodingOrOffset, length) {
          // Common case.
          if (typeof arg === 'number') {
            if (typeof encodingOrOffset === 'string') {
              throw new TypeError(
                'The "string" argument must be of type string. Received type number'
              )
            }
            return allocUnsafe(arg)
          }
          return from(arg, encodingOrOffset, length)
        }

        Buffer.poolSize = 8192; // not used by this implementation

        function from (value, encodingOrOffset, length) {
          if (typeof value === 'string') {
            return fromString(value, encodingOrOffset)
          }

          if (ArrayBuffer.isView(value)) {
            return fromArrayView(value)
          }

          if (value == null) {
            throw new TypeError(
              'The first argument must be one of type string, Buffer, ArrayBuffer, Array, ' +
              'or Array-like Object. Received type ' + (typeof value)
            )
          }

          if (isInstance(value, ArrayBuffer) ||
              (value && isInstance(value.buffer, ArrayBuffer))) {
            return fromArrayBuffer(value, encodingOrOffset, length)
          }

          if (typeof SharedArrayBuffer !== 'undefined' &&
              (isInstance(value, SharedArrayBuffer) ||
              (value && isInstance(value.buffer, SharedArrayBuffer)))) {
            return fromArrayBuffer(value, encodingOrOffset, length)
          }

          if (typeof value === 'number') {
            throw new TypeError(
              'The "value" argument must not be of type number. Received type number'
            )
          }

          const valueOf = value.valueOf && value.valueOf();
          if (valueOf != null && valueOf !== value) {
            return Buffer.from(valueOf, encodingOrOffset, length)
          }

          const b = fromObject(value);
          if (b) return b

          if (typeof Symbol !== 'undefined' && Symbol.toPrimitive != null &&
              typeof value[Symbol.toPrimitive] === 'function') {
            return Buffer.from(value[Symbol.toPrimitive]('string'), encodingOrOffset, length)
          }

          throw new TypeError(
            'The first argument must be one of type string, Buffer, ArrayBuffer, Array, ' +
            'or Array-like Object. Received type ' + (typeof value)
          )
        }

        /**
         * Functionally equivalent to Buffer(arg, encoding) but throws a TypeError
         * if value is a number.
         * Buffer.from(str[, encoding])
         * Buffer.from(array)
         * Buffer.from(buffer)
         * Buffer.from(arrayBuffer[, byteOffset[, length]])
         **/
        Buffer.from = function (value, encodingOrOffset, length) {
          return from(value, encodingOrOffset, length)
        };

        // Note: Change prototype *after* Buffer.from is defined to workaround Chrome bug:
        // https://github.com/feross/buffer/pull/148
        Object.setPrototypeOf(Buffer.prototype, Uint8Array.prototype);
        Object.setPrototypeOf(Buffer, Uint8Array);

        function assertSize (size) {
          if (typeof size !== 'number') {
            throw new TypeError('"size" argument must be of type number')
          } else if (size < 0) {
            throw new RangeError('The value "' + size + '" is invalid for option "size"')
          }
        }

        function alloc (size, fill, encoding) {
          assertSize(size);
          if (size <= 0) {
            return createBuffer(size)
          }
          if (fill !== undefined) {
            // Only pay attention to encoding if it's a string. This
            // prevents accidentally sending in a number that would
            // be interpreted as a start offset.
            return typeof encoding === 'string'
              ? createBuffer(size).fill(fill, encoding)
              : createBuffer(size).fill(fill)
          }
          return createBuffer(size)
        }

        /**
         * Creates a new filled Buffer instance.
         * alloc(size[, fill[, encoding]])
         **/
        Buffer.alloc = function (size, fill, encoding) {
          return alloc(size, fill, encoding)
        };

        function allocUnsafe (size) {
          assertSize(size);
          return createBuffer(size < 0 ? 0 : checked(size) | 0)
        }

        /**
         * Equivalent to Buffer(num), by default creates a non-zero-filled Buffer instance.
         * */
        Buffer.allocUnsafe = function (size) {
          return allocUnsafe(size)
        };
        /**
         * Equivalent to SlowBuffer(num), by default creates a non-zero-filled Buffer instance.
         */
        Buffer.allocUnsafeSlow = function (size) {
          return allocUnsafe(size)
        };

        function fromString (string, encoding) {
          if (typeof encoding !== 'string' || encoding === '') {
            encoding = 'utf8';
          }

          if (!Buffer.isEncoding(encoding)) {
            throw new TypeError('Unknown encoding: ' + encoding)
          }

          const length = byteLength(string, encoding) | 0;
          let buf = createBuffer(length);

          const actual = buf.write(string, encoding);

          if (actual !== length) {
            // Writing a hex string, for example, that contains invalid characters will
            // cause everything after the first invalid character to be ignored. (e.g.
            // 'abxxcd' will be treated as 'ab')
            buf = buf.slice(0, actual);
          }

          return buf
        }

        function fromArrayLike (array) {
          const length = array.length < 0 ? 0 : checked(array.length) | 0;
          const buf = createBuffer(length);
          for (let i = 0; i < length; i += 1) {
            buf[i] = array[i] & 255;
          }
          return buf
        }

        function fromArrayView (arrayView) {
          if (isInstance(arrayView, Uint8Array)) {
            const copy = new Uint8Array(arrayView);
            return fromArrayBuffer(copy.buffer, copy.byteOffset, copy.byteLength)
          }
          return fromArrayLike(arrayView)
        }

        function fromArrayBuffer (array, byteOffset, length) {
          if (byteOffset < 0 || array.byteLength < byteOffset) {
            throw new RangeError('"offset" is outside of buffer bounds')
          }

          if (array.byteLength < byteOffset + (length || 0)) {
            throw new RangeError('"length" is outside of buffer bounds')
          }

          let buf;
          if (byteOffset === undefined && length === undefined) {
            buf = new Uint8Array(array);
          } else if (length === undefined) {
            buf = new Uint8Array(array, byteOffset);
          } else {
            buf = new Uint8Array(array, byteOffset, length);
          }

          // Return an augmented `Uint8Array` instance
          Object.setPrototypeOf(buf, Buffer.prototype);

          return buf
        }

        function fromObject (obj) {
          if (Buffer.isBuffer(obj)) {
            const len = checked(obj.length) | 0;
            const buf = createBuffer(len);

            if (buf.length === 0) {
              return buf
            }

            obj.copy(buf, 0, 0, len);
            return buf
          }

          if (obj.length !== undefined) {
            if (typeof obj.length !== 'number' || numberIsNaN(obj.length)) {
              return createBuffer(0)
            }
            return fromArrayLike(obj)
          }

          if (obj.type === 'Buffer' && Array.isArray(obj.data)) {
            return fromArrayLike(obj.data)
          }
        }

        function checked (length) {
          // Note: cannot use `length < K_MAX_LENGTH` here because that fails when
          // length is NaN (which is otherwise coerced to zero.)
          if (length >= K_MAX_LENGTH) {
            throw new RangeError('Attempt to allocate Buffer larger than maximum ' +
                                 'size: 0x' + K_MAX_LENGTH.toString(16) + ' bytes')
          }
          return length | 0
        }

        function SlowBuffer (length) {
          if (+length != length) { // eslint-disable-line eqeqeq
            length = 0;
          }
          return Buffer.alloc(+length)
        }

        Buffer.isBuffer = function isBuffer (b) {
          return b != null && b._isBuffer === true &&
            b !== Buffer.prototype // so Buffer.isBuffer(Buffer.prototype) will be false
        };

        Buffer.compare = function compare (a, b) {
          if (isInstance(a, Uint8Array)) a = Buffer.from(a, a.offset, a.byteLength);
          if (isInstance(b, Uint8Array)) b = Buffer.from(b, b.offset, b.byteLength);
          if (!Buffer.isBuffer(a) || !Buffer.isBuffer(b)) {
            throw new TypeError(
              'The "buf1", "buf2" arguments must be one of type Buffer or Uint8Array'
            )
          }

          if (a === b) return 0

          let x = a.length;
          let y = b.length;

          for (let i = 0, len = Math.min(x, y); i < len; ++i) {
            if (a[i] !== b[i]) {
              x = a[i];
              y = b[i];
              break
            }
          }

          if (x < y) return -1
          if (y < x) return 1
          return 0
        };

        Buffer.isEncoding = function isEncoding (encoding) {
          switch (String(encoding).toLowerCase()) {
            case 'hex':
            case 'utf8':
            case 'utf-8':
            case 'ascii':
            case 'latin1':
            case 'binary':
            case 'base64':
            case 'ucs2':
            case 'ucs-2':
            case 'utf16le':
            case 'utf-16le':
              return true
            default:
              return false
          }
        };

        Buffer.concat = function concat (list, length) {
          if (!Array.isArray(list)) {
            throw new TypeError('"list" argument must be an Array of Buffers')
          }

          if (list.length === 0) {
            return Buffer.alloc(0)
          }

          let i;
          if (length === undefined) {
            length = 0;
            for (i = 0; i < list.length; ++i) {
              length += list[i].length;
            }
          }

          const buffer = Buffer.allocUnsafe(length);
          let pos = 0;
          for (i = 0; i < list.length; ++i) {
            let buf = list[i];
            if (isInstance(buf, Uint8Array)) {
              if (pos + buf.length > buffer.length) {
                if (!Buffer.isBuffer(buf)) buf = Buffer.from(buf);
                buf.copy(buffer, pos);
              } else {
                Uint8Array.prototype.set.call(
                  buffer,
                  buf,
                  pos
                );
              }
            } else if (!Buffer.isBuffer(buf)) {
              throw new TypeError('"list" argument must be an Array of Buffers')
            } else {
              buf.copy(buffer, pos);
            }
            pos += buf.length;
          }
          return buffer
        };

        function byteLength (string, encoding) {
          if (Buffer.isBuffer(string)) {
            return string.length
          }
          if (ArrayBuffer.isView(string) || isInstance(string, ArrayBuffer)) {
            return string.byteLength
          }
          if (typeof string !== 'string') {
            throw new TypeError(
              'The "string" argument must be one of type string, Buffer, or ArrayBuffer. ' +
              'Received type ' + typeof string
            )
          }

          const len = string.length;
          const mustMatch = (arguments.length > 2 && arguments[2] === true);
          if (!mustMatch && len === 0) return 0

          // Use a for loop to avoid recursion
          let loweredCase = false;
          for (;;) {
            switch (encoding) {
              case 'ascii':
              case 'latin1':
              case 'binary':
                return len
              case 'utf8':
              case 'utf-8':
                return utf8ToBytes(string).length
              case 'ucs2':
              case 'ucs-2':
              case 'utf16le':
              case 'utf-16le':
                return len * 2
              case 'hex':
                return len >>> 1
              case 'base64':
                return base64ToBytes(string).length
              default:
                if (loweredCase) {
                  return mustMatch ? -1 : utf8ToBytes(string).length // assume utf8
                }
                encoding = ('' + encoding).toLowerCase();
                loweredCase = true;
            }
          }
        }
        Buffer.byteLength = byteLength;

        function slowToString (encoding, start, end) {
          let loweredCase = false;

          // No need to verify that "this.length <= MAX_UINT32" since it's a read-only
          // property of a typed array.

          // This behaves neither like String nor Uint8Array in that we set start/end
          // to their upper/lower bounds if the value passed is out of range.
          // undefined is handled specially as per ECMA-262 6th Edition,
          // Section 13.3.3.7 Runtime Semantics: KeyedBindingInitialization.
          if (start === undefined || start < 0) {
            start = 0;
          }
          // Return early if start > this.length. Done here to prevent potential uint32
          // coercion fail below.
          if (start > this.length) {
            return ''
          }

          if (end === undefined || end > this.length) {
            end = this.length;
          }

          if (end <= 0) {
            return ''
          }

          // Force coercion to uint32. This will also coerce falsey/NaN values to 0.
          end >>>= 0;
          start >>>= 0;

          if (end <= start) {
            return ''
          }

          if (!encoding) encoding = 'utf8';

          while (true) {
            switch (encoding) {
              case 'hex':
                return hexSlice(this, start, end)

              case 'utf8':
              case 'utf-8':
                return utf8Slice(this, start, end)

              case 'ascii':
                return asciiSlice(this, start, end)

              case 'latin1':
              case 'binary':
                return latin1Slice(this, start, end)

              case 'base64':
                return base64Slice(this, start, end)

              case 'ucs2':
              case 'ucs-2':
              case 'utf16le':
              case 'utf-16le':
                return utf16leSlice(this, start, end)

              default:
                if (loweredCase) throw new TypeError('Unknown encoding: ' + encoding)
                encoding = (encoding + '').toLowerCase();
                loweredCase = true;
            }
          }
        }

        // This property is used by `Buffer.isBuffer` (and the `is-buffer` npm package)
        // to detect a Buffer instance. It's not possible to use `instanceof Buffer`
        // reliably in a browserify context because there could be multiple different
        // copies of the 'buffer' package in use. This method works even for Buffer
        // instances that were created from another copy of the `buffer` package.
        // See: https://github.com/feross/buffer/issues/154
        Buffer.prototype._isBuffer = true;

        function swap (b, n, m) {
          const i = b[n];
          b[n] = b[m];
          b[m] = i;
        }

        Buffer.prototype.swap16 = function swap16 () {
          const len = this.length;
          if (len % 2 !== 0) {
            throw new RangeError('Buffer size must be a multiple of 16-bits')
          }
          for (let i = 0; i < len; i += 2) {
            swap(this, i, i + 1);
          }
          return this
        };

        Buffer.prototype.swap32 = function swap32 () {
          const len = this.length;
          if (len % 4 !== 0) {
            throw new RangeError('Buffer size must be a multiple of 32-bits')
          }
          for (let i = 0; i < len; i += 4) {
            swap(this, i, i + 3);
            swap(this, i + 1, i + 2);
          }
          return this
        };

        Buffer.prototype.swap64 = function swap64 () {
          const len = this.length;
          if (len % 8 !== 0) {
            throw new RangeError('Buffer size must be a multiple of 64-bits')
          }
          for (let i = 0; i < len; i += 8) {
            swap(this, i, i + 7);
            swap(this, i + 1, i + 6);
            swap(this, i + 2, i + 5);
            swap(this, i + 3, i + 4);
          }
          return this
        };

        Buffer.prototype.toString = function toString () {
          const length = this.length;
          if (length === 0) return ''
          if (arguments.length === 0) return utf8Slice(this, 0, length)
          return slowToString.apply(this, arguments)
        };

        Buffer.prototype.toLocaleString = Buffer.prototype.toString;

        Buffer.prototype.equals = function equals (b) {
          if (!Buffer.isBuffer(b)) throw new TypeError('Argument must be a Buffer')
          if (this === b) return true
          return Buffer.compare(this, b) === 0
        };

        Buffer.prototype.inspect = function inspect () {
          let str = '';
          const max = exports.INSPECT_MAX_BYTES;
          str = this.toString('hex', 0, max).replace(/(.{2})/g, '$1 ').trim();
          if (this.length > max) str += ' ... ';
          return '<Buffer ' + str + '>'
        };
        if (customInspectSymbol) {
          Buffer.prototype[customInspectSymbol] = Buffer.prototype.inspect;
        }

        Buffer.prototype.compare = function compare (target, start, end, thisStart, thisEnd) {
          if (isInstance(target, Uint8Array)) {
            target = Buffer.from(target, target.offset, target.byteLength);
          }
          if (!Buffer.isBuffer(target)) {
            throw new TypeError(
              'The "target" argument must be one of type Buffer or Uint8Array. ' +
              'Received type ' + (typeof target)
            )
          }

          if (start === undefined) {
            start = 0;
          }
          if (end === undefined) {
            end = target ? target.length : 0;
          }
          if (thisStart === undefined) {
            thisStart = 0;
          }
          if (thisEnd === undefined) {
            thisEnd = this.length;
          }

          if (start < 0 || end > target.length || thisStart < 0 || thisEnd > this.length) {
            throw new RangeError('out of range index')
          }

          if (thisStart >= thisEnd && start >= end) {
            return 0
          }
          if (thisStart >= thisEnd) {
            return -1
          }
          if (start >= end) {
            return 1
          }

          start >>>= 0;
          end >>>= 0;
          thisStart >>>= 0;
          thisEnd >>>= 0;

          if (this === target) return 0

          let x = thisEnd - thisStart;
          let y = end - start;
          const len = Math.min(x, y);

          const thisCopy = this.slice(thisStart, thisEnd);
          const targetCopy = target.slice(start, end);

          for (let i = 0; i < len; ++i) {
            if (thisCopy[i] !== targetCopy[i]) {
              x = thisCopy[i];
              y = targetCopy[i];
              break
            }
          }

          if (x < y) return -1
          if (y < x) return 1
          return 0
        };

        // Finds either the first index of `val` in `buffer` at offset >= `byteOffset`,
        // OR the last index of `val` in `buffer` at offset <= `byteOffset`.
        //
        // Arguments:
        // - buffer - a Buffer to search
        // - val - a string, Buffer, or number
        // - byteOffset - an index into `buffer`; will be clamped to an int32
        // - encoding - an optional encoding, relevant is val is a string
        // - dir - true for indexOf, false for lastIndexOf
        function bidirectionalIndexOf (buffer, val, byteOffset, encoding, dir) {
          // Empty buffer means no match
          if (buffer.length === 0) return -1

          // Normalize byteOffset
          if (typeof byteOffset === 'string') {
            encoding = byteOffset;
            byteOffset = 0;
          } else if (byteOffset > 0x7fffffff) {
            byteOffset = 0x7fffffff;
          } else if (byteOffset < -0x80000000) {
            byteOffset = -0x80000000;
          }
          byteOffset = +byteOffset; // Coerce to Number.
          if (numberIsNaN(byteOffset)) {
            // byteOffset: it it's undefined, null, NaN, "foo", etc, search whole buffer
            byteOffset = dir ? 0 : (buffer.length - 1);
          }

          // Normalize byteOffset: negative offsets start from the end of the buffer
          if (byteOffset < 0) byteOffset = buffer.length + byteOffset;
          if (byteOffset >= buffer.length) {
            if (dir) return -1
            else byteOffset = buffer.length - 1;
          } else if (byteOffset < 0) {
            if (dir) byteOffset = 0;
            else return -1
          }

          // Normalize val
          if (typeof val === 'string') {
            val = Buffer.from(val, encoding);
          }

          // Finally, search either indexOf (if dir is true) or lastIndexOf
          if (Buffer.isBuffer(val)) {
            // Special case: looking for empty string/buffer always fails
            if (val.length === 0) {
              return -1
            }
            return arrayIndexOf(buffer, val, byteOffset, encoding, dir)
          } else if (typeof val === 'number') {
            val = val & 0xFF; // Search for a byte value [0-255]
            if (typeof Uint8Array.prototype.indexOf === 'function') {
              if (dir) {
                return Uint8Array.prototype.indexOf.call(buffer, val, byteOffset)
              } else {
                return Uint8Array.prototype.lastIndexOf.call(buffer, val, byteOffset)
              }
            }
            return arrayIndexOf(buffer, [val], byteOffset, encoding, dir)
          }

          throw new TypeError('val must be string, number or Buffer')
        }

        function arrayIndexOf (arr, val, byteOffset, encoding, dir) {
          let indexSize = 1;
          let arrLength = arr.length;
          let valLength = val.length;

          if (encoding !== undefined) {
            encoding = String(encoding).toLowerCase();
            if (encoding === 'ucs2' || encoding === 'ucs-2' ||
                encoding === 'utf16le' || encoding === 'utf-16le') {
              if (arr.length < 2 || val.length < 2) {
                return -1
              }
              indexSize = 2;
              arrLength /= 2;
              valLength /= 2;
              byteOffset /= 2;
            }
          }

          function read (buf, i) {
            if (indexSize === 1) {
              return buf[i]
            } else {
              return buf.readUInt16BE(i * indexSize)
            }
          }

          let i;
          if (dir) {
            let foundIndex = -1;
            for (i = byteOffset; i < arrLength; i++) {
              if (read(arr, i) === read(val, foundIndex === -1 ? 0 : i - foundIndex)) {
                if (foundIndex === -1) foundIndex = i;
                if (i - foundIndex + 1 === valLength) return foundIndex * indexSize
              } else {
                if (foundIndex !== -1) i -= i - foundIndex;
                foundIndex = -1;
              }
            }
          } else {
            if (byteOffset + valLength > arrLength) byteOffset = arrLength - valLength;
            for (i = byteOffset; i >= 0; i--) {
              let found = true;
              for (let j = 0; j < valLength; j++) {
                if (read(arr, i + j) !== read(val, j)) {
                  found = false;
                  break
                }
              }
              if (found) return i
            }
          }

          return -1
        }

        Buffer.prototype.includes = function includes (val, byteOffset, encoding) {
          return this.indexOf(val, byteOffset, encoding) !== -1
        };

        Buffer.prototype.indexOf = function indexOf (val, byteOffset, encoding) {
          return bidirectionalIndexOf(this, val, byteOffset, encoding, true)
        };

        Buffer.prototype.lastIndexOf = function lastIndexOf (val, byteOffset, encoding) {
          return bidirectionalIndexOf(this, val, byteOffset, encoding, false)
        };

        function hexWrite (buf, string, offset, length) {
          offset = Number(offset) || 0;
          const remaining = buf.length - offset;
          if (!length) {
            length = remaining;
          } else {
            length = Number(length);
            if (length > remaining) {
              length = remaining;
            }
          }

          const strLen = string.length;

          if (length > strLen / 2) {
            length = strLen / 2;
          }
          let i;
          for (i = 0; i < length; ++i) {
            const parsed = parseInt(string.substr(i * 2, 2), 16);
            if (numberIsNaN(parsed)) return i
            buf[offset + i] = parsed;
          }
          return i
        }

        function utf8Write (buf, string, offset, length) {
          return blitBuffer(utf8ToBytes(string, buf.length - offset), buf, offset, length)
        }

        function asciiWrite (buf, string, offset, length) {
          return blitBuffer(asciiToBytes(string), buf, offset, length)
        }

        function base64Write (buf, string, offset, length) {
          return blitBuffer(base64ToBytes(string), buf, offset, length)
        }

        function ucs2Write (buf, string, offset, length) {
          return blitBuffer(utf16leToBytes(string, buf.length - offset), buf, offset, length)
        }

        Buffer.prototype.write = function write (string, offset, length, encoding) {
          // Buffer#write(string)
          if (offset === undefined) {
            encoding = 'utf8';
            length = this.length;
            offset = 0;
          // Buffer#write(string, encoding)
          } else if (length === undefined && typeof offset === 'string') {
            encoding = offset;
            length = this.length;
            offset = 0;
          // Buffer#write(string, offset[, length][, encoding])
          } else if (isFinite(offset)) {
            offset = offset >>> 0;
            if (isFinite(length)) {
              length = length >>> 0;
              if (encoding === undefined) encoding = 'utf8';
            } else {
              encoding = length;
              length = undefined;
            }
          } else {
            throw new Error(
              'Buffer.write(string, encoding, offset[, length]) is no longer supported'
            )
          }

          const remaining = this.length - offset;
          if (length === undefined || length > remaining) length = remaining;

          if ((string.length > 0 && (length < 0 || offset < 0)) || offset > this.length) {
            throw new RangeError('Attempt to write outside buffer bounds')
          }

          if (!encoding) encoding = 'utf8';

          let loweredCase = false;
          for (;;) {
            switch (encoding) {
              case 'hex':
                return hexWrite(this, string, offset, length)

              case 'utf8':
              case 'utf-8':
                return utf8Write(this, string, offset, length)

              case 'ascii':
              case 'latin1':
              case 'binary':
                return asciiWrite(this, string, offset, length)

              case 'base64':
                // Warning: maxLength not taken into account in base64Write
                return base64Write(this, string, offset, length)

              case 'ucs2':
              case 'ucs-2':
              case 'utf16le':
              case 'utf-16le':
                return ucs2Write(this, string, offset, length)

              default:
                if (loweredCase) throw new TypeError('Unknown encoding: ' + encoding)
                encoding = ('' + encoding).toLowerCase();
                loweredCase = true;
            }
          }
        };

        Buffer.prototype.toJSON = function toJSON () {
          return {
            type: 'Buffer',
            data: Array.prototype.slice.call(this._arr || this, 0)
          }
        };

        function base64Slice (buf, start, end) {
          if (start === 0 && end === buf.length) {
            return base64.fromByteArray(buf)
          } else {
            return base64.fromByteArray(buf.slice(start, end))
          }
        }

        function utf8Slice (buf, start, end) {
          end = Math.min(buf.length, end);
          const res = [];

          let i = start;
          while (i < end) {
            const firstByte = buf[i];
            let codePoint = null;
            let bytesPerSequence = (firstByte > 0xEF)
              ? 4
              : (firstByte > 0xDF)
                  ? 3
                  : (firstByte > 0xBF)
                      ? 2
                      : 1;

            if (i + bytesPerSequence <= end) {
              let secondByte, thirdByte, fourthByte, tempCodePoint;

              switch (bytesPerSequence) {
                case 1:
                  if (firstByte < 0x80) {
                    codePoint = firstByte;
                  }
                  break
                case 2:
                  secondByte = buf[i + 1];
                  if ((secondByte & 0xC0) === 0x80) {
                    tempCodePoint = (firstByte & 0x1F) << 0x6 | (secondByte & 0x3F);
                    if (tempCodePoint > 0x7F) {
                      codePoint = tempCodePoint;
                    }
                  }
                  break
                case 3:
                  secondByte = buf[i + 1];
                  thirdByte = buf[i + 2];
                  if ((secondByte & 0xC0) === 0x80 && (thirdByte & 0xC0) === 0x80) {
                    tempCodePoint = (firstByte & 0xF) << 0xC | (secondByte & 0x3F) << 0x6 | (thirdByte & 0x3F);
                    if (tempCodePoint > 0x7FF && (tempCodePoint < 0xD800 || tempCodePoint > 0xDFFF)) {
                      codePoint = tempCodePoint;
                    }
                  }
                  break
                case 4:
                  secondByte = buf[i + 1];
                  thirdByte = buf[i + 2];
                  fourthByte = buf[i + 3];
                  if ((secondByte & 0xC0) === 0x80 && (thirdByte & 0xC0) === 0x80 && (fourthByte & 0xC0) === 0x80) {
                    tempCodePoint = (firstByte & 0xF) << 0x12 | (secondByte & 0x3F) << 0xC | (thirdByte & 0x3F) << 0x6 | (fourthByte & 0x3F);
                    if (tempCodePoint > 0xFFFF && tempCodePoint < 0x110000) {
                      codePoint = tempCodePoint;
                    }
                  }
              }
            }

            if (codePoint === null) {
              // we did not generate a valid codePoint so insert a
              // replacement char (U+FFFD) and advance only 1 byte
              codePoint = 0xFFFD;
              bytesPerSequence = 1;
            } else if (codePoint > 0xFFFF) {
              // encode to utf16 (surrogate pair dance)
              codePoint -= 0x10000;
              res.push(codePoint >>> 10 & 0x3FF | 0xD800);
              codePoint = 0xDC00 | codePoint & 0x3FF;
            }

            res.push(codePoint);
            i += bytesPerSequence;
          }

          return decodeCodePointsArray(res)
        }

        // Based on http://stackoverflow.com/a/22747272/680742, the browser with
        // the lowest limit is Chrome, with 0x10000 args.
        // We go 1 magnitude less, for safety
        const MAX_ARGUMENTS_LENGTH = 0x1000;

        function decodeCodePointsArray (codePoints) {
          const len = codePoints.length;
          if (len <= MAX_ARGUMENTS_LENGTH) {
            return String.fromCharCode.apply(String, codePoints) // avoid extra slice()
          }

          // Decode in chunks to avoid "call stack size exceeded".
          let res = '';
          let i = 0;
          while (i < len) {
            res += String.fromCharCode.apply(
              String,
              codePoints.slice(i, i += MAX_ARGUMENTS_LENGTH)
            );
          }
          return res
        }

        function asciiSlice (buf, start, end) {
          let ret = '';
          end = Math.min(buf.length, end);

          for (let i = start; i < end; ++i) {
            ret += String.fromCharCode(buf[i] & 0x7F);
          }
          return ret
        }

        function latin1Slice (buf, start, end) {
          let ret = '';
          end = Math.min(buf.length, end);

          for (let i = start; i < end; ++i) {
            ret += String.fromCharCode(buf[i]);
          }
          return ret
        }

        function hexSlice (buf, start, end) {
          const len = buf.length;

          if (!start || start < 0) start = 0;
          if (!end || end < 0 || end > len) end = len;

          let out = '';
          for (let i = start; i < end; ++i) {
            out += hexSliceLookupTable[buf[i]];
          }
          return out
        }

        function utf16leSlice (buf, start, end) {
          const bytes = buf.slice(start, end);
          let res = '';
          // If bytes.length is odd, the last 8 bits must be ignored (same as node.js)
          for (let i = 0; i < bytes.length - 1; i += 2) {
            res += String.fromCharCode(bytes[i] + (bytes[i + 1] * 256));
          }
          return res
        }

        Buffer.prototype.slice = function slice (start, end) {
          const len = this.length;
          start = ~~start;
          end = end === undefined ? len : ~~end;

          if (start < 0) {
            start += len;
            if (start < 0) start = 0;
          } else if (start > len) {
            start = len;
          }

          if (end < 0) {
            end += len;
            if (end < 0) end = 0;
          } else if (end > len) {
            end = len;
          }

          if (end < start) end = start;

          const newBuf = this.subarray(start, end);
          // Return an augmented `Uint8Array` instance
          Object.setPrototypeOf(newBuf, Buffer.prototype);

          return newBuf
        };

        /*
         * Need to make sure that buffer isn't trying to write out of bounds.
         */
        function checkOffset (offset, ext, length) {
          if ((offset % 1) !== 0 || offset < 0) throw new RangeError('offset is not uint')
          if (offset + ext > length) throw new RangeError('Trying to access beyond buffer length')
        }

        Buffer.prototype.readUintLE =
        Buffer.prototype.readUIntLE = function readUIntLE (offset, byteLength, noAssert) {
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) checkOffset(offset, byteLength, this.length);

          let val = this[offset];
          let mul = 1;
          let i = 0;
          while (++i < byteLength && (mul *= 0x100)) {
            val += this[offset + i] * mul;
          }

          return val
        };

        Buffer.prototype.readUintBE =
        Buffer.prototype.readUIntBE = function readUIntBE (offset, byteLength, noAssert) {
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) {
            checkOffset(offset, byteLength, this.length);
          }

          let val = this[offset + --byteLength];
          let mul = 1;
          while (byteLength > 0 && (mul *= 0x100)) {
            val += this[offset + --byteLength] * mul;
          }

          return val
        };

        Buffer.prototype.readUint8 =
        Buffer.prototype.readUInt8 = function readUInt8 (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 1, this.length);
          return this[offset]
        };

        Buffer.prototype.readUint16LE =
        Buffer.prototype.readUInt16LE = function readUInt16LE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 2, this.length);
          return this[offset] | (this[offset + 1] << 8)
        };

        Buffer.prototype.readUint16BE =
        Buffer.prototype.readUInt16BE = function readUInt16BE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 2, this.length);
          return (this[offset] << 8) | this[offset + 1]
        };

        Buffer.prototype.readUint32LE =
        Buffer.prototype.readUInt32LE = function readUInt32LE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);

          return ((this[offset]) |
              (this[offset + 1] << 8) |
              (this[offset + 2] << 16)) +
              (this[offset + 3] * 0x1000000)
        };

        Buffer.prototype.readUint32BE =
        Buffer.prototype.readUInt32BE = function readUInt32BE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);

          return (this[offset] * 0x1000000) +
            ((this[offset + 1] << 16) |
            (this[offset + 2] << 8) |
            this[offset + 3])
        };

        Buffer.prototype.readBigUInt64LE = defineBigIntMethod(function readBigUInt64LE (offset) {
          offset = offset >>> 0;
          validateNumber(offset, 'offset');
          const first = this[offset];
          const last = this[offset + 7];
          if (first === undefined || last === undefined) {
            boundsError(offset, this.length - 8);
          }

          const lo = first +
            this[++offset] * 2 ** 8 +
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 24;

          const hi = this[++offset] +
            this[++offset] * 2 ** 8 +
            this[++offset] * 2 ** 16 +
            last * 2 ** 24;

          return BigInt(lo) + (BigInt(hi) << BigInt(32))
        });

        Buffer.prototype.readBigUInt64BE = defineBigIntMethod(function readBigUInt64BE (offset) {
          offset = offset >>> 0;
          validateNumber(offset, 'offset');
          const first = this[offset];
          const last = this[offset + 7];
          if (first === undefined || last === undefined) {
            boundsError(offset, this.length - 8);
          }

          const hi = first * 2 ** 24 +
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 8 +
            this[++offset];

          const lo = this[++offset] * 2 ** 24 +
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 8 +
            last;

          return (BigInt(hi) << BigInt(32)) + BigInt(lo)
        });

        Buffer.prototype.readIntLE = function readIntLE (offset, byteLength, noAssert) {
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) checkOffset(offset, byteLength, this.length);

          let val = this[offset];
          let mul = 1;
          let i = 0;
          while (++i < byteLength && (mul *= 0x100)) {
            val += this[offset + i] * mul;
          }
          mul *= 0x80;

          if (val >= mul) val -= Math.pow(2, 8 * byteLength);

          return val
        };

        Buffer.prototype.readIntBE = function readIntBE (offset, byteLength, noAssert) {
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) checkOffset(offset, byteLength, this.length);

          let i = byteLength;
          let mul = 1;
          let val = this[offset + --i];
          while (i > 0 && (mul *= 0x100)) {
            val += this[offset + --i] * mul;
          }
          mul *= 0x80;

          if (val >= mul) val -= Math.pow(2, 8 * byteLength);

          return val
        };

        Buffer.prototype.readInt8 = function readInt8 (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 1, this.length);
          if (!(this[offset] & 0x80)) return (this[offset])
          return ((0xff - this[offset] + 1) * -1)
        };

        Buffer.prototype.readInt16LE = function readInt16LE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 2, this.length);
          const val = this[offset] | (this[offset + 1] << 8);
          return (val & 0x8000) ? val | 0xFFFF0000 : val
        };

        Buffer.prototype.readInt16BE = function readInt16BE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 2, this.length);
          const val = this[offset + 1] | (this[offset] << 8);
          return (val & 0x8000) ? val | 0xFFFF0000 : val
        };

        Buffer.prototype.readInt32LE = function readInt32LE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);

          return (this[offset]) |
            (this[offset + 1] << 8) |
            (this[offset + 2] << 16) |
            (this[offset + 3] << 24)
        };

        Buffer.prototype.readInt32BE = function readInt32BE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);

          return (this[offset] << 24) |
            (this[offset + 1] << 16) |
            (this[offset + 2] << 8) |
            (this[offset + 3])
        };

        Buffer.prototype.readBigInt64LE = defineBigIntMethod(function readBigInt64LE (offset) {
          offset = offset >>> 0;
          validateNumber(offset, 'offset');
          const first = this[offset];
          const last = this[offset + 7];
          if (first === undefined || last === undefined) {
            boundsError(offset, this.length - 8);
          }

          const val = this[offset + 4] +
            this[offset + 5] * 2 ** 8 +
            this[offset + 6] * 2 ** 16 +
            (last << 24); // Overflow

          return (BigInt(val) << BigInt(32)) +
            BigInt(first +
            this[++offset] * 2 ** 8 +
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 24)
        });

        Buffer.prototype.readBigInt64BE = defineBigIntMethod(function readBigInt64BE (offset) {
          offset = offset >>> 0;
          validateNumber(offset, 'offset');
          const first = this[offset];
          const last = this[offset + 7];
          if (first === undefined || last === undefined) {
            boundsError(offset, this.length - 8);
          }

          const val = (first << 24) + // Overflow
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 8 +
            this[++offset];

          return (BigInt(val) << BigInt(32)) +
            BigInt(this[++offset] * 2 ** 24 +
            this[++offset] * 2 ** 16 +
            this[++offset] * 2 ** 8 +
            last)
        });

        Buffer.prototype.readFloatLE = function readFloatLE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);
          return ieee754$1.read(this, offset, true, 23, 4)
        };

        Buffer.prototype.readFloatBE = function readFloatBE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 4, this.length);
          return ieee754$1.read(this, offset, false, 23, 4)
        };

        Buffer.prototype.readDoubleLE = function readDoubleLE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 8, this.length);
          return ieee754$1.read(this, offset, true, 52, 8)
        };

        Buffer.prototype.readDoubleBE = function readDoubleBE (offset, noAssert) {
          offset = offset >>> 0;
          if (!noAssert) checkOffset(offset, 8, this.length);
          return ieee754$1.read(this, offset, false, 52, 8)
        };

        function checkInt (buf, value, offset, ext, max, min) {
          if (!Buffer.isBuffer(buf)) throw new TypeError('"buffer" argument must be a Buffer instance')
          if (value > max || value < min) throw new RangeError('"value" argument is out of bounds')
          if (offset + ext > buf.length) throw new RangeError('Index out of range')
        }

        Buffer.prototype.writeUintLE =
        Buffer.prototype.writeUIntLE = function writeUIntLE (value, offset, byteLength, noAssert) {
          value = +value;
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) {
            const maxBytes = Math.pow(2, 8 * byteLength) - 1;
            checkInt(this, value, offset, byteLength, maxBytes, 0);
          }

          let mul = 1;
          let i = 0;
          this[offset] = value & 0xFF;
          while (++i < byteLength && (mul *= 0x100)) {
            this[offset + i] = (value / mul) & 0xFF;
          }

          return offset + byteLength
        };

        Buffer.prototype.writeUintBE =
        Buffer.prototype.writeUIntBE = function writeUIntBE (value, offset, byteLength, noAssert) {
          value = +value;
          offset = offset >>> 0;
          byteLength = byteLength >>> 0;
          if (!noAssert) {
            const maxBytes = Math.pow(2, 8 * byteLength) - 1;
            checkInt(this, value, offset, byteLength, maxBytes, 0);
          }

          let i = byteLength - 1;
          let mul = 1;
          this[offset + i] = value & 0xFF;
          while (--i >= 0 && (mul *= 0x100)) {
            this[offset + i] = (value / mul) & 0xFF;
          }

          return offset + byteLength
        };

        Buffer.prototype.writeUint8 =
        Buffer.prototype.writeUInt8 = function writeUInt8 (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 1, 0xff, 0);
          this[offset] = (value & 0xff);
          return offset + 1
        };

        Buffer.prototype.writeUint16LE =
        Buffer.prototype.writeUInt16LE = function writeUInt16LE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 2, 0xffff, 0);
          this[offset] = (value & 0xff);
          this[offset + 1] = (value >>> 8);
          return offset + 2
        };

        Buffer.prototype.writeUint16BE =
        Buffer.prototype.writeUInt16BE = function writeUInt16BE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 2, 0xffff, 0);
          this[offset] = (value >>> 8);
          this[offset + 1] = (value & 0xff);
          return offset + 2
        };

        Buffer.prototype.writeUint32LE =
        Buffer.prototype.writeUInt32LE = function writeUInt32LE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 4, 0xffffffff, 0);
          this[offset + 3] = (value >>> 24);
          this[offset + 2] = (value >>> 16);
          this[offset + 1] = (value >>> 8);
          this[offset] = (value & 0xff);
          return offset + 4
        };

        Buffer.prototype.writeUint32BE =
        Buffer.prototype.writeUInt32BE = function writeUInt32BE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 4, 0xffffffff, 0);
          this[offset] = (value >>> 24);
          this[offset + 1] = (value >>> 16);
          this[offset + 2] = (value >>> 8);
          this[offset + 3] = (value & 0xff);
          return offset + 4
        };

        function wrtBigUInt64LE (buf, value, offset, min, max) {
          checkIntBI(value, min, max, buf, offset, 7);

          let lo = Number(value & BigInt(0xffffffff));
          buf[offset++] = lo;
          lo = lo >> 8;
          buf[offset++] = lo;
          lo = lo >> 8;
          buf[offset++] = lo;
          lo = lo >> 8;
          buf[offset++] = lo;
          let hi = Number(value >> BigInt(32) & BigInt(0xffffffff));
          buf[offset++] = hi;
          hi = hi >> 8;
          buf[offset++] = hi;
          hi = hi >> 8;
          buf[offset++] = hi;
          hi = hi >> 8;
          buf[offset++] = hi;
          return offset
        }

        function wrtBigUInt64BE (buf, value, offset, min, max) {
          checkIntBI(value, min, max, buf, offset, 7);

          let lo = Number(value & BigInt(0xffffffff));
          buf[offset + 7] = lo;
          lo = lo >> 8;
          buf[offset + 6] = lo;
          lo = lo >> 8;
          buf[offset + 5] = lo;
          lo = lo >> 8;
          buf[offset + 4] = lo;
          let hi = Number(value >> BigInt(32) & BigInt(0xffffffff));
          buf[offset + 3] = hi;
          hi = hi >> 8;
          buf[offset + 2] = hi;
          hi = hi >> 8;
          buf[offset + 1] = hi;
          hi = hi >> 8;
          buf[offset] = hi;
          return offset + 8
        }

        Buffer.prototype.writeBigUInt64LE = defineBigIntMethod(function writeBigUInt64LE (value, offset = 0) {
          return wrtBigUInt64LE(this, value, offset, BigInt(0), BigInt('0xffffffffffffffff'))
        });

        Buffer.prototype.writeBigUInt64BE = defineBigIntMethod(function writeBigUInt64BE (value, offset = 0) {
          return wrtBigUInt64BE(this, value, offset, BigInt(0), BigInt('0xffffffffffffffff'))
        });

        Buffer.prototype.writeIntLE = function writeIntLE (value, offset, byteLength, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) {
            const limit = Math.pow(2, (8 * byteLength) - 1);

            checkInt(this, value, offset, byteLength, limit - 1, -limit);
          }

          let i = 0;
          let mul = 1;
          let sub = 0;
          this[offset] = value & 0xFF;
          while (++i < byteLength && (mul *= 0x100)) {
            if (value < 0 && sub === 0 && this[offset + i - 1] !== 0) {
              sub = 1;
            }
            this[offset + i] = ((value / mul) >> 0) - sub & 0xFF;
          }

          return offset + byteLength
        };

        Buffer.prototype.writeIntBE = function writeIntBE (value, offset, byteLength, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) {
            const limit = Math.pow(2, (8 * byteLength) - 1);

            checkInt(this, value, offset, byteLength, limit - 1, -limit);
          }

          let i = byteLength - 1;
          let mul = 1;
          let sub = 0;
          this[offset + i] = value & 0xFF;
          while (--i >= 0 && (mul *= 0x100)) {
            if (value < 0 && sub === 0 && this[offset + i + 1] !== 0) {
              sub = 1;
            }
            this[offset + i] = ((value / mul) >> 0) - sub & 0xFF;
          }

          return offset + byteLength
        };

        Buffer.prototype.writeInt8 = function writeInt8 (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 1, 0x7f, -0x80);
          if (value < 0) value = 0xff + value + 1;
          this[offset] = (value & 0xff);
          return offset + 1
        };

        Buffer.prototype.writeInt16LE = function writeInt16LE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 2, 0x7fff, -0x8000);
          this[offset] = (value & 0xff);
          this[offset + 1] = (value >>> 8);
          return offset + 2
        };

        Buffer.prototype.writeInt16BE = function writeInt16BE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 2, 0x7fff, -0x8000);
          this[offset] = (value >>> 8);
          this[offset + 1] = (value & 0xff);
          return offset + 2
        };

        Buffer.prototype.writeInt32LE = function writeInt32LE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 4, 0x7fffffff, -0x80000000);
          this[offset] = (value & 0xff);
          this[offset + 1] = (value >>> 8);
          this[offset + 2] = (value >>> 16);
          this[offset + 3] = (value >>> 24);
          return offset + 4
        };

        Buffer.prototype.writeInt32BE = function writeInt32BE (value, offset, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) checkInt(this, value, offset, 4, 0x7fffffff, -0x80000000);
          if (value < 0) value = 0xffffffff + value + 1;
          this[offset] = (value >>> 24);
          this[offset + 1] = (value >>> 16);
          this[offset + 2] = (value >>> 8);
          this[offset + 3] = (value & 0xff);
          return offset + 4
        };

        Buffer.prototype.writeBigInt64LE = defineBigIntMethod(function writeBigInt64LE (value, offset = 0) {
          return wrtBigUInt64LE(this, value, offset, -BigInt('0x8000000000000000'), BigInt('0x7fffffffffffffff'))
        });

        Buffer.prototype.writeBigInt64BE = defineBigIntMethod(function writeBigInt64BE (value, offset = 0) {
          return wrtBigUInt64BE(this, value, offset, -BigInt('0x8000000000000000'), BigInt('0x7fffffffffffffff'))
        });

        function checkIEEE754 (buf, value, offset, ext, max, min) {
          if (offset + ext > buf.length) throw new RangeError('Index out of range')
          if (offset < 0) throw new RangeError('Index out of range')
        }

        function writeFloat (buf, value, offset, littleEndian, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) {
            checkIEEE754(buf, value, offset, 4);
          }
          ieee754$1.write(buf, value, offset, littleEndian, 23, 4);
          return offset + 4
        }

        Buffer.prototype.writeFloatLE = function writeFloatLE (value, offset, noAssert) {
          return writeFloat(this, value, offset, true, noAssert)
        };

        Buffer.prototype.writeFloatBE = function writeFloatBE (value, offset, noAssert) {
          return writeFloat(this, value, offset, false, noAssert)
        };

        function writeDouble (buf, value, offset, littleEndian, noAssert) {
          value = +value;
          offset = offset >>> 0;
          if (!noAssert) {
            checkIEEE754(buf, value, offset, 8);
          }
          ieee754$1.write(buf, value, offset, littleEndian, 52, 8);
          return offset + 8
        }

        Buffer.prototype.writeDoubleLE = function writeDoubleLE (value, offset, noAssert) {
          return writeDouble(this, value, offset, true, noAssert)
        };

        Buffer.prototype.writeDoubleBE = function writeDoubleBE (value, offset, noAssert) {
          return writeDouble(this, value, offset, false, noAssert)
        };

        // copy(targetBuffer, targetStart=0, sourceStart=0, sourceEnd=buffer.length)
        Buffer.prototype.copy = function copy (target, targetStart, start, end) {
          if (!Buffer.isBuffer(target)) throw new TypeError('argument should be a Buffer')
          if (!start) start = 0;
          if (!end && end !== 0) end = this.length;
          if (targetStart >= target.length) targetStart = target.length;
          if (!targetStart) targetStart = 0;
          if (end > 0 && end < start) end = start;

          // Copy 0 bytes; we're done
          if (end === start) return 0
          if (target.length === 0 || this.length === 0) return 0

          // Fatal error conditions
          if (targetStart < 0) {
            throw new RangeError('targetStart out of bounds')
          }
          if (start < 0 || start >= this.length) throw new RangeError('Index out of range')
          if (end < 0) throw new RangeError('sourceEnd out of bounds')

          // Are we oob?
          if (end > this.length) end = this.length;
          if (target.length - targetStart < end - start) {
            end = target.length - targetStart + start;
          }

          const len = end - start;

          if (this === target && typeof Uint8Array.prototype.copyWithin === 'function') {
            // Use built-in when available, missing from IE11
            this.copyWithin(targetStart, start, end);
          } else {
            Uint8Array.prototype.set.call(
              target,
              this.subarray(start, end),
              targetStart
            );
          }

          return len
        };

        // Usage:
        //    buffer.fill(number[, offset[, end]])
        //    buffer.fill(buffer[, offset[, end]])
        //    buffer.fill(string[, offset[, end]][, encoding])
        Buffer.prototype.fill = function fill (val, start, end, encoding) {
          // Handle string cases:
          if (typeof val === 'string') {
            if (typeof start === 'string') {
              encoding = start;
              start = 0;
              end = this.length;
            } else if (typeof end === 'string') {
              encoding = end;
              end = this.length;
            }
            if (encoding !== undefined && typeof encoding !== 'string') {
              throw new TypeError('encoding must be a string')
            }
            if (typeof encoding === 'string' && !Buffer.isEncoding(encoding)) {
              throw new TypeError('Unknown encoding: ' + encoding)
            }
            if (val.length === 1) {
              const code = val.charCodeAt(0);
              if ((encoding === 'utf8' && code < 128) ||
                  encoding === 'latin1') {
                // Fast path: If `val` fits into a single byte, use that numeric value.
                val = code;
              }
            }
          } else if (typeof val === 'number') {
            val = val & 255;
          } else if (typeof val === 'boolean') {
            val = Number(val);
          }

          // Invalid ranges are not set to a default, so can range check early.
          if (start < 0 || this.length < start || this.length < end) {
            throw new RangeError('Out of range index')
          }

          if (end <= start) {
            return this
          }

          start = start >>> 0;
          end = end === undefined ? this.length : end >>> 0;

          if (!val) val = 0;

          let i;
          if (typeof val === 'number') {
            for (i = start; i < end; ++i) {
              this[i] = val;
            }
          } else {
            const bytes = Buffer.isBuffer(val)
              ? val
              : Buffer.from(val, encoding);
            const len = bytes.length;
            if (len === 0) {
              throw new TypeError('The value "' + val +
                '" is invalid for argument "value"')
            }
            for (i = 0; i < end - start; ++i) {
              this[i + start] = bytes[i % len];
            }
          }

          return this
        };

        // CUSTOM ERRORS
        // =============

        // Simplified versions from Node, changed for Buffer-only usage
        const errors = {};
        function E (sym, getMessage, Base) {
          errors[sym] = class NodeError extends Base {
            constructor () {
              super();

              Object.defineProperty(this, 'message', {
                value: getMessage.apply(this, arguments),
                writable: true,
                configurable: true
              });

              // Add the error code to the name to include it in the stack trace.
              this.name = `${this.name} [${sym}]`;
              // Access the stack to generate the error message including the error code
              // from the name.
              this.stack; // eslint-disable-line no-unused-expressions
              // Reset the name to the actual name.
              delete this.name;
            }

            get code () {
              return sym
            }

            set code (value) {
              Object.defineProperty(this, 'code', {
                configurable: true,
                enumerable: true,
                value,
                writable: true
              });
            }

            toString () {
              return `${this.name} [${sym}]: ${this.message}`
            }
          };
        }

        E('ERR_BUFFER_OUT_OF_BOUNDS',
          function (name) {
            if (name) {
              return `${name} is outside of buffer bounds`
            }

            return 'Attempt to access memory outside buffer bounds'
          }, RangeError);
        E('ERR_INVALID_ARG_TYPE',
          function (name, actual) {
            return `The "${name}" argument must be of type number. Received type ${typeof actual}`
          }, TypeError);
        E('ERR_OUT_OF_RANGE',
          function (str, range, input) {
            let msg = `The value of "${str}" is out of range.`;
            let received = input;
            if (Number.isInteger(input) && Math.abs(input) > 2 ** 32) {
              received = addNumericalSeparator(String(input));
            } else if (typeof input === 'bigint') {
              received = String(input);
              if (input > BigInt(2) ** BigInt(32) || input < -(BigInt(2) ** BigInt(32))) {
                received = addNumericalSeparator(received);
              }
              received += 'n';
            }
            msg += ` It must be ${range}. Received ${received}`;
            return msg
          }, RangeError);

        function addNumericalSeparator (val) {
          let res = '';
          let i = val.length;
          const start = val[0] === '-' ? 1 : 0;
          for (; i >= start + 4; i -= 3) {
            res = `_${val.slice(i - 3, i)}${res}`;
          }
          return `${val.slice(0, i)}${res}`
        }

        // CHECK FUNCTIONS
        // ===============

        function checkBounds (buf, offset, byteLength) {
          validateNumber(offset, 'offset');
          if (buf[offset] === undefined || buf[offset + byteLength] === undefined) {
            boundsError(offset, buf.length - (byteLength + 1));
          }
        }

        function checkIntBI (value, min, max, buf, offset, byteLength) {
          if (value > max || value < min) {
            const n = typeof min === 'bigint' ? 'n' : '';
            let range;
            if (byteLength > 3) {
              if (min === 0 || min === BigInt(0)) {
                range = `>= 0${n} and < 2${n} ** ${(byteLength + 1) * 8}${n}`;
              } else {
                range = `>= -(2${n} ** ${(byteLength + 1) * 8 - 1}${n}) and < 2 ** ` +
                        `${(byteLength + 1) * 8 - 1}${n}`;
              }
            } else {
              range = `>= ${min}${n} and <= ${max}${n}`;
            }
            throw new errors.ERR_OUT_OF_RANGE('value', range, value)
          }
          checkBounds(buf, offset, byteLength);
        }

        function validateNumber (value, name) {
          if (typeof value !== 'number') {
            throw new errors.ERR_INVALID_ARG_TYPE(name, 'number', value)
          }
        }

        function boundsError (value, length, type) {
          if (Math.floor(value) !== value) {
            validateNumber(value, type);
            throw new errors.ERR_OUT_OF_RANGE(type || 'offset', 'an integer', value)
          }

          if (length < 0) {
            throw new errors.ERR_BUFFER_OUT_OF_BOUNDS()
          }

          throw new errors.ERR_OUT_OF_RANGE(type || 'offset',
                                            `>= ${type ? 1 : 0} and <= ${length}`,
                                            value)
        }

        // HELPER FUNCTIONS
        // ================

        const INVALID_BASE64_RE = /[^+/0-9A-Za-z-_]/g;

        function base64clean (str) {
          // Node takes equal signs as end of the Base64 encoding
          str = str.split('=')[0];
          // Node strips out invalid characters like \n and \t from the string, base64-js does not
          str = str.trim().replace(INVALID_BASE64_RE, '');
          // Node converts strings with length < 2 to ''
          if (str.length < 2) return ''
          // Node allows for non-padded base64 strings (missing trailing ===), base64-js does not
          while (str.length % 4 !== 0) {
            str = str + '=';
          }
          return str
        }

        function utf8ToBytes (string, units) {
          units = units || Infinity;
          let codePoint;
          const length = string.length;
          let leadSurrogate = null;
          const bytes = [];

          for (let i = 0; i < length; ++i) {
            codePoint = string.charCodeAt(i);

            // is surrogate component
            if (codePoint > 0xD7FF && codePoint < 0xE000) {
              // last char was a lead
              if (!leadSurrogate) {
                // no lead yet
                if (codePoint > 0xDBFF) {
                  // unexpected trail
                  if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
                  continue
                } else if (i + 1 === length) {
                  // unpaired lead
                  if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
                  continue
                }

                // valid lead
                leadSurrogate = codePoint;

                continue
              }

              // 2 leads in a row
              if (codePoint < 0xDC00) {
                if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
                leadSurrogate = codePoint;
                continue
              }

              // valid surrogate pair
              codePoint = (leadSurrogate - 0xD800 << 10 | codePoint - 0xDC00) + 0x10000;
            } else if (leadSurrogate) {
              // valid bmp char, but last char was a lead
              if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
            }

            leadSurrogate = null;

            // encode utf8
            if (codePoint < 0x80) {
              if ((units -= 1) < 0) break
              bytes.push(codePoint);
            } else if (codePoint < 0x800) {
              if ((units -= 2) < 0) break
              bytes.push(
                codePoint >> 0x6 | 0xC0,
                codePoint & 0x3F | 0x80
              );
            } else if (codePoint < 0x10000) {
              if ((units -= 3) < 0) break
              bytes.push(
                codePoint >> 0xC | 0xE0,
                codePoint >> 0x6 & 0x3F | 0x80,
                codePoint & 0x3F | 0x80
              );
            } else if (codePoint < 0x110000) {
              if ((units -= 4) < 0) break
              bytes.push(
                codePoint >> 0x12 | 0xF0,
                codePoint >> 0xC & 0x3F | 0x80,
                codePoint >> 0x6 & 0x3F | 0x80,
                codePoint & 0x3F | 0x80
              );
            } else {
              throw new Error('Invalid code point')
            }
          }

          return bytes
        }

        function asciiToBytes (str) {
          const byteArray = [];
          for (let i = 0; i < str.length; ++i) {
            // Node's code seems to be doing this and not & 0x7F..
            byteArray.push(str.charCodeAt(i) & 0xFF);
          }
          return byteArray
        }

        function utf16leToBytes (str, units) {
          let c, hi, lo;
          const byteArray = [];
          for (let i = 0; i < str.length; ++i) {
            if ((units -= 2) < 0) break

            c = str.charCodeAt(i);
            hi = c >> 8;
            lo = c % 256;
            byteArray.push(lo);
            byteArray.push(hi);
          }

          return byteArray
        }

        function base64ToBytes (str) {
          return base64.toByteArray(base64clean(str))
        }

        function blitBuffer (src, dst, offset, length) {
          let i;
          for (i = 0; i < length; ++i) {
            if ((i + offset >= dst.length) || (i >= src.length)) break
            dst[i + offset] = src[i];
          }
          return i
        }

        // ArrayBuffer or Uint8Array objects from other contexts (i.e. iframes) do not pass
        // the `instanceof` check but they should be treated as of that type.
        // See: https://github.com/feross/buffer/issues/166
        function isInstance (obj, type) {
          return obj instanceof type ||
            (obj != null && obj.constructor != null && obj.constructor.name != null &&
              obj.constructor.name === type.name)
        }
        function numberIsNaN (obj) {
          // For IE11 support
          return obj !== obj // eslint-disable-line no-self-compare
        }

        // Create lookup table for `toString('hex')`
        // See: https://github.com/feross/buffer/issues/219
        const hexSliceLookupTable = (function () {
          const alphabet = '0123456789abcdef';
          const table = new Array(256);
          for (let i = 0; i < 16; ++i) {
            const i16 = i * 16;
            for (let j = 0; j < 16; ++j) {
              table[i16 + j] = alphabet[i] + alphabet[j];
            }
          }
          return table
        })();

        // Return not function with Error if BigInt not supported
        function defineBigIntMethod (fn) {
          return typeof BigInt === 'undefined' ? BufferBigIntNotDefined : fn
        }

        function BufferBigIntNotDefined () {
          throw new Error('BigInt not supported')
        }
        }(buffer));

        Promise.prototype['finally'] = function finallyPolyfill(callback) {
            const constructor = this.constructor;
            return this.then(function (value) {
                return constructor.resolve(callback()).then(function () {
                    return value;
                });
            }, function (reason) {
                return constructor.resolve(callback()).then(function () {
                    throw reason;
                });
            });
        };
        function Deferred() {
            const defer = {};
            defer.promise = new Promise(function (resolve, reject) {
                defer.resolve = resolve;
                defer.reject = reject;
            });
            return defer;
        }
        function timeout(ms, cb) {
            const defer = Deferred();
            const wait = setTimeout(() => {
                clearTimeout(wait);
                if (cb) {
                    cb && cb(defer.resolve, defer.reject);
                }
                else {
                    defer.reject('Timed out in ' + ms + 'ms.');
                }
            }, ms);
            return defer.promise;
        }
        class DataFormat {
            static jsonToHex(json) {
                return flow_1(DataFormat.jsonToStr, DataFormat.strToHex)(json);
            }
            static hexToJson(strHex) {
                return flow_1(DataFormat.hexToBuf, DataFormat.bufToJson)(strHex);
            }
            static jsonToBuf(json) {
                return flow_1(DataFormat.jsonToStr, DataFormat.strToBuf)(json);
            }
            static bufToJson(buf) {
                return flow_1(DataFormat.bufToStr, DataFormat.strToJson)(buf);
            }
            static jsonToStr(json) {
                try {
                    return JSON.stringify(json);
                }
                catch (_) {
                    return '[Circular]';
                }
            }
            static strToJson(str) {
                try {
                    return JSON.parse(str);
                }
                catch (_) {
                    return {
                        error: Error('json parse error'),
                    };
                }
            }
            static strToHex(str) {
                return flow_1(DataFormat.strToBuf, DataFormat.bufToHex)(str);
            }
            static hexToStr(strHex) {
                return flow_1(DataFormat.hexToBuf, DataFormat.bufToStr)(strHex);
            }
            static strToBuf(str) {
                return buffer.Buffer.from(str, 'utf8');
            }
            static bufToStr(buf) {
                return buf.toString('utf8');
            }
            static hexToBuf(strHex) {
                return buffer.Buffer.from(strHex, 'hex');
            }
            static bufToHex(buf) {
                return buf.toString('hex');
            }
            static binToBuf(bin) {
                return buffer.Buffer.from(bin);
            }
            static bufToBin(buf) {
                return buf.buffer;
            }
            static binToHex(bin) {
                return flow_1(DataFormat.binToBuf, DataFormat.bufToHex)(bin);
            }
            static hexToBin(hex) {
                return flow_1(DataFormat.hexToBuf, DataFormat.bufToBin)(hex);
            }
            static arrayToBuf(array) {
                return buffer.Buffer.from(array);
            }
            static bufToArray(buf) {
                return Array.prototype.slice.call(buf);
            }
            static arrayToHex(array) {
                return flow_1(DataFormat.arrayToBuf, DataFormat.bufToHex)(array);
            }
            static hexToArray(hex) {
                return flow_1(DataFormat.hexToBuf, DataFormat.bufToArray)(hex);
            }
        }

        var eventemitter3 = {exports: {}};

        (function (module) {

        var has = Object.prototype.hasOwnProperty
          , prefix = '~';

        /**
         * Constructor to create a storage for our `EE` objects.
         * An `Events` instance is a plain object whose properties are event names.
         *
         * @constructor
         * @private
         */
        function Events() {}

        //
        // We try to not inherit from `Object.prototype`. In some engines creating an
        // instance in this way is faster than calling `Object.create(null)` directly.
        // If `Object.create(null)` is not supported we prefix the event names with a
        // character to make sure that the built-in object properties are not
        // overridden or used as an attack vector.
        //
        if (Object.create) {
          Events.prototype = Object.create(null);

          //
          // This hack is needed because the `__proto__` property is still inherited in
          // some old browsers like Android 4, iPhone 5.1, Opera 11 and Safari 5.
          //
          if (!new Events().__proto__) prefix = false;
        }

        /**
         * Representation of a single event listener.
         *
         * @param {Function} fn The listener function.
         * @param {*} context The context to invoke the listener with.
         * @param {Boolean} [once=false] Specify if the listener is a one-time listener.
         * @constructor
         * @private
         */
        function EE(fn, context, once) {
          this.fn = fn;
          this.context = context;
          this.once = once || false;
        }

        /**
         * Add a listener for a given event.
         *
         * @param {EventEmitter} emitter Reference to the `EventEmitter` instance.
         * @param {(String|Symbol)} event The event name.
         * @param {Function} fn The listener function.
         * @param {*} context The context to invoke the listener with.
         * @param {Boolean} once Specify if the listener is a one-time listener.
         * @returns {EventEmitter}
         * @private
         */
        function addListener(emitter, event, fn, context, once) {
          if (typeof fn !== 'function') {
            throw new TypeError('The listener must be a function');
          }

          var listener = new EE(fn, context || emitter, once)
            , evt = prefix ? prefix + event : event;

          if (!emitter._events[evt]) emitter._events[evt] = listener, emitter._eventsCount++;
          else if (!emitter._events[evt].fn) emitter._events[evt].push(listener);
          else emitter._events[evt] = [emitter._events[evt], listener];

          return emitter;
        }

        /**
         * Clear event by name.
         *
         * @param {EventEmitter} emitter Reference to the `EventEmitter` instance.
         * @param {(String|Symbol)} evt The Event name.
         * @private
         */
        function clearEvent(emitter, evt) {
          if (--emitter._eventsCount === 0) emitter._events = new Events();
          else delete emitter._events[evt];
        }

        /**
         * Minimal `EventEmitter` interface that is molded against the Node.js
         * `EventEmitter` interface.
         *
         * @constructor
         * @public
         */
        function EventEmitter() {
          this._events = new Events();
          this._eventsCount = 0;
        }

        /**
         * Return an array listing the events for which the emitter has registered
         * listeners.
         *
         * @returns {Array}
         * @public
         */
        EventEmitter.prototype.eventNames = function eventNames() {
          var names = []
            , events
            , name;

          if (this._eventsCount === 0) return names;

          for (name in (events = this._events)) {
            if (has.call(events, name)) names.push(prefix ? name.slice(1) : name);
          }

          if (Object.getOwnPropertySymbols) {
            return names.concat(Object.getOwnPropertySymbols(events));
          }

          return names;
        };

        /**
         * Return the listeners registered for a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @returns {Array} The registered listeners.
         * @public
         */
        EventEmitter.prototype.listeners = function listeners(event) {
          var evt = prefix ? prefix + event : event
            , handlers = this._events[evt];

          if (!handlers) return [];
          if (handlers.fn) return [handlers.fn];

          for (var i = 0, l = handlers.length, ee = new Array(l); i < l; i++) {
            ee[i] = handlers[i].fn;
          }

          return ee;
        };

        /**
         * Return the number of listeners listening to a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @returns {Number} The number of listeners.
         * @public
         */
        EventEmitter.prototype.listenerCount = function listenerCount(event) {
          var evt = prefix ? prefix + event : event
            , listeners = this._events[evt];

          if (!listeners) return 0;
          if (listeners.fn) return 1;
          return listeners.length;
        };

        /**
         * Calls each of the listeners registered for a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @returns {Boolean} `true` if the event had listeners, else `false`.
         * @public
         */
        EventEmitter.prototype.emit = function emit(event, a1, a2, a3, a4, a5) {
          var evt = prefix ? prefix + event : event;

          if (!this._events[evt]) return false;

          var listeners = this._events[evt]
            , len = arguments.length
            , args
            , i;

          if (listeners.fn) {
            if (listeners.once) this.removeListener(event, listeners.fn, undefined, true);

            switch (len) {
              case 1: return listeners.fn.call(listeners.context), true;
              case 2: return listeners.fn.call(listeners.context, a1), true;
              case 3: return listeners.fn.call(listeners.context, a1, a2), true;
              case 4: return listeners.fn.call(listeners.context, a1, a2, a3), true;
              case 5: return listeners.fn.call(listeners.context, a1, a2, a3, a4), true;
              case 6: return listeners.fn.call(listeners.context, a1, a2, a3, a4, a5), true;
            }

            for (i = 1, args = new Array(len -1); i < len; i++) {
              args[i - 1] = arguments[i];
            }

            listeners.fn.apply(listeners.context, args);
          } else {
            var length = listeners.length
              , j;

            for (i = 0; i < length; i++) {
              if (listeners[i].once) this.removeListener(event, listeners[i].fn, undefined, true);

              switch (len) {
                case 1: listeners[i].fn.call(listeners[i].context); break;
                case 2: listeners[i].fn.call(listeners[i].context, a1); break;
                case 3: listeners[i].fn.call(listeners[i].context, a1, a2); break;
                case 4: listeners[i].fn.call(listeners[i].context, a1, a2, a3); break;
                default:
                  if (!args) for (j = 1, args = new Array(len -1); j < len; j++) {
                    args[j - 1] = arguments[j];
                  }

                  listeners[i].fn.apply(listeners[i].context, args);
              }
            }
          }

          return true;
        };

        /**
         * Add a listener for a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @param {Function} fn The listener function.
         * @param {*} [context=this] The context to invoke the listener with.
         * @returns {EventEmitter} `this`.
         * @public
         */
        EventEmitter.prototype.on = function on(event, fn, context) {
          return addListener(this, event, fn, context, false);
        };

        /**
         * Add a one-time listener for a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @param {Function} fn The listener function.
         * @param {*} [context=this] The context to invoke the listener with.
         * @returns {EventEmitter} `this`.
         * @public
         */
        EventEmitter.prototype.once = function once(event, fn, context) {
          return addListener(this, event, fn, context, true);
        };

        /**
         * Remove the listeners of a given event.
         *
         * @param {(String|Symbol)} event The event name.
         * @param {Function} fn Only remove the listeners that match this function.
         * @param {*} context Only remove the listeners that have this context.
         * @param {Boolean} once Only remove one-time listeners.
         * @returns {EventEmitter} `this`.
         * @public
         */
        EventEmitter.prototype.removeListener = function removeListener(event, fn, context, once) {
          var evt = prefix ? prefix + event : event;

          if (!this._events[evt]) return this;
          if (!fn) {
            clearEvent(this, evt);
            return this;
          }

          var listeners = this._events[evt];

          if (listeners.fn) {
            if (
              listeners.fn === fn &&
              (!once || listeners.once) &&
              (!context || listeners.context === context)
            ) {
              clearEvent(this, evt);
            }
          } else {
            for (var i = 0, events = [], length = listeners.length; i < length; i++) {
              if (
                listeners[i].fn !== fn ||
                (once && !listeners[i].once) ||
                (context && listeners[i].context !== context)
              ) {
                events.push(listeners[i]);
              }
            }

            //
            // Reset the array, or remove it completely if we have no more listeners.
            //
            if (events.length) this._events[evt] = events.length === 1 ? events[0] : events;
            else clearEvent(this, evt);
          }

          return this;
        };

        /**
         * Remove all listeners, or those of the specified event.
         *
         * @param {(String|Symbol)} [event] The event name.
         * @returns {EventEmitter} `this`.
         * @public
         */
        EventEmitter.prototype.removeAllListeners = function removeAllListeners(event) {
          var evt;

          if (event) {
            evt = prefix ? prefix + event : event;
            if (this._events[evt]) clearEvent(this, evt);
          } else {
            this._events = new Events();
            this._eventsCount = 0;
          }

          return this;
        };

        //
        // Alias methods names because people roll like that.
        //
        EventEmitter.prototype.off = EventEmitter.prototype.removeListener;
        EventEmitter.prototype.addListener = EventEmitter.prototype.on;

        //
        // Expose the prefix.
        //
        EventEmitter.prefixed = prefix;

        //
        // Allow `EventEmitter` to be imported as module namespace.
        //
        EventEmitter.EventEmitter = EventEmitter;

        //
        // Expose the module.
        //
        {
          module.exports = EventEmitter;
        }
        }(eventemitter3));

        var EventEmitter = eventemitter3.exports;

        class EventBus extends EventEmitter {
            constructor() {
                super();
            }
        }

        // 3600 byte
        const PAYLOAD = [`payload/binary`];
        const HEADER_DESC = [
            'flag:8/unsigned-integer',
            'version:8/unsigned-integer',
            'type:16/unsigned-little-integer',
            'port1:16/unsigned-little-integer',
            'port2:16/unsigned-little-integer',
            'appId:32/unsigned-little-integer',
            'extra:4/binary',
        ];
        const PROTOCOL = [...HEADER_DESC, PAYLOAD].join(',');
        // header 16 byte 头部有 16 个字节
        // 其中：
        // flag = protocol flag 协议标识
        // version = protocol version 协议版本
        // type = message type 消息类型
        // port1 = device port 设备端应用端口号
        // port2 = mobile main service app-side port 移动端伴生应用的端口号
        // extra = reserved data 保留字段

        class ModelApi extends EventBus {
            constructor(opts) {
                super();
                this.model = opts.model;
                this.parent = opts.parent;
                this.child = opts.child;
                this.logger = opts.logger;
                // 处理 request
                this.listener = (e) => {
                    const data = e.data;
                    if (isJsonRpcRequestNotify(data)) {
                        this.resolveValue(this.model, Cmd(data.method), { request: data, source: this.parent });
                        return;
                    }
                    if (isJsonRpcRequestMessage(data)) {
                        this.resolveValue(this.model, Cmd(data.method), { request: data, source: this })
                            .then((result) => {
                            const response = new JsonRpcResponseBuilder()
                                .setId(JsonRpcId(data.id))
                                .setResult(result)
                                .build();
                            this.child.postMessage(response);
                        })
                            .catch((e) => {
                            const error = new JsonRpcErrorBuilder()
                                .setCode(e.code)
                                .setMessage(e.message)
                                .setData({
                                id: data.id,
                                method: data.method,
                            })
                                .build();
                            const responseError = new JsonRpcResponseErrorBuilder().setError(error);
                            this.child.postMessage(responseError);
                        });
                    }
                };
                this.parent.addEventListener('message', this.listener);
            }
            call(cmd, args, transfer) {
                const defer = Deferred();
                const method = Method(cmd);
                const jsonRpcPayload = new JsonRpcRequestNotifyBuilder()
                    .setMethod(method)
                    .setParams(args)
                    .build();
                this.child.postMessage(jsonRpcPayload, transfer);
                defer.resolve(void 0);
                return defer.promise;
            }
            static forward(req, from, to, opts) {
                const defer = Deferred();
                if (isJsonRpcRequestMessage(req)) {
                    const jsonRpcId = JsonRpcId(req.id);
                    opts === null || opts === void 0 ? void 0 : opts.requests.forEach((func) => func(req));
                    to.child.postMessage(req);
                    const transact = (e) => {
                        const jsonRpc = e.data;
                        if (isJsonResponseSuccess(jsonRpc)) {
                            if (jsonRpc.id === jsonRpcId) {
                                opts === null || opts === void 0 ? void 0 : opts.responses.forEach((func) => func(jsonRpc));
                                to.parent.removeEventListener('message', transact);
                                from.child.postMessage(jsonRpc);
                                defer.resolve(void 0);
                            }
                        }
                        else if (isJsonResponseError(jsonRpc)) {
                            to.parent.removeEventListener('message', transact);
                            from.child.postMessage(jsonRpc);
                            defer.resolve(void 0);
                        }
                    };
                    to.parent.addEventListener('message', transact);
                }
                else if (isJsonRpcRequestNotify(req)) {
                    to.child.postMessage(req);
                    defer.resolve(void 0);
                }
                return defer.promise;
            }
            request(cmd, args, opts = { timeout: 10000, transfer: [] }) {
                const defer = Deferred();
                const jsonRpcId = JsonRpcId(generateUUID());
                const method = Cmd.toMethod(cmd);
                const jsonRpcPayload = new JsonRpcRequestBuilder()
                    .setId(jsonRpcId)
                    .setMethod(method)
                    .setParams(args)
                    .build();
                const transact = (e) => {
                    const data = e.data;
                    if (isJsonResponseSuccess(data)) {
                        if (data.id === jsonRpcId) {
                            this.logger.info('request [%s] =>', jsonRpcPayload.id, jsonRpcPayload);
                            this.logger.info('response [%s] =>', data.id, data);
                            this.parent.removeEventListener('message', transact);
                            defer.resolve(data.result);
                        }
                    }
                    else if (isJsonResponseError(data)) {
                        this.parent.removeEventListener('message', transact);
                        defer.reject(data.error);
                    }
                };
                this.parent.addEventListener('message', transact);
                this.child.postMessage(jsonRpcPayload, opts.transfer);
                let hasValueReturned = false;
                // this.logger.log('pre request [%s] =>', jsonRpcPayload.id, jsonRpcPayload)
                return Promise.race([
                    timeout(opts.timeout || 10000, (resolve, reject) => {
                        if (hasValueReturned) {
                            return resolve();
                        }
                        this.logger.error('request error [%s] =>', jsonRpcPayload.id, jsonRpcPayload);
                        this.parent.removeEventListener('message', transact);
                        reject('Timed out in ' + opts.timeout || 10000 + 'ms.');
                    }),
                    defer.promise.finally(() => {
                        hasValueReturned = true;
                    }),
                ]);
            }
            resolveValue(model, property, args) {
                if (!model[property]) {
                    property = '*';
                }
                const unwrappedContext = typeof model[property] === 'function' ? model[property](args) : model[property];
                return Promise.resolve(unwrappedContext);
            }
            destroy() {
                this.parent.removeEventListener('message', this.listener);
            }
        }

        class HmMessagePort {
            constructor(port, logger) {
                this.port = port;
                this.logger = logger;
                this.port.addEventListener('message', (e) => {
                    this.logger.debug('[RAW] [R] data=%j', e.data);
                });
            }
            addEventListener(type, listener) {
                this.port.addEventListener(type, listener);
            }
            removeEventListener(type, listener) {
                this.port.removeEventListener(type, listener);
            }
            postMessage(message, transfer) {
                this.logger.debug('[RAW] [S] data=%j', message);
                this.port.postMessage(message, transfer);
            }
            start() {
                if (this.port instanceof MessagePort) {
                    this.port.start();
                }
            }
        }
        class PeerChild {
            constructor({ name, parent, child, logger, model, }) {
                this.name = name;
                this.parent = parent;
                this.child = child;
                this.logger = logger;
                this.model = model;
            }
            sendHandshakeReply() {
                return __awaiter(this, void 0, void 0, function* () {
                    const defer = Deferred();
                    const shake = (e) => {
                        if (Cmd.from(e.data.method) === CmdType.SHAKE_CMD) {
                            this.logger.debug('%s [child] [handshake] [R] json[%j]', this.name, e.data);
                            this.child.removeEventListener('message', shake);
                            const reply = new JsonRpcResponseBuilder()
                                .setId(JsonRpcId(e.data.id))
                                .setResult({ ack: 1 })
                                .build();
                            this.logger.debug('%s [child] [handshake] [S] json[%j]', this.name, reply);
                            this.parent.postMessage(reply);
                            defer.resolve(new ModelApi(this));
                        }
                        defer.reject(Error(this.name + ' [child] [handshake] [R] Failed'));
                    };
                    this.child.addEventListener('message', shake);
                    if (this.child instanceof MessagePort || this.child instanceof HmMessagePort) {
                        this.child.start();
                    }
                    return defer.promise;
                });
            }
        }

        function Cmd(method) {
            if (typeof method === 'string') {
                return method;
            }
            return (method.module + '.' + method.action);
        }
        Cmd.toMethod = (method) => {
            return Method(method);
        };
        Cmd.from = (method) => {
            return (method.module + '.' + method.action);
        };
        function Method(cmd) {
            const tokens = cmd.split('.');
            return {
                module: tokens.slice(0, -1).join('.'),
                action: tokens.slice(-1)[0],
            };
        }
        const CmdType = {
            SHAKE_CMD: Cmd('main.heartBeat.heartBeatInfo.handshake'),
            PROCESS_INFO_CMD: Cmd('main.scheduling.workerManage.postAppInfo'),
            CHANNEL_CMD: Cmd('main.scheduling.workerManage.postMessageChannel'),
            SIDE_CODE_CMD: Cmd('main.scheduling.workerManage.postServiceCode'),
            LAUNCH_SETTING_CMD: Cmd('message.notification.launch.settingsChanged'),
            LAUNCH_PEER_CMD: Cmd('message.notification.launch.peerAppLaunched'),
            SERVICE_CODE_CMD: Cmd('main.scheduling.code.getWorkerCode'),
            MAIN_LOG_CMD: Cmd('main.console.out.log'),
            WORKER_LOG_CMD: Cmd('worker.console.out.log'),
            PROCESS_LOG_CMD: Cmd('process.console.out.log'),
            DEVICE_LOG_CMD: Cmd('device.console.out.log'),
            WORKER_NETWORK_HTTP_CMD: Cmd('worker.service.network.fetch'),
            PERMISSION_CMD: Cmd('main.scheduling.permission.getPermissionList'),
            USER_SETTINGS_CMD: Cmd('appSettings.framework.userSettings.getUserSettings'),
            SYSTEM_SETTINGS_CMD: Cmd('appSettings.framework.system.getSystemInfo'),
            // 存储服务
            WORKER_SETTINGS_STORAGE_GET_CMD: Cmd('worker.framework.settingsStorage.getSettingsStorage'),
            WORKER_SETTINGS_STORAGE_SET_CMD: Cmd('worker.framework.settingsStorage.setSettingsStorage'),
            WORKER_SETTINGS_STORAGE_REMOVE_CMD: Cmd('worker.framework.settingsStorage.removeSettingsStorage'),
            WORKER_SETTINGS_STORAGE_CLEAR_CMD: Cmd('worker.framework.settingsStorage.clearSettingsStorage'),
            WORKER_LOCAL_STORAGE_GET_CMD: Cmd('worker.service.localStorage.getLocalStorage'),
            WORKER_LOCAL_STORAGE_SET_CMD: Cmd('worker.service.localStorage.setLocalStorage'),
            WORKER_LOCAL_STORAGE_REMOVE_CMD: Cmd('worker.service.localStorage.removeLocalStorage'),
            WORKER_LOCAL_STORAGE_CLEAR_CMD: Cmd('worker.service.localStorage.clearLocalStorage'),
            WORKER_LIVE_STORAGE_GET_CMD: Cmd('worker.service.liveStorage.getLiveStorage'),
            WORKER_LIVE_STORAGE_SET_CMD: Cmd('worker.service.liveStorage.setLiveStorage'),
            WORKER_LIVE_STORAGE_REMOVE_CMD: Cmd('worker.service.liveStorage.removeLiveStorage'),
            WORKER_LIVE_STORAGE_CLEAR_CMD: Cmd('worker.service.liveStorage.clearLiveStorage'),
            // 内部接口
            WORKER_NETWORK_OPEN_API_CMD: Cmd('app.internal.network.zeppOpenApi'),
            WORKER_USER_INFO_CMD: Cmd('app.internal.user.getUserInfo'),
            // 内部接口结束
        };

        function noop() {
            // pass
        }

        function AppSideService(options) {
            const appSideService = {
                _options: options,
                onInit: noop,
                onRun: noop,
                onDestroy: noop,
            };
            const proxyAppSideService = initProxy(appSideService, options);
            __$$mobile$$__.appSideService = proxyAppSideService;
        }

        const workerLogger = Logger.getLogger('worker');
        workerLogger.prefix = 'worker';
        const SdkLogger = workerLogger.getLogger('sdk');
        SdkLogger.prefix = 'worker-sdk';
        const UserLogger = Logger.getLogger('process');
        UserLogger.prefix = 'worker-userSpace';
        const LogLogger = Logger.getLogger('worker-channel-log');
        LogLogger.prefix = 'worker';
        LogLogger.level = LogLogger.levels.off;

        function set(values) {
            const s = {};
            if (!values) {
                return s;
            }
            for (const i in values) {
                s[values[i]] = 1;
            }
            return s;
        }
        function variable(name, size, specifiers0) {
            const specifiers = set(specifiers0);
            const segment = { name: name };
            segment.type = type_in(specifiers);
            specs(segment, segment.type, specifiers);
            segment.size = size_of$1(segment, segment.type, size, segment.unit);
            return segment;
        }
        function rest() {
            return variable('_', true, ['binary']);
        }
        function value(val, size, specifiers0) {
            const specifiers = set(specifiers0);
            const segment = { value: val };
            segment.type = type_in(specifiers);
            specs(segment, segment.type, specifiers);
            segment.size = size_of$1(segment, segment.type, size, segment.unit);
            return segment;
        }
        // A string can appear as a literal, but it must appear without
        // specifiers.
        function string(val) {
            return { value: val, type: 'string', unit: 8 };
        }
        const TYPES = {
            integer: 1,
            binary: 1,
            float: 1,
            string: 1,
        };
        function type_in(specifiers) {
            for (const t in specifiers) {
                if (TYPES[t]) {
                    return t;
                }
            }
            return 'integer';
        }
        function specs(segment, type, specifiers) {
            switch (type) {
                case 'integer':
                    segment.signed = signed_in(specifiers);
                // fall through
                case 'float':
                    segment.bigendian = endian_in(specifiers);
                // fall through
                default:
                    segment.unit = unit_in(specifiers, segment.type);
            }
            return segment;
        }
        function endian_in(specifiers) {
            // default is big
            return !specifiers['little'];
        }
        function signed_in(specifiers) {
            // default is unsigned
            return specifiers['signed'];
        }
        function unit_in(specifiers, type) {
            for (const s in specifiers) {
                if (s.substr(0, 5) == 'unit:') {
                    const unit = parseInt(s.substr(5));
                    // TODO check sane for type
                    return unit;
                }
            }
            // OK defaults then
            switch (type) {
                case 'binary':
                case 'string':
                    return 8;
                case 'integer':
                case 'float':
                    return 1;
                default:
                    return 1;
            }
        }
        function size_of$1(segment, type, size, unit) {
            if (size !== undefined && size !== '' && size !== null) {
                return size;
            }
            else {
                switch (type) {
                    case 'integer':
                        return 8;
                    case 'float':
                        return 64;
                    case 'binary':
                    case 'string':
                        return true;
                }
            }
        }

        /*
         * Generated by PEG.js 0.10.0.
         *
         * http://pegjs.org/
         */

        function peg$subclass(child, parent) {
          function ctor() { this.constructor = child; }
          ctor.prototype = parent.prototype;
          child.prototype = new ctor();
        }

        function peg$SyntaxError(message, expected, found, location) {
          this.message  = message;
          this.expected = expected;
          this.found    = found;
          this.location = location;
          this.name     = "SyntaxError";

          if (typeof Error.captureStackTrace === "function") {
            Error.captureStackTrace(this, peg$SyntaxError);
          }
        }

        peg$subclass(peg$SyntaxError, Error);

        peg$SyntaxError.buildMessage = function(expected, found) {
          var DESCRIBE_EXPECTATION_FNS = {
                literal: function(expectation) {
                  return "\"" + literalEscape(expectation.text) + "\"";
                },

                "class": function(expectation) {
                  var escapedParts = "",
                      i;

                  for (i = 0; i < expectation.parts.length; i++) {
                    escapedParts += expectation.parts[i] instanceof Array
                      ? classEscape(expectation.parts[i][0]) + "-" + classEscape(expectation.parts[i][1])
                      : classEscape(expectation.parts[i]);
                  }

                  return "[" + (expectation.inverted ? "^" : "") + escapedParts + "]";
                },

                any: function(expectation) {
                  return "any character";
                },

                end: function(expectation) {
                  return "end of input";
                },

                other: function(expectation) {
                  return expectation.description;
                }
              };

          function hex(ch) {
            return ch.charCodeAt(0).toString(16).toUpperCase();
          }

          function literalEscape(s) {
            return s
              .replace(/\\/g, '\\\\')
              .replace(/"/g,  '\\"')
              .replace(/\0/g, '\\0')
              .replace(/\t/g, '\\t')
              .replace(/\n/g, '\\n')
              .replace(/\r/g, '\\r')
              .replace(/[\x00-\x0F]/g,          function(ch) { return '\\x0' + hex(ch); })
              .replace(/[\x10-\x1F\x7F-\x9F]/g, function(ch) { return '\\x'  + hex(ch); });
          }

          function classEscape(s) {
            return s
              .replace(/\\/g, '\\\\')
              .replace(/\]/g, '\\]')
              .replace(/\^/g, '\\^')
              .replace(/-/g,  '\\-')
              .replace(/\0/g, '\\0')
              .replace(/\t/g, '\\t')
              .replace(/\n/g, '\\n')
              .replace(/\r/g, '\\r')
              .replace(/[\x00-\x0F]/g,          function(ch) { return '\\x0' + hex(ch); })
              .replace(/[\x10-\x1F\x7F-\x9F]/g, function(ch) { return '\\x'  + hex(ch); });
          }

          function describeExpectation(expectation) {
            return DESCRIBE_EXPECTATION_FNS[expectation.type](expectation);
          }

          function describeExpected(expected) {
            var descriptions = new Array(expected.length),
                i, j;

            for (i = 0; i < expected.length; i++) {
              descriptions[i] = describeExpectation(expected[i]);
            }

            descriptions.sort();

            if (descriptions.length > 0) {
              for (i = 1, j = 1; i < descriptions.length; i++) {
                if (descriptions[i - 1] !== descriptions[i]) {
                  descriptions[j] = descriptions[i];
                  j++;
                }
              }
              descriptions.length = j;
            }

            switch (descriptions.length) {
              case 1:
                return descriptions[0];

              case 2:
                return descriptions[0] + " or " + descriptions[1];

              default:
                return descriptions.slice(0, -1).join(", ")
                  + ", or "
                  + descriptions[descriptions.length - 1];
            }
          }

          function describeFound(found) {
            return found ? "\"" + literalEscape(found) + "\"" : "end of input";
          }

          return "Expected " + describeExpected(expected) + " but " + describeFound(found) + " found.";
        };

        function peg$parse(input, options) {
          options = options !== void 0 ? options : {};

          var peg$FAILED = {},

              peg$startRuleFunctions = { start: peg$parsestart },
              peg$startRuleFunction  = peg$parsestart,

              peg$c0 = function(head, tail) { tail.unshift(head); return tail; },
              peg$c1 = ",",
              peg$c2 = peg$literalExpectation(",", false),
              peg$c3 = function(seg) { return seg; },
              peg$c4 = function(str) { return {string: str}; },
              peg$c5 = function(v, size, specs) { return {name: v, size: size, specifiers: specs}; },
              peg$c6 = function(v, size, specs) { return {value: v, size: size, specifiers: specs}; },
              peg$c7 = "\"",
              peg$c8 = peg$literalExpectation("\"", false),
              peg$c9 = function() { return "";    },
              peg$c10 = function(chars) { return chars; },
              peg$c11 = function(chars) { return chars.join(""); },
              peg$c12 = /^[^"\\\0-\x1F\x7F]/,
              peg$c13 = peg$classExpectation(["\"", "\\", ["\0", "\x1F"], "\x7F"], true, false),
              peg$c14 = "\\\"",
              peg$c15 = peg$literalExpectation("\\\"", false),
              peg$c16 = function() { return '"';  },
              peg$c17 = "\\\\",
              peg$c18 = peg$literalExpectation("\\\\", false),
              peg$c19 = function() { return "\\"; },
              peg$c20 = "\\/",
              peg$c21 = peg$literalExpectation("\\/", false),
              peg$c22 = function() { return "/";  },
              peg$c23 = "\\b",
              peg$c24 = peg$literalExpectation("\\b", false),
              peg$c25 = function() { return "\b"; },
              peg$c26 = "\\f",
              peg$c27 = peg$literalExpectation("\\f", false),
              peg$c28 = function() { return "\f"; },
              peg$c29 = "\\n",
              peg$c30 = peg$literalExpectation("\\n", false),
              peg$c31 = function() { return "\n"; },
              peg$c32 = "\\r",
              peg$c33 = peg$literalExpectation("\\r", false),
              peg$c34 = function() { return "\r"; },
              peg$c35 = "\\t",
              peg$c36 = peg$literalExpectation("\\t", false),
              peg$c37 = function() { return "\t"; },
              peg$c38 = "\\u",
              peg$c39 = peg$literalExpectation("\\u", false),
              peg$c40 = function(h1, h2, h3, h4) {
                    return String.fromCharCode(parseInt("0x" + h1 + h2 + h3 + h4));
                  },
              peg$c41 = /^[0-9a-fA-F]/,
              peg$c42 = peg$classExpectation([["0", "9"], ["a", "f"], ["A", "F"]], false, false),
              peg$c43 = /^[_a-zA-Z]/,
              peg$c44 = peg$classExpectation(["_", ["a", "z"], ["A", "Z"]], false, false),
              peg$c45 = /^[_a-zA-Z0-9]/,
              peg$c46 = peg$classExpectation(["_", ["a", "z"], ["A", "Z"], ["0", "9"]], false, false),
              peg$c47 = function(head, tail) { return head + tail.join(''); },
              peg$c48 = "0",
              peg$c49 = peg$literalExpectation("0", false),
              peg$c50 = function() { return 0; },
              peg$c51 = /^[1-9]/,
              peg$c52 = peg$classExpectation([["1", "9"]], false, false),
              peg$c53 = /^[0-9]/,
              peg$c54 = peg$classExpectation([["0", "9"]], false, false),
              peg$c55 = function(head, tail) { return parseInt(head + tail.join('')); },
              peg$c56 = ":",
              peg$c57 = peg$literalExpectation(":", false),
              peg$c58 = function(num) { return num; },
              peg$c59 = function(id) { return id; },
              peg$c60 = "/",
              peg$c61 = peg$literalExpectation("/", false),
              peg$c62 = "-",
              peg$c63 = peg$literalExpectation("-", false),
              peg$c64 = function(spec) { return spec; },
              peg$c65 = "little",
              peg$c66 = peg$literalExpectation("little", false),
              peg$c67 = "big",
              peg$c68 = peg$literalExpectation("big", false),
              peg$c69 = "signed",
              peg$c70 = peg$literalExpectation("signed", false),
              peg$c71 = "unsigned",
              peg$c72 = peg$literalExpectation("unsigned", false),
              peg$c73 = "integer",
              peg$c74 = peg$literalExpectation("integer", false),
              peg$c75 = "binary",
              peg$c76 = peg$literalExpectation("binary", false),
              peg$c77 = "float",
              peg$c78 = peg$literalExpectation("float", false),
              peg$c79 = "string",
              peg$c80 = peg$literalExpectation("string", false),
              peg$c81 = "unit:",
              peg$c82 = peg$literalExpectation("unit:", false),
              peg$c83 = function(num) { return 'unit:' + num; },
              peg$c84 = /^[ \t\n]/,
              peg$c85 = peg$classExpectation([" ", "\t", "\n"], false, false),

              peg$currPos          = 0,
              peg$posDetailsCache  = [{ line: 1, column: 1 }],
              peg$maxFailPos       = 0,
              peg$maxFailExpected  = [],
              peg$result;

          if ("startRule" in options) {
            if (!(options.startRule in peg$startRuleFunctions)) {
              throw new Error("Can't start parsing from rule \"" + options.startRule + "\".");
            }

            peg$startRuleFunction = peg$startRuleFunctions[options.startRule];
          }

          function peg$literalExpectation(text, ignoreCase) {
            return { type: "literal", text: text, ignoreCase: ignoreCase };
          }

          function peg$classExpectation(parts, inverted, ignoreCase) {
            return { type: "class", parts: parts, inverted: inverted, ignoreCase: ignoreCase };
          }

          function peg$endExpectation() {
            return { type: "end" };
          }

          function peg$computePosDetails(pos) {
            var details = peg$posDetailsCache[pos], p;

            if (details) {
              return details;
            } else {
              p = pos - 1;
              while (!peg$posDetailsCache[p]) {
                p--;
              }

              details = peg$posDetailsCache[p];
              details = {
                line:   details.line,
                column: details.column
              };

              while (p < pos) {
                if (input.charCodeAt(p) === 10) {
                  details.line++;
                  details.column = 1;
                } else {
                  details.column++;
                }

                p++;
              }

              peg$posDetailsCache[pos] = details;
              return details;
            }
          }

          function peg$computeLocation(startPos, endPos) {
            var startPosDetails = peg$computePosDetails(startPos),
                endPosDetails   = peg$computePosDetails(endPos);

            return {
              start: {
                offset: startPos,
                line:   startPosDetails.line,
                column: startPosDetails.column
              },
              end: {
                offset: endPos,
                line:   endPosDetails.line,
                column: endPosDetails.column
              }
            };
          }

          function peg$fail(expected) {
            if (peg$currPos < peg$maxFailPos) { return; }

            if (peg$currPos > peg$maxFailPos) {
              peg$maxFailPos = peg$currPos;
              peg$maxFailExpected = [];
            }

            peg$maxFailExpected.push(expected);
          }

          function peg$buildStructuredError(expected, found, location) {
            return new peg$SyntaxError(
              peg$SyntaxError.buildMessage(expected, found),
              expected,
              found,
              location
            );
          }

          function peg$parsestart() {
            var s0, s1, s2, s3, s4;

            s0 = peg$currPos;
            s1 = peg$parsews();
            if (s1 !== peg$FAILED) {
              s2 = peg$parsesegment();
              if (s2 !== peg$FAILED) {
                s3 = [];
                s4 = peg$parsesegmentTail();
                while (s4 !== peg$FAILED) {
                  s3.push(s4);
                  s4 = peg$parsesegmentTail();
                }
                if (s3 !== peg$FAILED) {
                  s1 = peg$c0(s2, s3);
                  s0 = s1;
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsesegmentTail() {
            var s0, s1, s2, s3, s4;

            s0 = peg$currPos;
            s1 = peg$parsews();
            if (s1 !== peg$FAILED) {
              if (input.charCodeAt(peg$currPos) === 44) {
                s2 = peg$c1;
                peg$currPos++;
              } else {
                s2 = peg$FAILED;
                { peg$fail(peg$c2); }
              }
              if (s2 !== peg$FAILED) {
                s3 = peg$parsews();
                if (s3 !== peg$FAILED) {
                  s4 = peg$parsesegment();
                  if (s4 !== peg$FAILED) {
                    s1 = peg$c3(s4);
                    s0 = s1;
                  } else {
                    peg$currPos = s0;
                    s0 = peg$FAILED;
                  }
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsesegment() {
            var s0, s1, s2, s3;

            s0 = peg$currPos;
            s1 = peg$parsestring();
            if (s1 !== peg$FAILED) {
              s1 = peg$c4(s1);
            }
            s0 = s1;
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              s1 = peg$parseidentifier();
              if (s1 !== peg$FAILED) {
                s2 = peg$parsesize();
                if (s2 === peg$FAILED) {
                  s2 = null;
                }
                if (s2 !== peg$FAILED) {
                  s3 = peg$parsespecifierList();
                  if (s3 === peg$FAILED) {
                    s3 = null;
                  }
                  if (s3 !== peg$FAILED) {
                    s1 = peg$c5(s1, s2, s3);
                    s0 = s1;
                  } else {
                    peg$currPos = s0;
                    s0 = peg$FAILED;
                  }
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
              if (s0 === peg$FAILED) {
                s0 = peg$currPos;
                s1 = peg$parsenumber();
                if (s1 !== peg$FAILED) {
                  s2 = peg$parsesize();
                  if (s2 === peg$FAILED) {
                    s2 = null;
                  }
                  if (s2 !== peg$FAILED) {
                    s3 = peg$parsespecifierList();
                    if (s3 === peg$FAILED) {
                      s3 = null;
                    }
                    if (s3 !== peg$FAILED) {
                      s1 = peg$c6(s1, s2, s3);
                      s0 = s1;
                    } else {
                      peg$currPos = s0;
                      s0 = peg$FAILED;
                    }
                  } else {
                    peg$currPos = s0;
                    s0 = peg$FAILED;
                  }
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              }
            }

            return s0;
          }

          function peg$parsestring() {
            var s0, s1, s2, s3;

            s0 = peg$currPos;
            if (input.charCodeAt(peg$currPos) === 34) {
              s1 = peg$c7;
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c8); }
            }
            if (s1 !== peg$FAILED) {
              if (input.charCodeAt(peg$currPos) === 34) {
                s2 = peg$c7;
                peg$currPos++;
              } else {
                s2 = peg$FAILED;
                { peg$fail(peg$c8); }
              }
              if (s2 !== peg$FAILED) {
                s1 = peg$c9();
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              if (input.charCodeAt(peg$currPos) === 34) {
                s1 = peg$c7;
                peg$currPos++;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c8); }
              }
              if (s1 !== peg$FAILED) {
                s2 = peg$parsechars();
                if (s2 !== peg$FAILED) {
                  if (input.charCodeAt(peg$currPos) === 34) {
                    s3 = peg$c7;
                    peg$currPos++;
                  } else {
                    s3 = peg$FAILED;
                    { peg$fail(peg$c8); }
                  }
                  if (s3 !== peg$FAILED) {
                    s1 = peg$c10(s2);
                    s0 = s1;
                  } else {
                    peg$currPos = s0;
                    s0 = peg$FAILED;
                  }
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            }

            return s0;
          }

          function peg$parsechars() {
            var s0, s1, s2;

            s0 = peg$currPos;
            s1 = [];
            s2 = peg$parsechar();
            if (s2 !== peg$FAILED) {
              while (s2 !== peg$FAILED) {
                s1.push(s2);
                s2 = peg$parsechar();
              }
            } else {
              s1 = peg$FAILED;
            }
            if (s1 !== peg$FAILED) {
              s1 = peg$c11(s1);
            }
            s0 = s1;

            return s0;
          }

          function peg$parsechar() {
            var s0, s1, s2, s3, s4, s5;

            if (peg$c12.test(input.charAt(peg$currPos))) {
              s0 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s0 = peg$FAILED;
              { peg$fail(peg$c13); }
            }
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              if (input.substr(peg$currPos, 2) === peg$c14) {
                s1 = peg$c14;
                peg$currPos += 2;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c15); }
              }
              if (s1 !== peg$FAILED) {
                s1 = peg$c16();
              }
              s0 = s1;
              if (s0 === peg$FAILED) {
                s0 = peg$currPos;
                if (input.substr(peg$currPos, 2) === peg$c17) {
                  s1 = peg$c17;
                  peg$currPos += 2;
                } else {
                  s1 = peg$FAILED;
                  { peg$fail(peg$c18); }
                }
                if (s1 !== peg$FAILED) {
                  s1 = peg$c19();
                }
                s0 = s1;
                if (s0 === peg$FAILED) {
                  s0 = peg$currPos;
                  if (input.substr(peg$currPos, 2) === peg$c20) {
                    s1 = peg$c20;
                    peg$currPos += 2;
                  } else {
                    s1 = peg$FAILED;
                    { peg$fail(peg$c21); }
                  }
                  if (s1 !== peg$FAILED) {
                    s1 = peg$c22();
                  }
                  s0 = s1;
                  if (s0 === peg$FAILED) {
                    s0 = peg$currPos;
                    if (input.substr(peg$currPos, 2) === peg$c23) {
                      s1 = peg$c23;
                      peg$currPos += 2;
                    } else {
                      s1 = peg$FAILED;
                      { peg$fail(peg$c24); }
                    }
                    if (s1 !== peg$FAILED) {
                      s1 = peg$c25();
                    }
                    s0 = s1;
                    if (s0 === peg$FAILED) {
                      s0 = peg$currPos;
                      if (input.substr(peg$currPos, 2) === peg$c26) {
                        s1 = peg$c26;
                        peg$currPos += 2;
                      } else {
                        s1 = peg$FAILED;
                        { peg$fail(peg$c27); }
                      }
                      if (s1 !== peg$FAILED) {
                        s1 = peg$c28();
                      }
                      s0 = s1;
                      if (s0 === peg$FAILED) {
                        s0 = peg$currPos;
                        if (input.substr(peg$currPos, 2) === peg$c29) {
                          s1 = peg$c29;
                          peg$currPos += 2;
                        } else {
                          s1 = peg$FAILED;
                          { peg$fail(peg$c30); }
                        }
                        if (s1 !== peg$FAILED) {
                          s1 = peg$c31();
                        }
                        s0 = s1;
                        if (s0 === peg$FAILED) {
                          s0 = peg$currPos;
                          if (input.substr(peg$currPos, 2) === peg$c32) {
                            s1 = peg$c32;
                            peg$currPos += 2;
                          } else {
                            s1 = peg$FAILED;
                            { peg$fail(peg$c33); }
                          }
                          if (s1 !== peg$FAILED) {
                            s1 = peg$c34();
                          }
                          s0 = s1;
                          if (s0 === peg$FAILED) {
                            s0 = peg$currPos;
                            if (input.substr(peg$currPos, 2) === peg$c35) {
                              s1 = peg$c35;
                              peg$currPos += 2;
                            } else {
                              s1 = peg$FAILED;
                              { peg$fail(peg$c36); }
                            }
                            if (s1 !== peg$FAILED) {
                              s1 = peg$c37();
                            }
                            s0 = s1;
                            if (s0 === peg$FAILED) {
                              s0 = peg$currPos;
                              if (input.substr(peg$currPos, 2) === peg$c38) {
                                s1 = peg$c38;
                                peg$currPos += 2;
                              } else {
                                s1 = peg$FAILED;
                                { peg$fail(peg$c39); }
                              }
                              if (s1 !== peg$FAILED) {
                                s2 = peg$parsehexDigit();
                                if (s2 !== peg$FAILED) {
                                  s3 = peg$parsehexDigit();
                                  if (s3 !== peg$FAILED) {
                                    s4 = peg$parsehexDigit();
                                    if (s4 !== peg$FAILED) {
                                      s5 = peg$parsehexDigit();
                                      if (s5 !== peg$FAILED) {
                                        s1 = peg$c40(s2, s3, s4, s5);
                                        s0 = s1;
                                      } else {
                                        peg$currPos = s0;
                                        s0 = peg$FAILED;
                                      }
                                    } else {
                                      peg$currPos = s0;
                                      s0 = peg$FAILED;
                                    }
                                  } else {
                                    peg$currPos = s0;
                                    s0 = peg$FAILED;
                                  }
                                } else {
                                  peg$currPos = s0;
                                  s0 = peg$FAILED;
                                }
                              } else {
                                peg$currPos = s0;
                                s0 = peg$FAILED;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }

            return s0;
          }

          function peg$parsehexDigit() {
            var s0;

            if (peg$c41.test(input.charAt(peg$currPos))) {
              s0 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s0 = peg$FAILED;
              { peg$fail(peg$c42); }
            }

            return s0;
          }

          function peg$parseidentifier() {
            var s0, s1, s2, s3;

            s0 = peg$currPos;
            if (peg$c43.test(input.charAt(peg$currPos))) {
              s1 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c44); }
            }
            if (s1 !== peg$FAILED) {
              s2 = [];
              if (peg$c45.test(input.charAt(peg$currPos))) {
                s3 = input.charAt(peg$currPos);
                peg$currPos++;
              } else {
                s3 = peg$FAILED;
                { peg$fail(peg$c46); }
              }
              while (s3 !== peg$FAILED) {
                s2.push(s3);
                if (peg$c45.test(input.charAt(peg$currPos))) {
                  s3 = input.charAt(peg$currPos);
                  peg$currPos++;
                } else {
                  s3 = peg$FAILED;
                  { peg$fail(peg$c46); }
                }
              }
              if (s2 !== peg$FAILED) {
                s1 = peg$c47(s1, s2);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsenumber() {
            var s0, s1, s2, s3;

            s0 = peg$currPos;
            if (input.charCodeAt(peg$currPos) === 48) {
              s1 = peg$c48;
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c49); }
            }
            if (s1 !== peg$FAILED) {
              s1 = peg$c50();
            }
            s0 = s1;
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              if (peg$c51.test(input.charAt(peg$currPos))) {
                s1 = input.charAt(peg$currPos);
                peg$currPos++;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c52); }
              }
              if (s1 !== peg$FAILED) {
                s2 = [];
                if (peg$c53.test(input.charAt(peg$currPos))) {
                  s3 = input.charAt(peg$currPos);
                  peg$currPos++;
                } else {
                  s3 = peg$FAILED;
                  { peg$fail(peg$c54); }
                }
                while (s3 !== peg$FAILED) {
                  s2.push(s3);
                  if (peg$c53.test(input.charAt(peg$currPos))) {
                    s3 = input.charAt(peg$currPos);
                    peg$currPos++;
                  } else {
                    s3 = peg$FAILED;
                    { peg$fail(peg$c54); }
                  }
                }
                if (s2 !== peg$FAILED) {
                  s1 = peg$c55(s1, s2);
                  s0 = s1;
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            }

            return s0;
          }

          function peg$parsesize() {
            var s0, s1, s2;

            s0 = peg$currPos;
            if (input.charCodeAt(peg$currPos) === 58) {
              s1 = peg$c56;
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c57); }
            }
            if (s1 !== peg$FAILED) {
              s2 = peg$parsenumber();
              if (s2 !== peg$FAILED) {
                s1 = peg$c58(s2);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              if (input.charCodeAt(peg$currPos) === 58) {
                s1 = peg$c56;
                peg$currPos++;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c57); }
              }
              if (s1 !== peg$FAILED) {
                s2 = peg$parseidentifier();
                if (s2 !== peg$FAILED) {
                  s1 = peg$c59(s2);
                  s0 = s1;
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            }

            return s0;
          }

          function peg$parsespecifierList() {
            var s0, s1, s2, s3, s4;

            s0 = peg$currPos;
            if (input.charCodeAt(peg$currPos) === 47) {
              s1 = peg$c60;
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c61); }
            }
            if (s1 !== peg$FAILED) {
              s2 = peg$parsespecifier();
              if (s2 !== peg$FAILED) {
                s3 = [];
                s4 = peg$parsespecifierTail();
                while (s4 !== peg$FAILED) {
                  s3.push(s4);
                  s4 = peg$parsespecifierTail();
                }
                if (s3 !== peg$FAILED) {
                  s1 = peg$c0(s2, s3);
                  s0 = s1;
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsespecifierTail() {
            var s0, s1, s2;

            s0 = peg$currPos;
            if (input.charCodeAt(peg$currPos) === 45) {
              s1 = peg$c62;
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c63); }
            }
            if (s1 !== peg$FAILED) {
              s2 = peg$parsespecifier();
              if (s2 !== peg$FAILED) {
                s1 = peg$c64(s2);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsespecifier() {
            var s0;

            if (input.substr(peg$currPos, 6) === peg$c65) {
              s0 = peg$c65;
              peg$currPos += 6;
            } else {
              s0 = peg$FAILED;
              { peg$fail(peg$c66); }
            }
            if (s0 === peg$FAILED) {
              if (input.substr(peg$currPos, 3) === peg$c67) {
                s0 = peg$c67;
                peg$currPos += 3;
              } else {
                s0 = peg$FAILED;
                { peg$fail(peg$c68); }
              }
              if (s0 === peg$FAILED) {
                if (input.substr(peg$currPos, 6) === peg$c69) {
                  s0 = peg$c69;
                  peg$currPos += 6;
                } else {
                  s0 = peg$FAILED;
                  { peg$fail(peg$c70); }
                }
                if (s0 === peg$FAILED) {
                  if (input.substr(peg$currPos, 8) === peg$c71) {
                    s0 = peg$c71;
                    peg$currPos += 8;
                  } else {
                    s0 = peg$FAILED;
                    { peg$fail(peg$c72); }
                  }
                  if (s0 === peg$FAILED) {
                    if (input.substr(peg$currPos, 7) === peg$c73) {
                      s0 = peg$c73;
                      peg$currPos += 7;
                    } else {
                      s0 = peg$FAILED;
                      { peg$fail(peg$c74); }
                    }
                    if (s0 === peg$FAILED) {
                      if (input.substr(peg$currPos, 6) === peg$c75) {
                        s0 = peg$c75;
                        peg$currPos += 6;
                      } else {
                        s0 = peg$FAILED;
                        { peg$fail(peg$c76); }
                      }
                      if (s0 === peg$FAILED) {
                        if (input.substr(peg$currPos, 5) === peg$c77) {
                          s0 = peg$c77;
                          peg$currPos += 5;
                        } else {
                          s0 = peg$FAILED;
                          { peg$fail(peg$c78); }
                        }
                        if (s0 === peg$FAILED) {
                          if (input.substr(peg$currPos, 6) === peg$c79) {
                            s0 = peg$c79;
                            peg$currPos += 6;
                          } else {
                            s0 = peg$FAILED;
                            { peg$fail(peg$c80); }
                          }
                          if (s0 === peg$FAILED) {
                            s0 = peg$parseunit();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }

            return s0;
          }

          function peg$parseunit() {
            var s0, s1, s2;

            s0 = peg$currPos;
            if (input.substr(peg$currPos, 5) === peg$c81) {
              s1 = peg$c81;
              peg$currPos += 5;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c82); }
            }
            if (s1 !== peg$FAILED) {
              s2 = peg$parsenumber();
              if (s2 !== peg$FAILED) {
                s1 = peg$c83(s2);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }

            return s0;
          }

          function peg$parsews() {
            var s0, s1;

            s0 = [];
            if (peg$c84.test(input.charAt(peg$currPos))) {
              s1 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c85); }
            }
            while (s1 !== peg$FAILED) {
              s0.push(s1);
              if (peg$c84.test(input.charAt(peg$currPos))) {
                s1 = input.charAt(peg$currPos);
                peg$currPos++;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c85); }
              }
            }

            return s0;
          }

          peg$result = peg$startRuleFunction();

          if (peg$result !== peg$FAILED && peg$currPos === input.length) {
            return peg$result;
          } else {
            if (peg$result !== peg$FAILED && peg$currPos < input.length) {
              peg$fail(peg$endExpectation());
            }

            throw peg$buildStructuredError(
              peg$maxFailExpected,
              peg$maxFailPos < input.length ? input.charAt(peg$maxFailPos) : null,
              peg$maxFailPos < input.length
                ? peg$computeLocation(peg$maxFailPos, peg$maxFailPos + 1)
                : peg$computeLocation(peg$maxFailPos, peg$maxFailPos)
            );
          }
        }

        var parser = {
          SyntaxError: peg$SyntaxError,
          parse:       peg$parse
        };

        function parse_pattern(str) {
            const segments = parser.parse(str);
            const patterns = [];
            for (let i = 0, len = segments.length; i < len; i++) {
                const s = segments[i];
                if (s.string != undefined) {
                    patterns[i] = string(s.string);
                }
                else if (s.value != undefined) {
                    patterns[i] = value(s.value, s.size, s.specifiers);
                }
                else if (s.name === '_') {
                    patterns[i] = rest();
                }
                else if (s.name != undefined) {
                    patterns[i] = variable(s.name, s.size, s.specifiers);
                }
                else {
                    throw 'Unknown pattern ' + s;
                }
            }
            return patterns;
        }
        function parse(...args) {
            return parse_pattern(args.join(','));
        }

        function parse_int$1(bin, off, sizeInBytes, bigendian, signed) {
            switch (sizeInBytes) {
                case 1:
                    return signed ? bin.readInt8(off) : bin.readUInt8(off);
                case 2:
                    return bigendian
                        ? signed
                            ? bin.readInt16BE(off)
                            : bin.readUInt16BE(off)
                        : signed
                            ? bin.readInt16LE(off)
                            : bin.readUInt16LE(off);
                case 4:
                    return bigendian
                        ? signed
                            ? bin.readInt32BE(off)
                            : bin.readUInt32BE(off)
                        : signed
                            ? bin.readInt32LE(off)
                            : bin.readUInt32LE(off);
                case 8:
                    return bigendian
                        ? signed
                            ? bin.readBigInt64BE(off)
                            : bin.readBigUInt64BE(off)
                        : signed
                            ? bin.readBigInt64LE(off)
                            : bin.readBigUInt64LE(off);
                default:
                    throw 'Integers must be 8-, 16-, 32- or 64-bit';
            }
        }
        function parse_float$1(bin, off, sizeInBytes, bigendian = true) {
            switch (sizeInBytes) {
                case 4:
                    return bigendian ? bin.readFloatBE(off) : bin.readFloatLE(off);
                case 8:
                    return bigendian ? bin.readDoubleBE(off) : bin.readDoubleLE(off);
                default:
                    throw 'Floats must be 32- or 64-bit';
            }
        }

        function write_int$1(buf, value, offset, size, bigendian) {
            switch (size) {
                case 1:
                    buf.writeUInt8(value, offset);
                    break;
                case 2:
                    bigendian ? buf.writeUInt16BE(value, offset) : buf.writeUInt16LE(value, offset);
                    break;
                case 4:
                    bigendian ? buf.writeUInt32BE(value, offset) : buf.writeUInt32LE(value, offset);
                    break;
                case 8:
                    bigendian
                        ? buf.writeBigUInt64BE(value, offset)
                        : buf.writeBigUInt64LE(value, offset);
                    break;
                default:
                    throw new Error('integer size * unit must be 8, 16, 32 or 64');
            }
            return size;
        }
        function write_float$1(buf, value, offset, size, bigendian) {
            if (size === 4) {
                bigendian ? buf.writeFloatBE(value, offset) : buf.writeFloatLE(value, offset);
            }
            else if (size === 8) {
                bigendian ? buf.writeDoubleBE(value, offset) : buf.writeDoubleLE(value, offset);
            }
            else {
                throw new Error('float size * unit must be 32 or 64');
            }
            return size;
        }

        const $ = format;
        const parse_int = parse_int$1;
        const parse_float = parse_float$1;
        const write_int = write_int$1;
        const write_float = write_float$1;
        const lines = [];
        function $start() {
            lines.length = 0;
        }
        function $line(f, ...rest) {
            lines.push($(f, ...rest));
        }
        function $result() {
            return lines.join('\n');
        }
        // string
        function bits_expr(segment) {
            if (typeof segment.size === 'string') {
                return $('%s * %d', var_name(segment.size), segment.unit);
            }
            else {
                return (segment.size * segment.unit).toString();
            }
        }
        function get_number(segment) {
            $line('bits = %s;\n', bits_expr(segment));
            const parser = segment.type === 'integer' ? 'parse_int' : 'parse_float';
            const be = segment.bigendian, sg = segment.signed;
            $line('byteoffset = offset / 8; offset += bits');
            $line('if (offset > binsize) { return false; }');
            $line('else { result = %s(bin, byteoffset, bits / 8, %s, %s); }', parser, be, sg);
        }
        function get_binary(segment) {
            $line('byteoffset = offset / 8;');
            if (segment.size === true) {
                $line('offset = binsize;');
                $line('result = bin.slice(byteoffset);');
            }
            else {
                $line('bits = %s;', bits_expr(segment));
                $line('offset += bits;');
                $line('if (offset > binsize) { return false; }');
                $line('else { result = bin.slice(byteoffset,', 'byteoffset + bits / 8); }');
            }
        }
        function get_string(segment) {
            $line('byteoffset = offset / 8;');
            const strlen = segment.value.length;
            const strlenbits = strlen * 8;
            $line('offset += %d;', strlenbits);
            $line('if (offset > binsize) { return false; }');
            $line('else { result = bin.toString(byteoffset,', $('byteoffset + %d); }', strlen));
        }
        function skip_bits(segment) {
            if (typeof segment.size === 'string') {
                // Damn. Have to look up the size.
                $line('var skipbits = %s * %d;', var_name(segment.size), segment.unit);
                $line('if (offset + skipbits > binsize) { return false; }');
                $line('else { offset += skipbits; }');
            }
            else if (segment.size === true) {
                $line('if (offset % 8 === 0) { offset = binsize; }');
                $line('else { return false; }');
            }
            else {
                const bits = segment.unit * segment.size;
                $line('if (offset + %d > binsize) { return false; }', bits);
                $line('else { offset += %d; }', bits);
            }
        }
        function match_seg(segment) {
            if (segment.name === '_') {
                skip_bits(segment);
            }
            else {
                switch (segment.type) {
                    case 'integer':
                    case 'float':
                        get_number(segment);
                        break;
                    case 'binary':
                        get_binary(segment);
                        break;
                    case 'string':
                        get_string(segment);
                        break;
                }
                $line('if (result === false) return false;');
                if (segment.name) {
                    // variable is given a value in the environment
                    $line('else if (%s !== undefined) {', var_name(segment.name));
                    // .. and it is not the same as that matched
                    $line('if (%s != result) return false;', var_name(segment.name));
                    $line('}');
                    // variable is free
                    $line('else %s = result;', var_name(segment.name));
                }
                else {
                    const repr = JSON.stringify(segment.value);
                    $line('else if (result != %s) return false;', repr);
                }
            }
        }
        function var_name(name) {
            return 'var_' + name;
        }
        function variables(segments) {
            const names = {};
            for (let i = 0; i < segments.length; i++) {
                let name = segments[i].name;
                if (name && name !== '_') {
                    names[name] = true;
                }
                name = segments[i].size;
                if (typeof name === 'string') {
                    names[name] = true;
                }
            }
            return Object.keys(names);
        }
        function compile_pattern(segments) {
            $start();
            $line('return function(binary, env) {');
            $line("'__worker_loader_strict__';");
            $line('var bin = binary, env = env || {};');
            $line('var offset = 0, binsize = bin.length * 8;');
            $line('var bits, result, byteoffset;');
            const varnames = variables(segments);
            for (let v = 0; v < varnames.length; v++) {
                const name = varnames[v];
                $line("var %s = env['%s'];", var_name(name), name);
            }
            const len = segments.length;
            for (let i = 0; i < len; i++) {
                const segment = segments[i];
                $line('// ' + JSON.stringify(segment));
                match_seg(segment);
            }
            $line('if (offset == binsize) {');
            $line('return {');
            for (let v = 0; v < varnames.length; v++) {
                const name = varnames[v];
                $line('%s: %s,', name, var_name(name));
            }
            $line('};');
            $line('}'); // if offset == binsize
            $line('else return false;');
            $line('}'); // end function
            const fn = new Function('parse_int', 'parse_float', $result());
            return fn(parse_int, parse_float);
        }
        function write_seg(segment) {
            switch (segment.type) {
                case 'string':
                    $line("offset += buf.write(%s, offset, 'utf8');", JSON.stringify(segment.value));
                    break;
                case 'binary':
                    $line("val = bindings['%s'];", segment.name);
                    if (segment.size === true) {
                        $line('size = val.length;');
                    }
                    else if (typeof segment.size === 'string') {
                        $line("size = (bindings['%s'] * %d) / 8;", segment.size, segment.unit);
                    }
                    else {
                        $line('size = %d;', (segment.size * segment.unit) / 8);
                    }
                    $line('val.copy(buf, offset, 0, size);');
                    $line('offset += size;');
                    break;
                case 'integer':
                case 'float':
                    write_number(segment);
                    break;
            }
        }
        function write_number(segment) {
            if (segment.name) {
                $line("val = bindings['%s'];", segment.name);
            }
            else {
                $line('val = %d', segment.value);
            }
            const writer = segment.type === 'integer' ? 'write_int' : 'write_float';
            if (typeof segment.size === 'string') {
                $line("size = (bindings['%s'] * %d) / 8;", segment.size, segment.unit);
            }
            else {
                $line('size = %d;', (segment.size * segment.unit) / 8);
            }
            $line('%s(buf, val, offset, size, %s);', writer, segment.bigendian);
            $line('offset += size;');
        }
        function size_of(segments) {
            const variable = [];
            let fixed = 0;
            for (let i = 0; i < segments.length; i++) {
                const segment = segments[i];
                if (typeof segment.size === 'string' || segment.size === true) {
                    variable.push(segment);
                }
                else if (segment.type === 'string') {
                    fixed += buffer.Buffer.byteLength(segment.value);
                }
                else {
                    fixed += (segment.size * segment.unit) / 8;
                }
            }
            $line('var buffersize = %d;', fixed);
            if (variable.length > 0) {
                for (let j = 0; j < variable.length; j++) {
                    const segment = variable[j];
                    if (segment.size === true) {
                        $line("buffersize += bindings['%s'].length;", segment.name);
                    }
                    else {
                        $line("buffersize += (bindings['%s'] * %d) / 8;", segment.size, segment.unit);
                    }
                }
            }
        }
        function emit_write(segments) {
            $line('var val, size;');
            const len = segments.length;
            for (let i = 0; i < len; i++) {
                const segment = segments[i];
                $line('// %s', JSON.stringify(segment));
                write_seg(segment);
            }
        }
        function compile_ctor(segments) {
            $start();
            $line('return function(bindings) {');
            $line("'__worker_loader_strict__';");
            size_of(segments);
            $line('var buf = Buffer.alloc(buffersize);');
            $line('var offset = 0;');
            emit_write(segments);
            $line('return buf;');
            $line('}'); // end function
            return new Function('write_int', 'write_float', 'Buffer', $result())(write_int, write_float, buffer.Buffer);
        }
        function compile(...rest) {
            const str = rest.join(',');
            const p = parse(str);
            return compile_pattern(p);
        }
        function compile_builder(...rest) {
            const str = rest.join(',');
            const p = parse(str);
            return compile_ctor(p);
        }

        var MessageFlag;
        (function (MessageFlag) {
            MessageFlag[MessageFlag["App"] = 1] = "App";
        })(MessageFlag || (MessageFlag = {}));
        var MessageType;
        (function (MessageType) {
            MessageType[MessageType["Shake"] = 1] = "Shake";
            MessageType[MessageType["Close"] = 2] = "Close";
            MessageType[MessageType["Heart"] = 3] = "Heart";
            MessageType[MessageType["Data"] = 4] = "Data";
        })(MessageType || (MessageType = {}));
        var MessageVersion;
        (function (MessageVersion) {
            MessageVersion[MessageVersion["version1"] = 1] = "version1";
        })(MessageVersion || (MessageVersion = {}));

        const messageBuild = compile_builder(PROTOCOL);
        const messageParse = compile(PROTOCOL);
        const logger$3 = SdkLogger.getLogger('worker-channel-ble-peersocket');
        class PeerSocket extends EventBus {
            constructor() {
                super();
                this.readyState = 0;
                this.OPEN = 0;
                this.CLOSED = 1;
                this.MAX_MESSAGE_SIZE = 1027;
            }
            init() {
                const onMessage = (e) => {
                    const buf = buffer.Buffer.from(e.data);
                    const message = messageParse(buf);
                    logger$3.debug('[RAW] [R] size=%d bin=%s hex=%s', buf.byteLength, DataFormat.bufToStr(buf), DataFormat.bufToHex(buf));
                    this.emit('message', message.payload);
                };
                workerGlobalThis.getApp().blePort.addEventListener('message', onMessage);
                this.destory = () => {
                    workerGlobalThis.getApp().blePort.removeEventListener('message', onMessage);
                };
            }
            send(data) {
                this._sendData(data);
            }
            sendShake() {
                const buf = messageBuild({
                    flag: MessageFlag.App,
                    version: MessageVersion.version1,
                    type: MessageType.Shake,
                    port1: workerGlobalThis.getApp().port1,
                    port2: workerGlobalThis.getApp().port2,
                    appId: workerGlobalThis.getApp().appId,
                    extra: buffer.Buffer.from([0]),
                    payload: buffer.Buffer.from([0]),
                });
                this._bleSend(buf);
            }
            _sendData(payload) {
                const buf = messageBuild({
                    flag: MessageFlag.App,
                    version: MessageVersion.version1,
                    type: MessageType.Data,
                    port1: workerGlobalThis.getApp().port1,
                    port2: workerGlobalThis.getApp().port2,
                    appId: workerGlobalThis.getApp().appId,
                    extra: buffer.Buffer.from([0]),
                    payload: buffer.Buffer.from(payload),
                });
                this._bleSend(buf);
            }
            _bleSend(buf) {
                logger$3.debug('[RAW] [S] size=%d bin=%s hex=%s', buf.byteLength, DataFormat.bufToStr(buf), DataFormat.bufToHex(buf));
                workerGlobalThis.getApp().blePort.postMessage(buf.buffer, [buf.buffer]);
            }
        }
        const peerSocket = new PeerSocket();
        class Messaging {
            constructor() {
                this.peerSocket = peerSocket;
            }
        }
        const messaging = new Messaging();

        class Companion extends EventBus {
            constructor() {
                super();
                this.me = {
                    applicationId: '',
                    buildId: '',
                    host: '',
                    permissions: {
                        granted: (permissionName) => {
                            const permissions = {
                                access_activity: true,
                                access_aod: true,
                                access_app_cluster_storage: true,
                                access_calendars: true,
                                access_exercise: true,
                                access_heart_rate: true,
                                access_internet: true,
                                access_location: true,
                                run_background: true,
                                access_sleep: true,
                                access_user_profile: true,
                            };
                            return permissions[permissionName];
                        },
                    },
                };
                this.launchReasons = {
                    fileTransfer: false,
                    locationChanged: false,
                    peerAppLaunched: false,
                    settingsChanged: false,
                    wokenUp: false,
                };
            }
        }
        const companion = new Companion();

        class Settings {
        }
        const settings = new Settings();

        const logger$2 = SdkLogger.getLogger('network');
        function init$1() {
            logger$2.on('log', (data) => {
                workerGlobalThis.getApp().logModel.call(CmdType.WORKER_LOG_CMD, data);
            });
        }
        function fetch$1(params) {
            return __awaiter(this, void 0, void 0, function* () {
                // 可传对象，但字符串为get请求的url
                const url = typeof params === 'string' ? params : params.url;
                // String 大写 目前支持 GET/POST/PUT/PATCH/DELETE
                const method = typeof params === 'string' ? 'GET' : params.method;
                const headers = typeof params === 'string'
                    ? {
                        'Content-Type': 'application/json',
                    }
                    : Object.assign({}, params.headers);
                // Object/String/Array 仅当POST/PUT/PATCH有效， 值类型对应headers["Content-Type"]
                const body = typeof params === 'string' ? {} : params.body;
                const payload = method === 'GET'
                    ? {
                        url,
                        method,
                        headers,
                    }
                    : {
                        url,
                        method,
                        headers,
                        body,
                    };
                const result = yield workerGlobalThis
                    .getApp()
                    .rpcModel.request(CmdType.WORKER_NETWORK_HTTP_CMD, payload, { timeout: 60000 });
                logger$2.debug('request %s', payload);
                logger$2.debug('response %s', result);
                return result;
            });
        }

        function getUserInfo() {
            return __awaiter(this, void 0, void 0, function* () {
                const result = yield workerGlobalThis
                    .getApp()
                    .rpcModel.request(CmdType.WORKER_USER_INFO_CMD, {
                    appId: workerGlobalThis.getApp().appId,
                });
                return result;
            });
        }
        const logger$1 = SdkLogger.getLogger('zepp-open-api-fetch');
        function fetch(params) {
            return __awaiter(this, void 0, void 0, function* () {
                // 可传对象，但字符串为get请求的url
                const url = typeof params === 'string' ? params : params.url;
                // String 大写 目前支持 GET/POST/PUT/PATCH/DELETE
                const method = typeof params === 'string' ? 'GET' : params.method;
                const headers = typeof params === 'string'
                    ? {
                        'Content-Type': 'application/json',
                    }
                    : Object.assign({}, params.headers);
                // Object/String/Array 仅当POST/PUT/PATCH有效， 值类型对应headers["Content-Type"]
                const body = typeof params === 'string' ? {} : params.body;
                const payload = method === 'GET'
                    ? {
                        url,
                        method,
                        headers,
                    }
                    : {
                        url,
                        method,
                        headers,
                        body,
                    };
                const result = yield workerGlobalThis
                    .getApp()
                    .rpcModel.request(CmdType.WORKER_NETWORK_OPEN_API_CMD, payload, { timeout: 60000 });
                logger$1.debug('request %s', payload);
                logger$1.debug('response %s', result);
                return result;
            });
        }
        fetch.init = function () {
            logger$1.on('log', (data) => {
                workerGlobalThis.getApp().logModel.call(CmdType.WORKER_LOG_CMD, data);
            });
        };

        var internal = /*#__PURE__*/Object.freeze({
            __proto__: null,
            getUserInfo: getUserInfo,
            fetch: fetch
        });

        function getSystemInfo() {
            return __awaiter(this, void 0, void 0, function* () {
                const result = yield workerGlobalThis
                    .getApp()
                    .rpcModel.request(CmdType.SYSTEM_SETTINGS_CMD, {
                    appId: workerGlobalThis.getApp().appId,
                });
                return result;
            });
        }

        var system = /*#__PURE__*/Object.freeze({
            __proto__: null,
            getSystemInfo: getSystemInfo
        });

        function load(data) {
            const map = new Map();
            Object.keys(data).forEach((key) => {
                map.set(key, data[key]);
            });
            return map;
        }
        class LiveStorage extends EventBus {
            constructor(id, devId, data) {
                super();
                this.id = id;
                this.devId = devId;
                this.storage = load(data);
            }
            get length() {
                return this.storage.size;
            }
            key(index) {
                const keys = [...this.storage.keys()];
                const length = keys.length;
                if (index >= length || index < 0) {
                    return null;
                }
                return keys[index];
            }
            clear(preventEvent = true, sync = true) {
                this.storage.clear();
                if (!preventEvent) {
                    this.emit('change', {
                        key: null,
                        newValue: null,
                        oldValue: null,
                        changeType: 'clear',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
                if (sync) {
                    this.emit('sync', {
                        key: null,
                        newValue: null,
                        oldValue: null,
                        changeType: 'clear',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
            }
            getItem(key) {
                return this.storage.get(key);
            }
            removeItem(key, preventEvent = true, sync = true) {
                const oldValue = this.getItem(key);
                this.storage.delete(key);
                if (!preventEvent) {
                    this.emit('change', {
                        key,
                        newValue: null,
                        oldValue: oldValue,
                        changeType: 'remove',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
                if (sync) {
                    this.emit('sync', {
                        key,
                        newValue: null,
                        oldValue: oldValue,
                        changeType: 'remove',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
            }
            setItem(key, newValue, preventEvent = true, sync = true) {
                const oldValue = this.getItem(key);
                this.storage.set(key, newValue);
                if (!preventEvent) {
                    this.emit('change', {
                        key,
                        newValue,
                        oldValue,
                        changeType: 'set',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
                if (sync) {
                    this.emit('sync', {
                        key,
                        newValue,
                        oldValue,
                        changeType: 'set',
                        lId: this.id,
                        devId: this.devId,
                    });
                }
            }
            toObject() {
                const obj = {};
                this.storage.forEach((value, key) => {
                    obj[key] = value;
                });
                return obj;
            }
            static load(id, devId, data) {
                return new LiveStorage(id, devId, data);
            }
        }

        class LocalStorage extends EventBus {
            constructor(id, devId, data) {
                super();
                this.id = id;
                this.devId = devId;
                this.liveStorage = LiveStorage.load(id, devId, data);
                this.liveStorage.on('sync', (e) => {
                    this.emit('sync', e);
                });
            }
            get length() {
                return this.liveStorage.length;
            }
            clear() {
                this.liveStorage.clear(false);
            }
            getItem(key) {
                return this.liveStorage.getItem(key);
            }
            removeItem(key) {
                return this.liveStorage.removeItem(key, false);
            }
            setItem(key, value) {
                return this.liveStorage.setItem(key, value, false);
            }
            key(index) {
                return this.liveStorage.key(index);
            }
            toObject() {
                return this.liveStorage.toObject();
            }
            static load(id, devId, data) {
                return new LocalStorage(id, devId, data);
            }
        }

        const logger = UserLogger.getLogger('process');
        function init() {
            logger.on('log', (data) => {
                workerGlobalThis.getApp().logModel.call(CmdType.PROCESS_LOG_CMD, Object.assign({ appId: workerGlobalThis.getApp().appId }, data));
            });
        }

        const loggerWorker = workerLogger.getLogger('worker');
        const loggerCmd = workerLogger.getLogger('worker-channel-cmd');
        const loggerBle = workerLogger.getLogger('worker-channel-ble');
        const loggerRpc = workerLogger.getLogger('worker-channel-rpc');
        const loggerLog = LogLogger.getLogger('worker-channel-log');
        self.workerGlobalThis = self;
        workerGlobalThis.AppSideService = AppSideService;
        workerGlobalThis.__$$mobile$$__ = {};
        const globalState = {
            Buffer: buffer.Buffer,
            messaging,
            companion,
            settings,
            fetch: fetch$1,
            internal,
            system,
            localStorage: {},
            Logger: logger,
            userSettings: {},
            HmUtils,
        };
        Object.assign(workerGlobalThis, globalState);
        // worker 状态
        // 0：正在创建 1：创建成功 2：创建失败 3：创建成功，运行应用代码 4：关闭
        var WorkerStatus;
        (function (WorkerStatus) {
            WorkerStatus[WorkerStatus["Creating"] = 0] = "Creating";
            WorkerStatus[WorkerStatus["Success"] = 1] = "Success";
            WorkerStatus[WorkerStatus["Error"] = 2] = "Error";
            WorkerStatus[WorkerStatus["Running"] = 3] = "Running";
            WorkerStatus[WorkerStatus["Closed"] = 4] = "Closed";
        })(WorkerStatus || (WorkerStatus = {}));
        // 当前worker的状态
        workerGlobalThis.workerStatus = WorkerStatus.Creating;
        if (workerGlobalThis.name === undefined || workerGlobalThis.name.length === 0) {
            workerGlobalThis.name = generateUUID();
        }
        function $$runSideServiceCode$$(code) {
            globalState.messaging.peerSocket.init();
            globalState.messaging.peerSocket.sendShake();
            init$1();
            fetch.init();
            init();
            new Function('{messaging, fetch, companion, Buffer, settings, localStorage, Logger, internal, system, userSettings, HmUtils}', code)(globalState);
            workerGlobalThis.__$$mobile$$__.appSideService.onInit();
            workerGlobalThis.__$$mobile$$__.appSideService.onRun();
            workerGlobalThis.workerStatus = WorkerStatus.Running;
        }
        class WorkerService extends EventBus {
            constructor() {
                super();
            }
            handleCompanion() {
                switch (this.reason.launchType) {
                    case 'settingsChanged': {
                        companion.launchReasons.settingsChanged = true;
                        break;
                    }
                    case 'locationChanged': {
                        companion.launchReasons.locationChanged = true;
                        break;
                    }
                    case 'peerAppLaunched': {
                        companion.launchReasons.peerAppLaunched = true;
                        break;
                    }
                    case 'wakeinterval': {
                        companion.launchReasons.wokenUp = true;
                        break;
                    }
                    case 'fileTransfer': {
                        companion.launchReasons.fileTransfer = true;
                        break;
                    }
                    default: {
                        loggerWorker.error('not support launch type');
                    }
                }
            }
            initStorage() {
                settings.settingsStorage.on('sync', (evt) => {
                    loggerWorker.log('settingsStorage=>', evt);
                    switch (evt.changeType) {
                        case 'set': {
                            this.rpcModel.call(CmdType.WORKER_SETTINGS_STORAGE_SET_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                        case 'remove': {
                            this.rpcModel.call(CmdType.WORKER_SETTINGS_STORAGE_REMOVE_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                        case 'clear': {
                            this.rpcModel.call(CmdType.WORKER_SETTINGS_STORAGE_CLEAR_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                    }
                });
                globalState.localStorage.on('sync', (evt) => {
                    loggerWorker.log('localStorage=>', evt);
                    switch (evt.changeType) {
                        case 'set': {
                            this.rpcModel.call(CmdType.WORKER_LOCAL_STORAGE_SET_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                        case 'remove': {
                            this.rpcModel.call(CmdType.WORKER_LOCAL_STORAGE_REMOVE_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                        case 'clear': {
                            this.rpcModel.call(CmdType.WORKER_LOCAL_STORAGE_CLEAR_CMD, Object.assign({ appId: this.appId }, evt));
                            break;
                        }
                    }
                });
            }
            initModels() {
                return __awaiter(this, void 0, void 0, function* () {
                    // this.blePort.addEventListener('message', (e: any) => {
                    //   logger.log('[RAW] ble port receive message=> %j', e.data)
                    // })
                    // this.rpcPort.addEventListener('message', (e: any) => {
                    //   logger.log('[RAW] rpc port receive message=> %j', e.data)
                    // })
                    // this.logPort.addEventListener('message', (e: any) => {
                    //   logger.log('[RAW] log port receive message=> %j', e.data)
                    // })
                    this.bleModel = yield this.initModel('worker-channel-ble', {}, this.blePort, loggerBle);
                    this.rpcModel = yield this.initModel('worker-channel-rpc', {}, this.rpcPort, loggerRpc);
                    this.logModel = yield this.initModel('worker-channel-log', {}, this.logPort, loggerLog);
                    this.blePort.start();
                    this.rpcPort.start();
                    this.logPort.start();
                    workerLogger.on('log', (data) => {
                        this.logModel.call(CmdType.WORKER_LOG_CMD, data);
                    });
                });
            }
            initModel(name, model, port, logger) {
                return __awaiter(this, void 0, void 0, function* () {
                    const hmPort = new HmMessagePort(port, logger);
                    const peer = yield new PeerChild({
                        name,
                        parent: hmPort,
                        child: hmPort,
                        logger,
                        model,
                    }).sendHandshakeReply();
                    loggerWorker.debug('%s [child] [handshake] successful', name);
                    return peer;
                });
            }
            init() {
                loggerWorker.log('init');
            }
            start() {
                loggerWorker.log('start');
            }
        }
        function main() {
            return __awaiter(this, void 0, void 0, function* () {
                const process = new WorkerService();
                workerGlobalThis.getApp = () => process;
                // ; (workerGlobalThis as any).addEventListener('message', (e: any) => {
                //   logger.log('[RAW] cmd port receive message => %j', e.data)
                // })
                const cmdHmPort = new HmMessagePort(self, loggerCmd);
                process.cmdModel = yield new PeerChild({
                    name: 'worker-channel-cmd',
                    parent: cmdHmPort,
                    child: cmdHmPort,
                    logger: loggerCmd,
                    model: {
                        [CmdType.PROCESS_INFO_CMD]: (ctx) => {
                            const data = ctx.request.params;
                            process.pid = data.pid;
                            process.appId = data.appId;
                            process.port1 = data.port1;
                            process.port2 = data.port2;
                            process.reason = data.reason;
                            process.userSettings = data.userSettings;
                            // TODO:  缺开发者 ID
                            settings.settingsStorage = LiveStorage.load('', -1, data.settingsStorage);
                            globalState.localStorage = LocalStorage.load('', -1, data.localStorage);
                            globalState.userSettings = data.userSettings;
                            process.handleCompanion();
                            process.initStorage();
                            return {};
                        },
                        [CmdType.CHANNEL_CMD]: (ctx) => {
                            const data = ctx.request.params;
                            process.blePort = data.ble;
                            process.rpcPort = data.rpc;
                            process.logPort = data.log;
                            process.initModels();
                            return {};
                        },
                        [CmdType.SIDE_CODE_CMD](ctx) {
                            const data = ctx.request.params;
                            const buf = data.serviceCode;
                            $$runSideServiceCode$$(DataFormat.bufToStr(buffer.Buffer.from(buf)));
                        },
                        [CmdType.LAUNCH_SETTING_CMD](ctx) {
                            const data = ctx.request.params.reason;
                            companion.launchReasons.settingsChanged = true;
                            switch (data.changeType) {
                                case 'clear': {
                                    settings.settingsStorage.clear(false, false);
                                    break;
                                }
                                case 'remove': {
                                    settings.settingsStorage.removeItem(data.key, false, false);
                                    break;
                                }
                                case 'set': {
                                    settings.settingsStorage.setItem(data.key, data.newValue, false, false);
                                    break;
                                }
                                default: {
                                    loggerWorker.error('not support');
                                }
                            }
                        },
                    },
                }).sendHandshakeReply();
                if (process.cmdModel) {
                    loggerWorker.debug('%s [child] [handshake] successful', 'worker-channel-cmd');
                }
                process.init();
                process.start();
            });
        }
        main().catch((e) => {
            loggerWorker.log(e);
        });

        exports.WorkerService = WorkerService;

        Object.defineProperty(exports, '__esModule', { value: true });

        return exports;

    })({}));
    }, null);
    /* eslint-enable */

    function set(values) {
        const s = {};
        if (!values) {
            return s;
        }
        for (const i in values) {
            s[values[i]] = 1;
        }
        return s;
    }
    function variable(name, size, specifiers0) {
        const specifiers = set(specifiers0);
        const segment = { name: name };
        segment.type = type_in(specifiers);
        specs(segment, segment.type, specifiers);
        segment.size = size_of(segment, segment.type, size, segment.unit);
        return segment;
    }
    function rest() {
        return variable('_', true, ['binary']);
    }
    function value(val, size, specifiers0) {
        const specifiers = set(specifiers0);
        const segment = { value: val };
        segment.type = type_in(specifiers);
        specs(segment, segment.type, specifiers);
        segment.size = size_of(segment, segment.type, size, segment.unit);
        return segment;
    }
    // A string can appear as a literal, but it must appear without
    // specifiers.
    function string(val) {
        return { value: val, type: 'string', unit: 8 };
    }
    const TYPES = {
        integer: 1,
        binary: 1,
        float: 1,
        string: 1,
    };
    function type_in(specifiers) {
        for (const t in specifiers) {
            if (TYPES[t]) {
                return t;
            }
        }
        return 'integer';
    }
    function specs(segment, type, specifiers) {
        switch (type) {
            case 'integer':
                segment.signed = signed_in(specifiers);
            // fall through
            case 'float':
                segment.bigendian = endian_in(specifiers);
            // fall through
            default:
                segment.unit = unit_in(specifiers, segment.type);
        }
        return segment;
    }
    function endian_in(specifiers) {
        // default is big
        return !specifiers['little'];
    }
    function signed_in(specifiers) {
        // default is unsigned
        return specifiers['signed'];
    }
    function unit_in(specifiers, type) {
        for (const s in specifiers) {
            if (s.substr(0, 5) == 'unit:') {
                const unit = parseInt(s.substr(5));
                // TODO check sane for type
                return unit;
            }
        }
        // OK defaults then
        switch (type) {
            case 'binary':
            case 'string':
                return 8;
            case 'integer':
            case 'float':
                return 1;
            default:
                return 1;
        }
    }
    function size_of(segment, type, size, unit) {
        if (size !== undefined && size !== '' && size !== null) {
            return size;
        }
        else {
            switch (type) {
                case 'integer':
                    return 8;
                case 'float':
                    return 64;
                case 'binary':
                case 'string':
                    return true;
            }
        }
    }

    var commonjsGlobal = typeof globalThis !== 'undefined' ? globalThis : typeof window !== 'undefined' ? window : typeof global !== 'undefined' ? global : typeof self !== 'undefined' ? self : {};

    /*
     * Generated by PEG.js 0.10.0.
     *
     * http://pegjs.org/
     */

    function peg$subclass(child, parent) {
      function ctor() { this.constructor = child; }
      ctor.prototype = parent.prototype;
      child.prototype = new ctor();
    }

    function peg$SyntaxError(message, expected, found, location) {
      this.message  = message;
      this.expected = expected;
      this.found    = found;
      this.location = location;
      this.name     = "SyntaxError";

      if (typeof Error.captureStackTrace === "function") {
        Error.captureStackTrace(this, peg$SyntaxError);
      }
    }

    peg$subclass(peg$SyntaxError, Error);

    peg$SyntaxError.buildMessage = function(expected, found) {
      var DESCRIBE_EXPECTATION_FNS = {
            literal: function(expectation) {
              return "\"" + literalEscape(expectation.text) + "\"";
            },

            "class": function(expectation) {
              var escapedParts = "",
                  i;

              for (i = 0; i < expectation.parts.length; i++) {
                escapedParts += expectation.parts[i] instanceof Array
                  ? classEscape(expectation.parts[i][0]) + "-" + classEscape(expectation.parts[i][1])
                  : classEscape(expectation.parts[i]);
              }

              return "[" + (expectation.inverted ? "^" : "") + escapedParts + "]";
            },

            any: function(expectation) {
              return "any character";
            },

            end: function(expectation) {
              return "end of input";
            },

            other: function(expectation) {
              return expectation.description;
            }
          };

      function hex(ch) {
        return ch.charCodeAt(0).toString(16).toUpperCase();
      }

      function literalEscape(s) {
        return s
          .replace(/\\/g, '\\\\')
          .replace(/"/g,  '\\"')
          .replace(/\0/g, '\\0')
          .replace(/\t/g, '\\t')
          .replace(/\n/g, '\\n')
          .replace(/\r/g, '\\r')
          .replace(/[\x00-\x0F]/g,          function(ch) { return '\\x0' + hex(ch); })
          .replace(/[\x10-\x1F\x7F-\x9F]/g, function(ch) { return '\\x'  + hex(ch); });
      }

      function classEscape(s) {
        return s
          .replace(/\\/g, '\\\\')
          .replace(/\]/g, '\\]')
          .replace(/\^/g, '\\^')
          .replace(/-/g,  '\\-')
          .replace(/\0/g, '\\0')
          .replace(/\t/g, '\\t')
          .replace(/\n/g, '\\n')
          .replace(/\r/g, '\\r')
          .replace(/[\x00-\x0F]/g,          function(ch) { return '\\x0' + hex(ch); })
          .replace(/[\x10-\x1F\x7F-\x9F]/g, function(ch) { return '\\x'  + hex(ch); });
      }

      function describeExpectation(expectation) {
        return DESCRIBE_EXPECTATION_FNS[expectation.type](expectation);
      }

      function describeExpected(expected) {
        var descriptions = new Array(expected.length),
            i, j;

        for (i = 0; i < expected.length; i++) {
          descriptions[i] = describeExpectation(expected[i]);
        }

        descriptions.sort();

        if (descriptions.length > 0) {
          for (i = 1, j = 1; i < descriptions.length; i++) {
            if (descriptions[i - 1] !== descriptions[i]) {
              descriptions[j] = descriptions[i];
              j++;
            }
          }
          descriptions.length = j;
        }

        switch (descriptions.length) {
          case 1:
            return descriptions[0];

          case 2:
            return descriptions[0] + " or " + descriptions[1];

          default:
            return descriptions.slice(0, -1).join(", ")
              + ", or "
              + descriptions[descriptions.length - 1];
        }
      }

      function describeFound(found) {
        return found ? "\"" + literalEscape(found) + "\"" : "end of input";
      }

      return "Expected " + describeExpected(expected) + " but " + describeFound(found) + " found.";
    };

    function peg$parse(input, options) {
      options = options !== void 0 ? options : {};

      var peg$FAILED = {},

          peg$startRuleFunctions = { start: peg$parsestart },
          peg$startRuleFunction  = peg$parsestart,

          peg$c0 = function(head, tail) { tail.unshift(head); return tail; },
          peg$c1 = ",",
          peg$c2 = peg$literalExpectation(",", false),
          peg$c3 = function(seg) { return seg; },
          peg$c4 = function(str) { return {string: str}; },
          peg$c5 = function(v, size, specs) { return {name: v, size: size, specifiers: specs}; },
          peg$c6 = function(v, size, specs) { return {value: v, size: size, specifiers: specs}; },
          peg$c7 = "\"",
          peg$c8 = peg$literalExpectation("\"", false),
          peg$c9 = function() { return "";    },
          peg$c10 = function(chars) { return chars; },
          peg$c11 = function(chars) { return chars.join(""); },
          peg$c12 = /^[^"\\\0-\x1F\x7F]/,
          peg$c13 = peg$classExpectation(["\"", "\\", ["\0", "\x1F"], "\x7F"], true, false),
          peg$c14 = "\\\"",
          peg$c15 = peg$literalExpectation("\\\"", false),
          peg$c16 = function() { return '"';  },
          peg$c17 = "\\\\",
          peg$c18 = peg$literalExpectation("\\\\", false),
          peg$c19 = function() { return "\\"; },
          peg$c20 = "\\/",
          peg$c21 = peg$literalExpectation("\\/", false),
          peg$c22 = function() { return "/";  },
          peg$c23 = "\\b",
          peg$c24 = peg$literalExpectation("\\b", false),
          peg$c25 = function() { return "\b"; },
          peg$c26 = "\\f",
          peg$c27 = peg$literalExpectation("\\f", false),
          peg$c28 = function() { return "\f"; },
          peg$c29 = "\\n",
          peg$c30 = peg$literalExpectation("\\n", false),
          peg$c31 = function() { return "\n"; },
          peg$c32 = "\\r",
          peg$c33 = peg$literalExpectation("\\r", false),
          peg$c34 = function() { return "\r"; },
          peg$c35 = "\\t",
          peg$c36 = peg$literalExpectation("\\t", false),
          peg$c37 = function() { return "\t"; },
          peg$c38 = "\\u",
          peg$c39 = peg$literalExpectation("\\u", false),
          peg$c40 = function(h1, h2, h3, h4) {
                return String.fromCharCode(parseInt("0x" + h1 + h2 + h3 + h4));
              },
          peg$c41 = /^[0-9a-fA-F]/,
          peg$c42 = peg$classExpectation([["0", "9"], ["a", "f"], ["A", "F"]], false, false),
          peg$c43 = /^[_a-zA-Z]/,
          peg$c44 = peg$classExpectation(["_", ["a", "z"], ["A", "Z"]], false, false),
          peg$c45 = /^[_a-zA-Z0-9]/,
          peg$c46 = peg$classExpectation(["_", ["a", "z"], ["A", "Z"], ["0", "9"]], false, false),
          peg$c47 = function(head, tail) { return head + tail.join(''); },
          peg$c48 = "0",
          peg$c49 = peg$literalExpectation("0", false),
          peg$c50 = function() { return 0; },
          peg$c51 = /^[1-9]/,
          peg$c52 = peg$classExpectation([["1", "9"]], false, false),
          peg$c53 = /^[0-9]/,
          peg$c54 = peg$classExpectation([["0", "9"]], false, false),
          peg$c55 = function(head, tail) { return parseInt(head + tail.join('')); },
          peg$c56 = ":",
          peg$c57 = peg$literalExpectation(":", false),
          peg$c58 = function(num) { return num; },
          peg$c59 = function(id) { return id; },
          peg$c60 = "/",
          peg$c61 = peg$literalExpectation("/", false),
          peg$c62 = "-",
          peg$c63 = peg$literalExpectation("-", false),
          peg$c64 = function(spec) { return spec; },
          peg$c65 = "little",
          peg$c66 = peg$literalExpectation("little", false),
          peg$c67 = "big",
          peg$c68 = peg$literalExpectation("big", false),
          peg$c69 = "signed",
          peg$c70 = peg$literalExpectation("signed", false),
          peg$c71 = "unsigned",
          peg$c72 = peg$literalExpectation("unsigned", false),
          peg$c73 = "integer",
          peg$c74 = peg$literalExpectation("integer", false),
          peg$c75 = "binary",
          peg$c76 = peg$literalExpectation("binary", false),
          peg$c77 = "float",
          peg$c78 = peg$literalExpectation("float", false),
          peg$c79 = "string",
          peg$c80 = peg$literalExpectation("string", false),
          peg$c81 = "unit:",
          peg$c82 = peg$literalExpectation("unit:", false),
          peg$c83 = function(num) { return 'unit:' + num; },
          peg$c84 = /^[ \t\n]/,
          peg$c85 = peg$classExpectation([" ", "\t", "\n"], false, false),

          peg$currPos          = 0,
          peg$posDetailsCache  = [{ line: 1, column: 1 }],
          peg$maxFailPos       = 0,
          peg$maxFailExpected  = [],
          peg$result;

      if ("startRule" in options) {
        if (!(options.startRule in peg$startRuleFunctions)) {
          throw new Error("Can't start parsing from rule \"" + options.startRule + "\".");
        }

        peg$startRuleFunction = peg$startRuleFunctions[options.startRule];
      }

      function peg$literalExpectation(text, ignoreCase) {
        return { type: "literal", text: text, ignoreCase: ignoreCase };
      }

      function peg$classExpectation(parts, inverted, ignoreCase) {
        return { type: "class", parts: parts, inverted: inverted, ignoreCase: ignoreCase };
      }

      function peg$endExpectation() {
        return { type: "end" };
      }

      function peg$computePosDetails(pos) {
        var details = peg$posDetailsCache[pos], p;

        if (details) {
          return details;
        } else {
          p = pos - 1;
          while (!peg$posDetailsCache[p]) {
            p--;
          }

          details = peg$posDetailsCache[p];
          details = {
            line:   details.line,
            column: details.column
          };

          while (p < pos) {
            if (input.charCodeAt(p) === 10) {
              details.line++;
              details.column = 1;
            } else {
              details.column++;
            }

            p++;
          }

          peg$posDetailsCache[pos] = details;
          return details;
        }
      }

      function peg$computeLocation(startPos, endPos) {
        var startPosDetails = peg$computePosDetails(startPos),
            endPosDetails   = peg$computePosDetails(endPos);

        return {
          start: {
            offset: startPos,
            line:   startPosDetails.line,
            column: startPosDetails.column
          },
          end: {
            offset: endPos,
            line:   endPosDetails.line,
            column: endPosDetails.column
          }
        };
      }

      function peg$fail(expected) {
        if (peg$currPos < peg$maxFailPos) { return; }

        if (peg$currPos > peg$maxFailPos) {
          peg$maxFailPos = peg$currPos;
          peg$maxFailExpected = [];
        }

        peg$maxFailExpected.push(expected);
      }

      function peg$buildStructuredError(expected, found, location) {
        return new peg$SyntaxError(
          peg$SyntaxError.buildMessage(expected, found),
          expected,
          found,
          location
        );
      }

      function peg$parsestart() {
        var s0, s1, s2, s3, s4;

        s0 = peg$currPos;
        s1 = peg$parsews();
        if (s1 !== peg$FAILED) {
          s2 = peg$parsesegment();
          if (s2 !== peg$FAILED) {
            s3 = [];
            s4 = peg$parsesegmentTail();
            while (s4 !== peg$FAILED) {
              s3.push(s4);
              s4 = peg$parsesegmentTail();
            }
            if (s3 !== peg$FAILED) {
              s1 = peg$c0(s2, s3);
              s0 = s1;
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsesegmentTail() {
        var s0, s1, s2, s3, s4;

        s0 = peg$currPos;
        s1 = peg$parsews();
        if (s1 !== peg$FAILED) {
          if (input.charCodeAt(peg$currPos) === 44) {
            s2 = peg$c1;
            peg$currPos++;
          } else {
            s2 = peg$FAILED;
            { peg$fail(peg$c2); }
          }
          if (s2 !== peg$FAILED) {
            s3 = peg$parsews();
            if (s3 !== peg$FAILED) {
              s4 = peg$parsesegment();
              if (s4 !== peg$FAILED) {
                s1 = peg$c3(s4);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsesegment() {
        var s0, s1, s2, s3;

        s0 = peg$currPos;
        s1 = peg$parsestring();
        if (s1 !== peg$FAILED) {
          s1 = peg$c4(s1);
        }
        s0 = s1;
        if (s0 === peg$FAILED) {
          s0 = peg$currPos;
          s1 = peg$parseidentifier();
          if (s1 !== peg$FAILED) {
            s2 = peg$parsesize();
            if (s2 === peg$FAILED) {
              s2 = null;
            }
            if (s2 !== peg$FAILED) {
              s3 = peg$parsespecifierList();
              if (s3 === peg$FAILED) {
                s3 = null;
              }
              if (s3 !== peg$FAILED) {
                s1 = peg$c5(s1, s2, s3);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
          if (s0 === peg$FAILED) {
            s0 = peg$currPos;
            s1 = peg$parsenumber();
            if (s1 !== peg$FAILED) {
              s2 = peg$parsesize();
              if (s2 === peg$FAILED) {
                s2 = null;
              }
              if (s2 !== peg$FAILED) {
                s3 = peg$parsespecifierList();
                if (s3 === peg$FAILED) {
                  s3 = null;
                }
                if (s3 !== peg$FAILED) {
                  s1 = peg$c6(s1, s2, s3);
                  s0 = s1;
                } else {
                  peg$currPos = s0;
                  s0 = peg$FAILED;
                }
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          }
        }

        return s0;
      }

      function peg$parsestring() {
        var s0, s1, s2, s3;

        s0 = peg$currPos;
        if (input.charCodeAt(peg$currPos) === 34) {
          s1 = peg$c7;
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c8); }
        }
        if (s1 !== peg$FAILED) {
          if (input.charCodeAt(peg$currPos) === 34) {
            s2 = peg$c7;
            peg$currPos++;
          } else {
            s2 = peg$FAILED;
            { peg$fail(peg$c8); }
          }
          if (s2 !== peg$FAILED) {
            s1 = peg$c9();
            s0 = s1;
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }
        if (s0 === peg$FAILED) {
          s0 = peg$currPos;
          if (input.charCodeAt(peg$currPos) === 34) {
            s1 = peg$c7;
            peg$currPos++;
          } else {
            s1 = peg$FAILED;
            { peg$fail(peg$c8); }
          }
          if (s1 !== peg$FAILED) {
            s2 = peg$parsechars();
            if (s2 !== peg$FAILED) {
              if (input.charCodeAt(peg$currPos) === 34) {
                s3 = peg$c7;
                peg$currPos++;
              } else {
                s3 = peg$FAILED;
                { peg$fail(peg$c8); }
              }
              if (s3 !== peg$FAILED) {
                s1 = peg$c10(s2);
                s0 = s1;
              } else {
                peg$currPos = s0;
                s0 = peg$FAILED;
              }
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        }

        return s0;
      }

      function peg$parsechars() {
        var s0, s1, s2;

        s0 = peg$currPos;
        s1 = [];
        s2 = peg$parsechar();
        if (s2 !== peg$FAILED) {
          while (s2 !== peg$FAILED) {
            s1.push(s2);
            s2 = peg$parsechar();
          }
        } else {
          s1 = peg$FAILED;
        }
        if (s1 !== peg$FAILED) {
          s1 = peg$c11(s1);
        }
        s0 = s1;

        return s0;
      }

      function peg$parsechar() {
        var s0, s1, s2, s3, s4, s5;

        if (peg$c12.test(input.charAt(peg$currPos))) {
          s0 = input.charAt(peg$currPos);
          peg$currPos++;
        } else {
          s0 = peg$FAILED;
          { peg$fail(peg$c13); }
        }
        if (s0 === peg$FAILED) {
          s0 = peg$currPos;
          if (input.substr(peg$currPos, 2) === peg$c14) {
            s1 = peg$c14;
            peg$currPos += 2;
          } else {
            s1 = peg$FAILED;
            { peg$fail(peg$c15); }
          }
          if (s1 !== peg$FAILED) {
            s1 = peg$c16();
          }
          s0 = s1;
          if (s0 === peg$FAILED) {
            s0 = peg$currPos;
            if (input.substr(peg$currPos, 2) === peg$c17) {
              s1 = peg$c17;
              peg$currPos += 2;
            } else {
              s1 = peg$FAILED;
              { peg$fail(peg$c18); }
            }
            if (s1 !== peg$FAILED) {
              s1 = peg$c19();
            }
            s0 = s1;
            if (s0 === peg$FAILED) {
              s0 = peg$currPos;
              if (input.substr(peg$currPos, 2) === peg$c20) {
                s1 = peg$c20;
                peg$currPos += 2;
              } else {
                s1 = peg$FAILED;
                { peg$fail(peg$c21); }
              }
              if (s1 !== peg$FAILED) {
                s1 = peg$c22();
              }
              s0 = s1;
              if (s0 === peg$FAILED) {
                s0 = peg$currPos;
                if (input.substr(peg$currPos, 2) === peg$c23) {
                  s1 = peg$c23;
                  peg$currPos += 2;
                } else {
                  s1 = peg$FAILED;
                  { peg$fail(peg$c24); }
                }
                if (s1 !== peg$FAILED) {
                  s1 = peg$c25();
                }
                s0 = s1;
                if (s0 === peg$FAILED) {
                  s0 = peg$currPos;
                  if (input.substr(peg$currPos, 2) === peg$c26) {
                    s1 = peg$c26;
                    peg$currPos += 2;
                  } else {
                    s1 = peg$FAILED;
                    { peg$fail(peg$c27); }
                  }
                  if (s1 !== peg$FAILED) {
                    s1 = peg$c28();
                  }
                  s0 = s1;
                  if (s0 === peg$FAILED) {
                    s0 = peg$currPos;
                    if (input.substr(peg$currPos, 2) === peg$c29) {
                      s1 = peg$c29;
                      peg$currPos += 2;
                    } else {
                      s1 = peg$FAILED;
                      { peg$fail(peg$c30); }
                    }
                    if (s1 !== peg$FAILED) {
                      s1 = peg$c31();
                    }
                    s0 = s1;
                    if (s0 === peg$FAILED) {
                      s0 = peg$currPos;
                      if (input.substr(peg$currPos, 2) === peg$c32) {
                        s1 = peg$c32;
                        peg$currPos += 2;
                      } else {
                        s1 = peg$FAILED;
                        { peg$fail(peg$c33); }
                      }
                      if (s1 !== peg$FAILED) {
                        s1 = peg$c34();
                      }
                      s0 = s1;
                      if (s0 === peg$FAILED) {
                        s0 = peg$currPos;
                        if (input.substr(peg$currPos, 2) === peg$c35) {
                          s1 = peg$c35;
                          peg$currPos += 2;
                        } else {
                          s1 = peg$FAILED;
                          { peg$fail(peg$c36); }
                        }
                        if (s1 !== peg$FAILED) {
                          s1 = peg$c37();
                        }
                        s0 = s1;
                        if (s0 === peg$FAILED) {
                          s0 = peg$currPos;
                          if (input.substr(peg$currPos, 2) === peg$c38) {
                            s1 = peg$c38;
                            peg$currPos += 2;
                          } else {
                            s1 = peg$FAILED;
                            { peg$fail(peg$c39); }
                          }
                          if (s1 !== peg$FAILED) {
                            s2 = peg$parsehexDigit();
                            if (s2 !== peg$FAILED) {
                              s3 = peg$parsehexDigit();
                              if (s3 !== peg$FAILED) {
                                s4 = peg$parsehexDigit();
                                if (s4 !== peg$FAILED) {
                                  s5 = peg$parsehexDigit();
                                  if (s5 !== peg$FAILED) {
                                    s1 = peg$c40(s2, s3, s4, s5);
                                    s0 = s1;
                                  } else {
                                    peg$currPos = s0;
                                    s0 = peg$FAILED;
                                  }
                                } else {
                                  peg$currPos = s0;
                                  s0 = peg$FAILED;
                                }
                              } else {
                                peg$currPos = s0;
                                s0 = peg$FAILED;
                              }
                            } else {
                              peg$currPos = s0;
                              s0 = peg$FAILED;
                            }
                          } else {
                            peg$currPos = s0;
                            s0 = peg$FAILED;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }

        return s0;
      }

      function peg$parsehexDigit() {
        var s0;

        if (peg$c41.test(input.charAt(peg$currPos))) {
          s0 = input.charAt(peg$currPos);
          peg$currPos++;
        } else {
          s0 = peg$FAILED;
          { peg$fail(peg$c42); }
        }

        return s0;
      }

      function peg$parseidentifier() {
        var s0, s1, s2, s3;

        s0 = peg$currPos;
        if (peg$c43.test(input.charAt(peg$currPos))) {
          s1 = input.charAt(peg$currPos);
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c44); }
        }
        if (s1 !== peg$FAILED) {
          s2 = [];
          if (peg$c45.test(input.charAt(peg$currPos))) {
            s3 = input.charAt(peg$currPos);
            peg$currPos++;
          } else {
            s3 = peg$FAILED;
            { peg$fail(peg$c46); }
          }
          while (s3 !== peg$FAILED) {
            s2.push(s3);
            if (peg$c45.test(input.charAt(peg$currPos))) {
              s3 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s3 = peg$FAILED;
              { peg$fail(peg$c46); }
            }
          }
          if (s2 !== peg$FAILED) {
            s1 = peg$c47(s1, s2);
            s0 = s1;
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsenumber() {
        var s0, s1, s2, s3;

        s0 = peg$currPos;
        if (input.charCodeAt(peg$currPos) === 48) {
          s1 = peg$c48;
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c49); }
        }
        if (s1 !== peg$FAILED) {
          s1 = peg$c50();
        }
        s0 = s1;
        if (s0 === peg$FAILED) {
          s0 = peg$currPos;
          if (peg$c51.test(input.charAt(peg$currPos))) {
            s1 = input.charAt(peg$currPos);
            peg$currPos++;
          } else {
            s1 = peg$FAILED;
            { peg$fail(peg$c52); }
          }
          if (s1 !== peg$FAILED) {
            s2 = [];
            if (peg$c53.test(input.charAt(peg$currPos))) {
              s3 = input.charAt(peg$currPos);
              peg$currPos++;
            } else {
              s3 = peg$FAILED;
              { peg$fail(peg$c54); }
            }
            while (s3 !== peg$FAILED) {
              s2.push(s3);
              if (peg$c53.test(input.charAt(peg$currPos))) {
                s3 = input.charAt(peg$currPos);
                peg$currPos++;
              } else {
                s3 = peg$FAILED;
                { peg$fail(peg$c54); }
              }
            }
            if (s2 !== peg$FAILED) {
              s1 = peg$c55(s1, s2);
              s0 = s1;
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        }

        return s0;
      }

      function peg$parsesize() {
        var s0, s1, s2;

        s0 = peg$currPos;
        if (input.charCodeAt(peg$currPos) === 58) {
          s1 = peg$c56;
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c57); }
        }
        if (s1 !== peg$FAILED) {
          s2 = peg$parsenumber();
          if (s2 !== peg$FAILED) {
            s1 = peg$c58(s2);
            s0 = s1;
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }
        if (s0 === peg$FAILED) {
          s0 = peg$currPos;
          if (input.charCodeAt(peg$currPos) === 58) {
            s1 = peg$c56;
            peg$currPos++;
          } else {
            s1 = peg$FAILED;
            { peg$fail(peg$c57); }
          }
          if (s1 !== peg$FAILED) {
            s2 = peg$parseidentifier();
            if (s2 !== peg$FAILED) {
              s1 = peg$c59(s2);
              s0 = s1;
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        }

        return s0;
      }

      function peg$parsespecifierList() {
        var s0, s1, s2, s3, s4;

        s0 = peg$currPos;
        if (input.charCodeAt(peg$currPos) === 47) {
          s1 = peg$c60;
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c61); }
        }
        if (s1 !== peg$FAILED) {
          s2 = peg$parsespecifier();
          if (s2 !== peg$FAILED) {
            s3 = [];
            s4 = peg$parsespecifierTail();
            while (s4 !== peg$FAILED) {
              s3.push(s4);
              s4 = peg$parsespecifierTail();
            }
            if (s3 !== peg$FAILED) {
              s1 = peg$c0(s2, s3);
              s0 = s1;
            } else {
              peg$currPos = s0;
              s0 = peg$FAILED;
            }
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsespecifierTail() {
        var s0, s1, s2;

        s0 = peg$currPos;
        if (input.charCodeAt(peg$currPos) === 45) {
          s1 = peg$c62;
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c63); }
        }
        if (s1 !== peg$FAILED) {
          s2 = peg$parsespecifier();
          if (s2 !== peg$FAILED) {
            s1 = peg$c64(s2);
            s0 = s1;
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsespecifier() {
        var s0;

        if (input.substr(peg$currPos, 6) === peg$c65) {
          s0 = peg$c65;
          peg$currPos += 6;
        } else {
          s0 = peg$FAILED;
          { peg$fail(peg$c66); }
        }
        if (s0 === peg$FAILED) {
          if (input.substr(peg$currPos, 3) === peg$c67) {
            s0 = peg$c67;
            peg$currPos += 3;
          } else {
            s0 = peg$FAILED;
            { peg$fail(peg$c68); }
          }
          if (s0 === peg$FAILED) {
            if (input.substr(peg$currPos, 6) === peg$c69) {
              s0 = peg$c69;
              peg$currPos += 6;
            } else {
              s0 = peg$FAILED;
              { peg$fail(peg$c70); }
            }
            if (s0 === peg$FAILED) {
              if (input.substr(peg$currPos, 8) === peg$c71) {
                s0 = peg$c71;
                peg$currPos += 8;
              } else {
                s0 = peg$FAILED;
                { peg$fail(peg$c72); }
              }
              if (s0 === peg$FAILED) {
                if (input.substr(peg$currPos, 7) === peg$c73) {
                  s0 = peg$c73;
                  peg$currPos += 7;
                } else {
                  s0 = peg$FAILED;
                  { peg$fail(peg$c74); }
                }
                if (s0 === peg$FAILED) {
                  if (input.substr(peg$currPos, 6) === peg$c75) {
                    s0 = peg$c75;
                    peg$currPos += 6;
                  } else {
                    s0 = peg$FAILED;
                    { peg$fail(peg$c76); }
                  }
                  if (s0 === peg$FAILED) {
                    if (input.substr(peg$currPos, 5) === peg$c77) {
                      s0 = peg$c77;
                      peg$currPos += 5;
                    } else {
                      s0 = peg$FAILED;
                      { peg$fail(peg$c78); }
                    }
                    if (s0 === peg$FAILED) {
                      if (input.substr(peg$currPos, 6) === peg$c79) {
                        s0 = peg$c79;
                        peg$currPos += 6;
                      } else {
                        s0 = peg$FAILED;
                        { peg$fail(peg$c80); }
                      }
                      if (s0 === peg$FAILED) {
                        s0 = peg$parseunit();
                      }
                    }
                  }
                }
              }
            }
          }
        }

        return s0;
      }

      function peg$parseunit() {
        var s0, s1, s2;

        s0 = peg$currPos;
        if (input.substr(peg$currPos, 5) === peg$c81) {
          s1 = peg$c81;
          peg$currPos += 5;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c82); }
        }
        if (s1 !== peg$FAILED) {
          s2 = peg$parsenumber();
          if (s2 !== peg$FAILED) {
            s1 = peg$c83(s2);
            s0 = s1;
          } else {
            peg$currPos = s0;
            s0 = peg$FAILED;
          }
        } else {
          peg$currPos = s0;
          s0 = peg$FAILED;
        }

        return s0;
      }

      function peg$parsews() {
        var s0, s1;

        s0 = [];
        if (peg$c84.test(input.charAt(peg$currPos))) {
          s1 = input.charAt(peg$currPos);
          peg$currPos++;
        } else {
          s1 = peg$FAILED;
          { peg$fail(peg$c85); }
        }
        while (s1 !== peg$FAILED) {
          s0.push(s1);
          if (peg$c84.test(input.charAt(peg$currPos))) {
            s1 = input.charAt(peg$currPos);
            peg$currPos++;
          } else {
            s1 = peg$FAILED;
            { peg$fail(peg$c85); }
          }
        }

        return s0;
      }

      peg$result = peg$startRuleFunction();

      if (peg$result !== peg$FAILED && peg$currPos === input.length) {
        return peg$result;
      } else {
        if (peg$result !== peg$FAILED && peg$currPos < input.length) {
          peg$fail(peg$endExpectation());
        }

        throw peg$buildStructuredError(
          peg$maxFailExpected,
          peg$maxFailPos < input.length ? input.charAt(peg$maxFailPos) : null,
          peg$maxFailPos < input.length
            ? peg$computeLocation(peg$maxFailPos, peg$maxFailPos + 1)
            : peg$computeLocation(peg$maxFailPos, peg$maxFailPos)
        );
      }
    }

    var parser = {
      SyntaxError: peg$SyntaxError,
      parse:       peg$parse
    };

    function parse_pattern(str) {
        const segments = parser.parse(str);
        const patterns = [];
        for (let i = 0, len = segments.length; i < len; i++) {
            const s = segments[i];
            if (s.string != undefined) {
                patterns[i] = string(s.string);
            }
            else if (s.value != undefined) {
                patterns[i] = value(s.value, s.size, s.specifiers);
            }
            else if (s.name === '_') {
                patterns[i] = rest();
            }
            else if (s.name != undefined) {
                patterns[i] = variable(s.name, s.size, s.specifiers);
            }
            else {
                throw 'Unknown pattern ' + s;
            }
        }
        return patterns;
    }
    function parse(...args) {
        return parse_pattern(args.join(','));
    }

    function parse_int$1(bin, off, sizeInBytes, bigendian, signed) {
        switch (sizeInBytes) {
            case 1:
                return signed ? bin.readInt8(off) : bin.readUInt8(off);
            case 2:
                return bigendian
                    ? signed
                        ? bin.readInt16BE(off)
                        : bin.readUInt16BE(off)
                    : signed
                        ? bin.readInt16LE(off)
                        : bin.readUInt16LE(off);
            case 4:
                return bigendian
                    ? signed
                        ? bin.readInt32BE(off)
                        : bin.readUInt32BE(off)
                    : signed
                        ? bin.readInt32LE(off)
                        : bin.readUInt32LE(off);
            case 8:
                return bigendian
                    ? signed
                        ? bin.readBigInt64BE(off)
                        : bin.readBigUInt64BE(off)
                    : signed
                        ? bin.readBigInt64LE(off)
                        : bin.readBigUInt64LE(off);
            default:
                throw 'Integers must be 8-, 16-, 32- or 64-bit';
        }
    }
    function parse_float$1(bin, off, sizeInBytes, bigendian = true) {
        switch (sizeInBytes) {
            case 4:
                return bigendian ? bin.readFloatBE(off) : bin.readFloatLE(off);
            case 8:
                return bigendian ? bin.readDoubleBE(off) : bin.readDoubleLE(off);
            default:
                throw 'Floats must be 32- or 64-bit';
        }
    }

    var buffer = {};

    var base64Js = {};

    base64Js.byteLength = byteLength;
    base64Js.toByteArray = toByteArray;
    base64Js.fromByteArray = fromByteArray;

    var lookup = [];
    var revLookup = [];
    var Arr = typeof Uint8Array !== 'undefined' ? Uint8Array : Array;

    var code = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
    for (var i = 0, len = code.length; i < len; ++i) {
      lookup[i] = code[i];
      revLookup[code.charCodeAt(i)] = i;
    }

    // Support decoding URL-safe base64 strings, as Node.js does.
    // See: https://en.wikipedia.org/wiki/Base64#URL_applications
    revLookup['-'.charCodeAt(0)] = 62;
    revLookup['_'.charCodeAt(0)] = 63;

    function getLens (b64) {
      var len = b64.length;

      if (len % 4 > 0) {
        throw new Error('Invalid string. Length must be a multiple of 4')
      }

      // Trim off extra bytes after placeholder bytes are found
      // See: https://github.com/beatgammit/base64-js/issues/42
      var validLen = b64.indexOf('=');
      if (validLen === -1) validLen = len;

      var placeHoldersLen = validLen === len
        ? 0
        : 4 - (validLen % 4);

      return [validLen, placeHoldersLen]
    }

    // base64 is 4/3 + up to two characters of the original data
    function byteLength (b64) {
      var lens = getLens(b64);
      var validLen = lens[0];
      var placeHoldersLen = lens[1];
      return ((validLen + placeHoldersLen) * 3 / 4) - placeHoldersLen
    }

    function _byteLength (b64, validLen, placeHoldersLen) {
      return ((validLen + placeHoldersLen) * 3 / 4) - placeHoldersLen
    }

    function toByteArray (b64) {
      var tmp;
      var lens = getLens(b64);
      var validLen = lens[0];
      var placeHoldersLen = lens[1];

      var arr = new Arr(_byteLength(b64, validLen, placeHoldersLen));

      var curByte = 0;

      // if there are placeholders, only get up to the last complete 4 chars
      var len = placeHoldersLen > 0
        ? validLen - 4
        : validLen;

      var i;
      for (i = 0; i < len; i += 4) {
        tmp =
          (revLookup[b64.charCodeAt(i)] << 18) |
          (revLookup[b64.charCodeAt(i + 1)] << 12) |
          (revLookup[b64.charCodeAt(i + 2)] << 6) |
          revLookup[b64.charCodeAt(i + 3)];
        arr[curByte++] = (tmp >> 16) & 0xFF;
        arr[curByte++] = (tmp >> 8) & 0xFF;
        arr[curByte++] = tmp & 0xFF;
      }

      if (placeHoldersLen === 2) {
        tmp =
          (revLookup[b64.charCodeAt(i)] << 2) |
          (revLookup[b64.charCodeAt(i + 1)] >> 4);
        arr[curByte++] = tmp & 0xFF;
      }

      if (placeHoldersLen === 1) {
        tmp =
          (revLookup[b64.charCodeAt(i)] << 10) |
          (revLookup[b64.charCodeAt(i + 1)] << 4) |
          (revLookup[b64.charCodeAt(i + 2)] >> 2);
        arr[curByte++] = (tmp >> 8) & 0xFF;
        arr[curByte++] = tmp & 0xFF;
      }

      return arr
    }

    function tripletToBase64 (num) {
      return lookup[num >> 18 & 0x3F] +
        lookup[num >> 12 & 0x3F] +
        lookup[num >> 6 & 0x3F] +
        lookup[num & 0x3F]
    }

    function encodeChunk (uint8, start, end) {
      var tmp;
      var output = [];
      for (var i = start; i < end; i += 3) {
        tmp =
          ((uint8[i] << 16) & 0xFF0000) +
          ((uint8[i + 1] << 8) & 0xFF00) +
          (uint8[i + 2] & 0xFF);
        output.push(tripletToBase64(tmp));
      }
      return output.join('')
    }

    function fromByteArray (uint8) {
      var tmp;
      var len = uint8.length;
      var extraBytes = len % 3; // if we have 1 byte left, pad 2 bytes
      var parts = [];
      var maxChunkLength = 16383; // must be multiple of 3

      // go through the array every three bytes, we'll deal with trailing stuff later
      for (var i = 0, len2 = len - extraBytes; i < len2; i += maxChunkLength) {
        parts.push(encodeChunk(uint8, i, (i + maxChunkLength) > len2 ? len2 : (i + maxChunkLength)));
      }

      // pad the end with zeros, but make sure to not forget the extra bytes
      if (extraBytes === 1) {
        tmp = uint8[len - 1];
        parts.push(
          lookup[tmp >> 2] +
          lookup[(tmp << 4) & 0x3F] +
          '=='
        );
      } else if (extraBytes === 2) {
        tmp = (uint8[len - 2] << 8) + uint8[len - 1];
        parts.push(
          lookup[tmp >> 10] +
          lookup[(tmp >> 4) & 0x3F] +
          lookup[(tmp << 2) & 0x3F] +
          '='
        );
      }

      return parts.join('')
    }

    var ieee754 = {};

    /*! ieee754. BSD-3-Clause License. Feross Aboukhadijeh <https://feross.org/opensource> */

    ieee754.read = function (buffer, offset, isLE, mLen, nBytes) {
      var e, m;
      var eLen = (nBytes * 8) - mLen - 1;
      var eMax = (1 << eLen) - 1;
      var eBias = eMax >> 1;
      var nBits = -7;
      var i = isLE ? (nBytes - 1) : 0;
      var d = isLE ? -1 : 1;
      var s = buffer[offset + i];

      i += d;

      e = s & ((1 << (-nBits)) - 1);
      s >>= (-nBits);
      nBits += eLen;
      for (; nBits > 0; e = (e * 256) + buffer[offset + i], i += d, nBits -= 8) {}

      m = e & ((1 << (-nBits)) - 1);
      e >>= (-nBits);
      nBits += mLen;
      for (; nBits > 0; m = (m * 256) + buffer[offset + i], i += d, nBits -= 8) {}

      if (e === 0) {
        e = 1 - eBias;
      } else if (e === eMax) {
        return m ? NaN : ((s ? -1 : 1) * Infinity)
      } else {
        m = m + Math.pow(2, mLen);
        e = e - eBias;
      }
      return (s ? -1 : 1) * m * Math.pow(2, e - mLen)
    };

    ieee754.write = function (buffer, value, offset, isLE, mLen, nBytes) {
      var e, m, c;
      var eLen = (nBytes * 8) - mLen - 1;
      var eMax = (1 << eLen) - 1;
      var eBias = eMax >> 1;
      var rt = (mLen === 23 ? Math.pow(2, -24) - Math.pow(2, -77) : 0);
      var i = isLE ? 0 : (nBytes - 1);
      var d = isLE ? 1 : -1;
      var s = value < 0 || (value === 0 && 1 / value < 0) ? 1 : 0;

      value = Math.abs(value);

      if (isNaN(value) || value === Infinity) {
        m = isNaN(value) ? 1 : 0;
        e = eMax;
      } else {
        e = Math.floor(Math.log(value) / Math.LN2);
        if (value * (c = Math.pow(2, -e)) < 1) {
          e--;
          c *= 2;
        }
        if (e + eBias >= 1) {
          value += rt / c;
        } else {
          value += rt * Math.pow(2, 1 - eBias);
        }
        if (value * c >= 2) {
          e++;
          c /= 2;
        }

        if (e + eBias >= eMax) {
          m = 0;
          e = eMax;
        } else if (e + eBias >= 1) {
          m = ((value * c) - 1) * Math.pow(2, mLen);
          e = e + eBias;
        } else {
          m = value * Math.pow(2, eBias - 1) * Math.pow(2, mLen);
          e = 0;
        }
      }

      for (; mLen >= 8; buffer[offset + i] = m & 0xff, i += d, m /= 256, mLen -= 8) {}

      e = (e << mLen) | m;
      eLen += mLen;
      for (; eLen > 0; buffer[offset + i] = e & 0xff, i += d, e /= 256, eLen -= 8) {}

      buffer[offset + i - d] |= s * 128;
    };

    /*!
     * The buffer module from node.js, for the browser.
     *
     * @author   Feross Aboukhadijeh <https://feross.org>
     * @license  MIT
     */

    (function (exports) {

    const base64 = base64Js;
    const ieee754$1 = ieee754;
    const customInspectSymbol =
      (typeof Symbol === 'function' && typeof Symbol['for'] === 'function') // eslint-disable-line dot-notation
        ? Symbol['for']('nodejs.util.inspect.custom') // eslint-disable-line dot-notation
        : null;

    exports.Buffer = Buffer;
    exports.SlowBuffer = SlowBuffer;
    exports.INSPECT_MAX_BYTES = 50;

    const K_MAX_LENGTH = 0x7fffffff;
    exports.kMaxLength = K_MAX_LENGTH;

    /**
     * If `Buffer.TYPED_ARRAY_SUPPORT`:
     *   === true    Use Uint8Array implementation (fastest)
     *   === false   Print warning and recommend using `buffer` v4.x which has an Object
     *               implementation (most compatible, even IE6)
     *
     * Browsers that support typed arrays are IE 10+, Firefox 4+, Chrome 7+, Safari 5.1+,
     * Opera 11.6+, iOS 4.2+.
     *
     * We report that the browser does not support typed arrays if the are not subclassable
     * using __proto__. Firefox 4-29 lacks support for adding new properties to `Uint8Array`
     * (See: https://bugzilla.mozilla.org/show_bug.cgi?id=695438). IE 10 lacks support
     * for __proto__ and has a buggy typed array implementation.
     */
    Buffer.TYPED_ARRAY_SUPPORT = typedArraySupport();

    if (!Buffer.TYPED_ARRAY_SUPPORT && typeof console !== 'undefined' &&
        typeof console.error === 'function') {
      console.error(
        'This browser lacks typed array (Uint8Array) support which is required by ' +
        '`buffer` v5.x. Use `buffer` v4.x if you require old browser support.'
      );
    }

    function typedArraySupport () {
      // Can typed array instances can be augmented?
      try {
        const arr = new Uint8Array(1);
        const proto = { foo: function () { return 42 } };
        Object.setPrototypeOf(proto, Uint8Array.prototype);
        Object.setPrototypeOf(arr, proto);
        return arr.foo() === 42
      } catch (e) {
        return false
      }
    }

    Object.defineProperty(Buffer.prototype, 'parent', {
      enumerable: true,
      get: function () {
        if (!Buffer.isBuffer(this)) return undefined
        return this.buffer
      }
    });

    Object.defineProperty(Buffer.prototype, 'offset', {
      enumerable: true,
      get: function () {
        if (!Buffer.isBuffer(this)) return undefined
        return this.byteOffset
      }
    });

    function createBuffer (length) {
      if (length > K_MAX_LENGTH) {
        throw new RangeError('The value "' + length + '" is invalid for option "size"')
      }
      // Return an augmented `Uint8Array` instance
      const buf = new Uint8Array(length);
      Object.setPrototypeOf(buf, Buffer.prototype);
      return buf
    }

    /**
     * The Buffer constructor returns instances of `Uint8Array` that have their
     * prototype changed to `Buffer.prototype`. Furthermore, `Buffer` is a subclass of
     * `Uint8Array`, so the returned instances will have all the node `Buffer` methods
     * and the `Uint8Array` methods. Square bracket notation works as expected -- it
     * returns a single octet.
     *
     * The `Uint8Array` prototype remains unmodified.
     */

    function Buffer (arg, encodingOrOffset, length) {
      // Common case.
      if (typeof arg === 'number') {
        if (typeof encodingOrOffset === 'string') {
          throw new TypeError(
            'The "string" argument must be of type string. Received type number'
          )
        }
        return allocUnsafe(arg)
      }
      return from(arg, encodingOrOffset, length)
    }

    Buffer.poolSize = 8192; // not used by this implementation

    function from (value, encodingOrOffset, length) {
      if (typeof value === 'string') {
        return fromString(value, encodingOrOffset)
      }

      if (ArrayBuffer.isView(value)) {
        return fromArrayView(value)
      }

      if (value == null) {
        throw new TypeError(
          'The first argument must be one of type string, Buffer, ArrayBuffer, Array, ' +
          'or Array-like Object. Received type ' + (typeof value)
        )
      }

      if (isInstance(value, ArrayBuffer) ||
          (value && isInstance(value.buffer, ArrayBuffer))) {
        return fromArrayBuffer(value, encodingOrOffset, length)
      }

      if (typeof SharedArrayBuffer !== 'undefined' &&
          (isInstance(value, SharedArrayBuffer) ||
          (value && isInstance(value.buffer, SharedArrayBuffer)))) {
        return fromArrayBuffer(value, encodingOrOffset, length)
      }

      if (typeof value === 'number') {
        throw new TypeError(
          'The "value" argument must not be of type number. Received type number'
        )
      }

      const valueOf = value.valueOf && value.valueOf();
      if (valueOf != null && valueOf !== value) {
        return Buffer.from(valueOf, encodingOrOffset, length)
      }

      const b = fromObject(value);
      if (b) return b

      if (typeof Symbol !== 'undefined' && Symbol.toPrimitive != null &&
          typeof value[Symbol.toPrimitive] === 'function') {
        return Buffer.from(value[Symbol.toPrimitive]('string'), encodingOrOffset, length)
      }

      throw new TypeError(
        'The first argument must be one of type string, Buffer, ArrayBuffer, Array, ' +
        'or Array-like Object. Received type ' + (typeof value)
      )
    }

    /**
     * Functionally equivalent to Buffer(arg, encoding) but throws a TypeError
     * if value is a number.
     * Buffer.from(str[, encoding])
     * Buffer.from(array)
     * Buffer.from(buffer)
     * Buffer.from(arrayBuffer[, byteOffset[, length]])
     **/
    Buffer.from = function (value, encodingOrOffset, length) {
      return from(value, encodingOrOffset, length)
    };

    // Note: Change prototype *after* Buffer.from is defined to workaround Chrome bug:
    // https://github.com/feross/buffer/pull/148
    Object.setPrototypeOf(Buffer.prototype, Uint8Array.prototype);
    Object.setPrototypeOf(Buffer, Uint8Array);

    function assertSize (size) {
      if (typeof size !== 'number') {
        throw new TypeError('"size" argument must be of type number')
      } else if (size < 0) {
        throw new RangeError('The value "' + size + '" is invalid for option "size"')
      }
    }

    function alloc (size, fill, encoding) {
      assertSize(size);
      if (size <= 0) {
        return createBuffer(size)
      }
      if (fill !== undefined) {
        // Only pay attention to encoding if it's a string. This
        // prevents accidentally sending in a number that would
        // be interpreted as a start offset.
        return typeof encoding === 'string'
          ? createBuffer(size).fill(fill, encoding)
          : createBuffer(size).fill(fill)
      }
      return createBuffer(size)
    }

    /**
     * Creates a new filled Buffer instance.
     * alloc(size[, fill[, encoding]])
     **/
    Buffer.alloc = function (size, fill, encoding) {
      return alloc(size, fill, encoding)
    };

    function allocUnsafe (size) {
      assertSize(size);
      return createBuffer(size < 0 ? 0 : checked(size) | 0)
    }

    /**
     * Equivalent to Buffer(num), by default creates a non-zero-filled Buffer instance.
     * */
    Buffer.allocUnsafe = function (size) {
      return allocUnsafe(size)
    };
    /**
     * Equivalent to SlowBuffer(num), by default creates a non-zero-filled Buffer instance.
     */
    Buffer.allocUnsafeSlow = function (size) {
      return allocUnsafe(size)
    };

    function fromString (string, encoding) {
      if (typeof encoding !== 'string' || encoding === '') {
        encoding = 'utf8';
      }

      if (!Buffer.isEncoding(encoding)) {
        throw new TypeError('Unknown encoding: ' + encoding)
      }

      const length = byteLength(string, encoding) | 0;
      let buf = createBuffer(length);

      const actual = buf.write(string, encoding);

      if (actual !== length) {
        // Writing a hex string, for example, that contains invalid characters will
        // cause everything after the first invalid character to be ignored. (e.g.
        // 'abxxcd' will be treated as 'ab')
        buf = buf.slice(0, actual);
      }

      return buf
    }

    function fromArrayLike (array) {
      const length = array.length < 0 ? 0 : checked(array.length) | 0;
      const buf = createBuffer(length);
      for (let i = 0; i < length; i += 1) {
        buf[i] = array[i] & 255;
      }
      return buf
    }

    function fromArrayView (arrayView) {
      if (isInstance(arrayView, Uint8Array)) {
        const copy = new Uint8Array(arrayView);
        return fromArrayBuffer(copy.buffer, copy.byteOffset, copy.byteLength)
      }
      return fromArrayLike(arrayView)
    }

    function fromArrayBuffer (array, byteOffset, length) {
      if (byteOffset < 0 || array.byteLength < byteOffset) {
        throw new RangeError('"offset" is outside of buffer bounds')
      }

      if (array.byteLength < byteOffset + (length || 0)) {
        throw new RangeError('"length" is outside of buffer bounds')
      }

      let buf;
      if (byteOffset === undefined && length === undefined) {
        buf = new Uint8Array(array);
      } else if (length === undefined) {
        buf = new Uint8Array(array, byteOffset);
      } else {
        buf = new Uint8Array(array, byteOffset, length);
      }

      // Return an augmented `Uint8Array` instance
      Object.setPrototypeOf(buf, Buffer.prototype);

      return buf
    }

    function fromObject (obj) {
      if (Buffer.isBuffer(obj)) {
        const len = checked(obj.length) | 0;
        const buf = createBuffer(len);

        if (buf.length === 0) {
          return buf
        }

        obj.copy(buf, 0, 0, len);
        return buf
      }

      if (obj.length !== undefined) {
        if (typeof obj.length !== 'number' || numberIsNaN(obj.length)) {
          return createBuffer(0)
        }
        return fromArrayLike(obj)
      }

      if (obj.type === 'Buffer' && Array.isArray(obj.data)) {
        return fromArrayLike(obj.data)
      }
    }

    function checked (length) {
      // Note: cannot use `length < K_MAX_LENGTH` here because that fails when
      // length is NaN (which is otherwise coerced to zero.)
      if (length >= K_MAX_LENGTH) {
        throw new RangeError('Attempt to allocate Buffer larger than maximum ' +
                             'size: 0x' + K_MAX_LENGTH.toString(16) + ' bytes')
      }
      return length | 0
    }

    function SlowBuffer (length) {
      if (+length != length) { // eslint-disable-line eqeqeq
        length = 0;
      }
      return Buffer.alloc(+length)
    }

    Buffer.isBuffer = function isBuffer (b) {
      return b != null && b._isBuffer === true &&
        b !== Buffer.prototype // so Buffer.isBuffer(Buffer.prototype) will be false
    };

    Buffer.compare = function compare (a, b) {
      if (isInstance(a, Uint8Array)) a = Buffer.from(a, a.offset, a.byteLength);
      if (isInstance(b, Uint8Array)) b = Buffer.from(b, b.offset, b.byteLength);
      if (!Buffer.isBuffer(a) || !Buffer.isBuffer(b)) {
        throw new TypeError(
          'The "buf1", "buf2" arguments must be one of type Buffer or Uint8Array'
        )
      }

      if (a === b) return 0

      let x = a.length;
      let y = b.length;

      for (let i = 0, len = Math.min(x, y); i < len; ++i) {
        if (a[i] !== b[i]) {
          x = a[i];
          y = b[i];
          break
        }
      }

      if (x < y) return -1
      if (y < x) return 1
      return 0
    };

    Buffer.isEncoding = function isEncoding (encoding) {
      switch (String(encoding).toLowerCase()) {
        case 'hex':
        case 'utf8':
        case 'utf-8':
        case 'ascii':
        case 'latin1':
        case 'binary':
        case 'base64':
        case 'ucs2':
        case 'ucs-2':
        case 'utf16le':
        case 'utf-16le':
          return true
        default:
          return false
      }
    };

    Buffer.concat = function concat (list, length) {
      if (!Array.isArray(list)) {
        throw new TypeError('"list" argument must be an Array of Buffers')
      }

      if (list.length === 0) {
        return Buffer.alloc(0)
      }

      let i;
      if (length === undefined) {
        length = 0;
        for (i = 0; i < list.length; ++i) {
          length += list[i].length;
        }
      }

      const buffer = Buffer.allocUnsafe(length);
      let pos = 0;
      for (i = 0; i < list.length; ++i) {
        let buf = list[i];
        if (isInstance(buf, Uint8Array)) {
          if (pos + buf.length > buffer.length) {
            if (!Buffer.isBuffer(buf)) buf = Buffer.from(buf);
            buf.copy(buffer, pos);
          } else {
            Uint8Array.prototype.set.call(
              buffer,
              buf,
              pos
            );
          }
        } else if (!Buffer.isBuffer(buf)) {
          throw new TypeError('"list" argument must be an Array of Buffers')
        } else {
          buf.copy(buffer, pos);
        }
        pos += buf.length;
      }
      return buffer
    };

    function byteLength (string, encoding) {
      if (Buffer.isBuffer(string)) {
        return string.length
      }
      if (ArrayBuffer.isView(string) || isInstance(string, ArrayBuffer)) {
        return string.byteLength
      }
      if (typeof string !== 'string') {
        throw new TypeError(
          'The "string" argument must be one of type string, Buffer, or ArrayBuffer. ' +
          'Received type ' + typeof string
        )
      }

      const len = string.length;
      const mustMatch = (arguments.length > 2 && arguments[2] === true);
      if (!mustMatch && len === 0) return 0

      // Use a for loop to avoid recursion
      let loweredCase = false;
      for (;;) {
        switch (encoding) {
          case 'ascii':
          case 'latin1':
          case 'binary':
            return len
          case 'utf8':
          case 'utf-8':
            return utf8ToBytes(string).length
          case 'ucs2':
          case 'ucs-2':
          case 'utf16le':
          case 'utf-16le':
            return len * 2
          case 'hex':
            return len >>> 1
          case 'base64':
            return base64ToBytes(string).length
          default:
            if (loweredCase) {
              return mustMatch ? -1 : utf8ToBytes(string).length // assume utf8
            }
            encoding = ('' + encoding).toLowerCase();
            loweredCase = true;
        }
      }
    }
    Buffer.byteLength = byteLength;

    function slowToString (encoding, start, end) {
      let loweredCase = false;

      // No need to verify that "this.length <= MAX_UINT32" since it's a read-only
      // property of a typed array.

      // This behaves neither like String nor Uint8Array in that we set start/end
      // to their upper/lower bounds if the value passed is out of range.
      // undefined is handled specially as per ECMA-262 6th Edition,
      // Section 13.3.3.7 Runtime Semantics: KeyedBindingInitialization.
      if (start === undefined || start < 0) {
        start = 0;
      }
      // Return early if start > this.length. Done here to prevent potential uint32
      // coercion fail below.
      if (start > this.length) {
        return ''
      }

      if (end === undefined || end > this.length) {
        end = this.length;
      }

      if (end <= 0) {
        return ''
      }

      // Force coercion to uint32. This will also coerce falsey/NaN values to 0.
      end >>>= 0;
      start >>>= 0;

      if (end <= start) {
        return ''
      }

      if (!encoding) encoding = 'utf8';

      while (true) {
        switch (encoding) {
          case 'hex':
            return hexSlice(this, start, end)

          case 'utf8':
          case 'utf-8':
            return utf8Slice(this, start, end)

          case 'ascii':
            return asciiSlice(this, start, end)

          case 'latin1':
          case 'binary':
            return latin1Slice(this, start, end)

          case 'base64':
            return base64Slice(this, start, end)

          case 'ucs2':
          case 'ucs-2':
          case 'utf16le':
          case 'utf-16le':
            return utf16leSlice(this, start, end)

          default:
            if (loweredCase) throw new TypeError('Unknown encoding: ' + encoding)
            encoding = (encoding + '').toLowerCase();
            loweredCase = true;
        }
      }
    }

    // This property is used by `Buffer.isBuffer` (and the `is-buffer` npm package)
    // to detect a Buffer instance. It's not possible to use `instanceof Buffer`
    // reliably in a browserify context because there could be multiple different
    // copies of the 'buffer' package in use. This method works even for Buffer
    // instances that were created from another copy of the `buffer` package.
    // See: https://github.com/feross/buffer/issues/154
    Buffer.prototype._isBuffer = true;

    function swap (b, n, m) {
      const i = b[n];
      b[n] = b[m];
      b[m] = i;
    }

    Buffer.prototype.swap16 = function swap16 () {
      const len = this.length;
      if (len % 2 !== 0) {
        throw new RangeError('Buffer size must be a multiple of 16-bits')
      }
      for (let i = 0; i < len; i += 2) {
        swap(this, i, i + 1);
      }
      return this
    };

    Buffer.prototype.swap32 = function swap32 () {
      const len = this.length;
      if (len % 4 !== 0) {
        throw new RangeError('Buffer size must be a multiple of 32-bits')
      }
      for (let i = 0; i < len; i += 4) {
        swap(this, i, i + 3);
        swap(this, i + 1, i + 2);
      }
      return this
    };

    Buffer.prototype.swap64 = function swap64 () {
      const len = this.length;
      if (len % 8 !== 0) {
        throw new RangeError('Buffer size must be a multiple of 64-bits')
      }
      for (let i = 0; i < len; i += 8) {
        swap(this, i, i + 7);
        swap(this, i + 1, i + 6);
        swap(this, i + 2, i + 5);
        swap(this, i + 3, i + 4);
      }
      return this
    };

    Buffer.prototype.toString = function toString () {
      const length = this.length;
      if (length === 0) return ''
      if (arguments.length === 0) return utf8Slice(this, 0, length)
      return slowToString.apply(this, arguments)
    };

    Buffer.prototype.toLocaleString = Buffer.prototype.toString;

    Buffer.prototype.equals = function equals (b) {
      if (!Buffer.isBuffer(b)) throw new TypeError('Argument must be a Buffer')
      if (this === b) return true
      return Buffer.compare(this, b) === 0
    };

    Buffer.prototype.inspect = function inspect () {
      let str = '';
      const max = exports.INSPECT_MAX_BYTES;
      str = this.toString('hex', 0, max).replace(/(.{2})/g, '$1 ').trim();
      if (this.length > max) str += ' ... ';
      return '<Buffer ' + str + '>'
    };
    if (customInspectSymbol) {
      Buffer.prototype[customInspectSymbol] = Buffer.prototype.inspect;
    }

    Buffer.prototype.compare = function compare (target, start, end, thisStart, thisEnd) {
      if (isInstance(target, Uint8Array)) {
        target = Buffer.from(target, target.offset, target.byteLength);
      }
      if (!Buffer.isBuffer(target)) {
        throw new TypeError(
          'The "target" argument must be one of type Buffer or Uint8Array. ' +
          'Received type ' + (typeof target)
        )
      }

      if (start === undefined) {
        start = 0;
      }
      if (end === undefined) {
        end = target ? target.length : 0;
      }
      if (thisStart === undefined) {
        thisStart = 0;
      }
      if (thisEnd === undefined) {
        thisEnd = this.length;
      }

      if (start < 0 || end > target.length || thisStart < 0 || thisEnd > this.length) {
        throw new RangeError('out of range index')
      }

      if (thisStart >= thisEnd && start >= end) {
        return 0
      }
      if (thisStart >= thisEnd) {
        return -1
      }
      if (start >= end) {
        return 1
      }

      start >>>= 0;
      end >>>= 0;
      thisStart >>>= 0;
      thisEnd >>>= 0;

      if (this === target) return 0

      let x = thisEnd - thisStart;
      let y = end - start;
      const len = Math.min(x, y);

      const thisCopy = this.slice(thisStart, thisEnd);
      const targetCopy = target.slice(start, end);

      for (let i = 0; i < len; ++i) {
        if (thisCopy[i] !== targetCopy[i]) {
          x = thisCopy[i];
          y = targetCopy[i];
          break
        }
      }

      if (x < y) return -1
      if (y < x) return 1
      return 0
    };

    // Finds either the first index of `val` in `buffer` at offset >= `byteOffset`,
    // OR the last index of `val` in `buffer` at offset <= `byteOffset`.
    //
    // Arguments:
    // - buffer - a Buffer to search
    // - val - a string, Buffer, or number
    // - byteOffset - an index into `buffer`; will be clamped to an int32
    // - encoding - an optional encoding, relevant is val is a string
    // - dir - true for indexOf, false for lastIndexOf
    function bidirectionalIndexOf (buffer, val, byteOffset, encoding, dir) {
      // Empty buffer means no match
      if (buffer.length === 0) return -1

      // Normalize byteOffset
      if (typeof byteOffset === 'string') {
        encoding = byteOffset;
        byteOffset = 0;
      } else if (byteOffset > 0x7fffffff) {
        byteOffset = 0x7fffffff;
      } else if (byteOffset < -0x80000000) {
        byteOffset = -0x80000000;
      }
      byteOffset = +byteOffset; // Coerce to Number.
      if (numberIsNaN(byteOffset)) {
        // byteOffset: it it's undefined, null, NaN, "foo", etc, search whole buffer
        byteOffset = dir ? 0 : (buffer.length - 1);
      }

      // Normalize byteOffset: negative offsets start from the end of the buffer
      if (byteOffset < 0) byteOffset = buffer.length + byteOffset;
      if (byteOffset >= buffer.length) {
        if (dir) return -1
        else byteOffset = buffer.length - 1;
      } else if (byteOffset < 0) {
        if (dir) byteOffset = 0;
        else return -1
      }

      // Normalize val
      if (typeof val === 'string') {
        val = Buffer.from(val, encoding);
      }

      // Finally, search either indexOf (if dir is true) or lastIndexOf
      if (Buffer.isBuffer(val)) {
        // Special case: looking for empty string/buffer always fails
        if (val.length === 0) {
          return -1
        }
        return arrayIndexOf(buffer, val, byteOffset, encoding, dir)
      } else if (typeof val === 'number') {
        val = val & 0xFF; // Search for a byte value [0-255]
        if (typeof Uint8Array.prototype.indexOf === 'function') {
          if (dir) {
            return Uint8Array.prototype.indexOf.call(buffer, val, byteOffset)
          } else {
            return Uint8Array.prototype.lastIndexOf.call(buffer, val, byteOffset)
          }
        }
        return arrayIndexOf(buffer, [val], byteOffset, encoding, dir)
      }

      throw new TypeError('val must be string, number or Buffer')
    }

    function arrayIndexOf (arr, val, byteOffset, encoding, dir) {
      let indexSize = 1;
      let arrLength = arr.length;
      let valLength = val.length;

      if (encoding !== undefined) {
        encoding = String(encoding).toLowerCase();
        if (encoding === 'ucs2' || encoding === 'ucs-2' ||
            encoding === 'utf16le' || encoding === 'utf-16le') {
          if (arr.length < 2 || val.length < 2) {
            return -1
          }
          indexSize = 2;
          arrLength /= 2;
          valLength /= 2;
          byteOffset /= 2;
        }
      }

      function read (buf, i) {
        if (indexSize === 1) {
          return buf[i]
        } else {
          return buf.readUInt16BE(i * indexSize)
        }
      }

      let i;
      if (dir) {
        let foundIndex = -1;
        for (i = byteOffset; i < arrLength; i++) {
          if (read(arr, i) === read(val, foundIndex === -1 ? 0 : i - foundIndex)) {
            if (foundIndex === -1) foundIndex = i;
            if (i - foundIndex + 1 === valLength) return foundIndex * indexSize
          } else {
            if (foundIndex !== -1) i -= i - foundIndex;
            foundIndex = -1;
          }
        }
      } else {
        if (byteOffset + valLength > arrLength) byteOffset = arrLength - valLength;
        for (i = byteOffset; i >= 0; i--) {
          let found = true;
          for (let j = 0; j < valLength; j++) {
            if (read(arr, i + j) !== read(val, j)) {
              found = false;
              break
            }
          }
          if (found) return i
        }
      }

      return -1
    }

    Buffer.prototype.includes = function includes (val, byteOffset, encoding) {
      return this.indexOf(val, byteOffset, encoding) !== -1
    };

    Buffer.prototype.indexOf = function indexOf (val, byteOffset, encoding) {
      return bidirectionalIndexOf(this, val, byteOffset, encoding, true)
    };

    Buffer.prototype.lastIndexOf = function lastIndexOf (val, byteOffset, encoding) {
      return bidirectionalIndexOf(this, val, byteOffset, encoding, false)
    };

    function hexWrite (buf, string, offset, length) {
      offset = Number(offset) || 0;
      const remaining = buf.length - offset;
      if (!length) {
        length = remaining;
      } else {
        length = Number(length);
        if (length > remaining) {
          length = remaining;
        }
      }

      const strLen = string.length;

      if (length > strLen / 2) {
        length = strLen / 2;
      }
      let i;
      for (i = 0; i < length; ++i) {
        const parsed = parseInt(string.substr(i * 2, 2), 16);
        if (numberIsNaN(parsed)) return i
        buf[offset + i] = parsed;
      }
      return i
    }

    function utf8Write (buf, string, offset, length) {
      return blitBuffer(utf8ToBytes(string, buf.length - offset), buf, offset, length)
    }

    function asciiWrite (buf, string, offset, length) {
      return blitBuffer(asciiToBytes(string), buf, offset, length)
    }

    function base64Write (buf, string, offset, length) {
      return blitBuffer(base64ToBytes(string), buf, offset, length)
    }

    function ucs2Write (buf, string, offset, length) {
      return blitBuffer(utf16leToBytes(string, buf.length - offset), buf, offset, length)
    }

    Buffer.prototype.write = function write (string, offset, length, encoding) {
      // Buffer#write(string)
      if (offset === undefined) {
        encoding = 'utf8';
        length = this.length;
        offset = 0;
      // Buffer#write(string, encoding)
      } else if (length === undefined && typeof offset === 'string') {
        encoding = offset;
        length = this.length;
        offset = 0;
      // Buffer#write(string, offset[, length][, encoding])
      } else if (isFinite(offset)) {
        offset = offset >>> 0;
        if (isFinite(length)) {
          length = length >>> 0;
          if (encoding === undefined) encoding = 'utf8';
        } else {
          encoding = length;
          length = undefined;
        }
      } else {
        throw new Error(
          'Buffer.write(string, encoding, offset[, length]) is no longer supported'
        )
      }

      const remaining = this.length - offset;
      if (length === undefined || length > remaining) length = remaining;

      if ((string.length > 0 && (length < 0 || offset < 0)) || offset > this.length) {
        throw new RangeError('Attempt to write outside buffer bounds')
      }

      if (!encoding) encoding = 'utf8';

      let loweredCase = false;
      for (;;) {
        switch (encoding) {
          case 'hex':
            return hexWrite(this, string, offset, length)

          case 'utf8':
          case 'utf-8':
            return utf8Write(this, string, offset, length)

          case 'ascii':
          case 'latin1':
          case 'binary':
            return asciiWrite(this, string, offset, length)

          case 'base64':
            // Warning: maxLength not taken into account in base64Write
            return base64Write(this, string, offset, length)

          case 'ucs2':
          case 'ucs-2':
          case 'utf16le':
          case 'utf-16le':
            return ucs2Write(this, string, offset, length)

          default:
            if (loweredCase) throw new TypeError('Unknown encoding: ' + encoding)
            encoding = ('' + encoding).toLowerCase();
            loweredCase = true;
        }
      }
    };

    Buffer.prototype.toJSON = function toJSON () {
      return {
        type: 'Buffer',
        data: Array.prototype.slice.call(this._arr || this, 0)
      }
    };

    function base64Slice (buf, start, end) {
      if (start === 0 && end === buf.length) {
        return base64.fromByteArray(buf)
      } else {
        return base64.fromByteArray(buf.slice(start, end))
      }
    }

    function utf8Slice (buf, start, end) {
      end = Math.min(buf.length, end);
      const res = [];

      let i = start;
      while (i < end) {
        const firstByte = buf[i];
        let codePoint = null;
        let bytesPerSequence = (firstByte > 0xEF)
          ? 4
          : (firstByte > 0xDF)
              ? 3
              : (firstByte > 0xBF)
                  ? 2
                  : 1;

        if (i + bytesPerSequence <= end) {
          let secondByte, thirdByte, fourthByte, tempCodePoint;

          switch (bytesPerSequence) {
            case 1:
              if (firstByte < 0x80) {
                codePoint = firstByte;
              }
              break
            case 2:
              secondByte = buf[i + 1];
              if ((secondByte & 0xC0) === 0x80) {
                tempCodePoint = (firstByte & 0x1F) << 0x6 | (secondByte & 0x3F);
                if (tempCodePoint > 0x7F) {
                  codePoint = tempCodePoint;
                }
              }
              break
            case 3:
              secondByte = buf[i + 1];
              thirdByte = buf[i + 2];
              if ((secondByte & 0xC0) === 0x80 && (thirdByte & 0xC0) === 0x80) {
                tempCodePoint = (firstByte & 0xF) << 0xC | (secondByte & 0x3F) << 0x6 | (thirdByte & 0x3F);
                if (tempCodePoint > 0x7FF && (tempCodePoint < 0xD800 || tempCodePoint > 0xDFFF)) {
                  codePoint = tempCodePoint;
                }
              }
              break
            case 4:
              secondByte = buf[i + 1];
              thirdByte = buf[i + 2];
              fourthByte = buf[i + 3];
              if ((secondByte & 0xC0) === 0x80 && (thirdByte & 0xC0) === 0x80 && (fourthByte & 0xC0) === 0x80) {
                tempCodePoint = (firstByte & 0xF) << 0x12 | (secondByte & 0x3F) << 0xC | (thirdByte & 0x3F) << 0x6 | (fourthByte & 0x3F);
                if (tempCodePoint > 0xFFFF && tempCodePoint < 0x110000) {
                  codePoint = tempCodePoint;
                }
              }
          }
        }

        if (codePoint === null) {
          // we did not generate a valid codePoint so insert a
          // replacement char (U+FFFD) and advance only 1 byte
          codePoint = 0xFFFD;
          bytesPerSequence = 1;
        } else if (codePoint > 0xFFFF) {
          // encode to utf16 (surrogate pair dance)
          codePoint -= 0x10000;
          res.push(codePoint >>> 10 & 0x3FF | 0xD800);
          codePoint = 0xDC00 | codePoint & 0x3FF;
        }

        res.push(codePoint);
        i += bytesPerSequence;
      }

      return decodeCodePointsArray(res)
    }

    // Based on http://stackoverflow.com/a/22747272/680742, the browser with
    // the lowest limit is Chrome, with 0x10000 args.
    // We go 1 magnitude less, for safety
    const MAX_ARGUMENTS_LENGTH = 0x1000;

    function decodeCodePointsArray (codePoints) {
      const len = codePoints.length;
      if (len <= MAX_ARGUMENTS_LENGTH) {
        return String.fromCharCode.apply(String, codePoints) // avoid extra slice()
      }

      // Decode in chunks to avoid "call stack size exceeded".
      let res = '';
      let i = 0;
      while (i < len) {
        res += String.fromCharCode.apply(
          String,
          codePoints.slice(i, i += MAX_ARGUMENTS_LENGTH)
        );
      }
      return res
    }

    function asciiSlice (buf, start, end) {
      let ret = '';
      end = Math.min(buf.length, end);

      for (let i = start; i < end; ++i) {
        ret += String.fromCharCode(buf[i] & 0x7F);
      }
      return ret
    }

    function latin1Slice (buf, start, end) {
      let ret = '';
      end = Math.min(buf.length, end);

      for (let i = start; i < end; ++i) {
        ret += String.fromCharCode(buf[i]);
      }
      return ret
    }

    function hexSlice (buf, start, end) {
      const len = buf.length;

      if (!start || start < 0) start = 0;
      if (!end || end < 0 || end > len) end = len;

      let out = '';
      for (let i = start; i < end; ++i) {
        out += hexSliceLookupTable[buf[i]];
      }
      return out
    }

    function utf16leSlice (buf, start, end) {
      const bytes = buf.slice(start, end);
      let res = '';
      // If bytes.length is odd, the last 8 bits must be ignored (same as node.js)
      for (let i = 0; i < bytes.length - 1; i += 2) {
        res += String.fromCharCode(bytes[i] + (bytes[i + 1] * 256));
      }
      return res
    }

    Buffer.prototype.slice = function slice (start, end) {
      const len = this.length;
      start = ~~start;
      end = end === undefined ? len : ~~end;

      if (start < 0) {
        start += len;
        if (start < 0) start = 0;
      } else if (start > len) {
        start = len;
      }

      if (end < 0) {
        end += len;
        if (end < 0) end = 0;
      } else if (end > len) {
        end = len;
      }

      if (end < start) end = start;

      const newBuf = this.subarray(start, end);
      // Return an augmented `Uint8Array` instance
      Object.setPrototypeOf(newBuf, Buffer.prototype);

      return newBuf
    };

    /*
     * Need to make sure that buffer isn't trying to write out of bounds.
     */
    function checkOffset (offset, ext, length) {
      if ((offset % 1) !== 0 || offset < 0) throw new RangeError('offset is not uint')
      if (offset + ext > length) throw new RangeError('Trying to access beyond buffer length')
    }

    Buffer.prototype.readUintLE =
    Buffer.prototype.readUIntLE = function readUIntLE (offset, byteLength, noAssert) {
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) checkOffset(offset, byteLength, this.length);

      let val = this[offset];
      let mul = 1;
      let i = 0;
      while (++i < byteLength && (mul *= 0x100)) {
        val += this[offset + i] * mul;
      }

      return val
    };

    Buffer.prototype.readUintBE =
    Buffer.prototype.readUIntBE = function readUIntBE (offset, byteLength, noAssert) {
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) {
        checkOffset(offset, byteLength, this.length);
      }

      let val = this[offset + --byteLength];
      let mul = 1;
      while (byteLength > 0 && (mul *= 0x100)) {
        val += this[offset + --byteLength] * mul;
      }

      return val
    };

    Buffer.prototype.readUint8 =
    Buffer.prototype.readUInt8 = function readUInt8 (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 1, this.length);
      return this[offset]
    };

    Buffer.prototype.readUint16LE =
    Buffer.prototype.readUInt16LE = function readUInt16LE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 2, this.length);
      return this[offset] | (this[offset + 1] << 8)
    };

    Buffer.prototype.readUint16BE =
    Buffer.prototype.readUInt16BE = function readUInt16BE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 2, this.length);
      return (this[offset] << 8) | this[offset + 1]
    };

    Buffer.prototype.readUint32LE =
    Buffer.prototype.readUInt32LE = function readUInt32LE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);

      return ((this[offset]) |
          (this[offset + 1] << 8) |
          (this[offset + 2] << 16)) +
          (this[offset + 3] * 0x1000000)
    };

    Buffer.prototype.readUint32BE =
    Buffer.prototype.readUInt32BE = function readUInt32BE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);

      return (this[offset] * 0x1000000) +
        ((this[offset + 1] << 16) |
        (this[offset + 2] << 8) |
        this[offset + 3])
    };

    Buffer.prototype.readBigUInt64LE = defineBigIntMethod(function readBigUInt64LE (offset) {
      offset = offset >>> 0;
      validateNumber(offset, 'offset');
      const first = this[offset];
      const last = this[offset + 7];
      if (first === undefined || last === undefined) {
        boundsError(offset, this.length - 8);
      }

      const lo = first +
        this[++offset] * 2 ** 8 +
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 24;

      const hi = this[++offset] +
        this[++offset] * 2 ** 8 +
        this[++offset] * 2 ** 16 +
        last * 2 ** 24;

      return BigInt(lo) + (BigInt(hi) << BigInt(32))
    });

    Buffer.prototype.readBigUInt64BE = defineBigIntMethod(function readBigUInt64BE (offset) {
      offset = offset >>> 0;
      validateNumber(offset, 'offset');
      const first = this[offset];
      const last = this[offset + 7];
      if (first === undefined || last === undefined) {
        boundsError(offset, this.length - 8);
      }

      const hi = first * 2 ** 24 +
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 8 +
        this[++offset];

      const lo = this[++offset] * 2 ** 24 +
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 8 +
        last;

      return (BigInt(hi) << BigInt(32)) + BigInt(lo)
    });

    Buffer.prototype.readIntLE = function readIntLE (offset, byteLength, noAssert) {
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) checkOffset(offset, byteLength, this.length);

      let val = this[offset];
      let mul = 1;
      let i = 0;
      while (++i < byteLength && (mul *= 0x100)) {
        val += this[offset + i] * mul;
      }
      mul *= 0x80;

      if (val >= mul) val -= Math.pow(2, 8 * byteLength);

      return val
    };

    Buffer.prototype.readIntBE = function readIntBE (offset, byteLength, noAssert) {
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) checkOffset(offset, byteLength, this.length);

      let i = byteLength;
      let mul = 1;
      let val = this[offset + --i];
      while (i > 0 && (mul *= 0x100)) {
        val += this[offset + --i] * mul;
      }
      mul *= 0x80;

      if (val >= mul) val -= Math.pow(2, 8 * byteLength);

      return val
    };

    Buffer.prototype.readInt8 = function readInt8 (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 1, this.length);
      if (!(this[offset] & 0x80)) return (this[offset])
      return ((0xff - this[offset] + 1) * -1)
    };

    Buffer.prototype.readInt16LE = function readInt16LE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 2, this.length);
      const val = this[offset] | (this[offset + 1] << 8);
      return (val & 0x8000) ? val | 0xFFFF0000 : val
    };

    Buffer.prototype.readInt16BE = function readInt16BE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 2, this.length);
      const val = this[offset + 1] | (this[offset] << 8);
      return (val & 0x8000) ? val | 0xFFFF0000 : val
    };

    Buffer.prototype.readInt32LE = function readInt32LE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);

      return (this[offset]) |
        (this[offset + 1] << 8) |
        (this[offset + 2] << 16) |
        (this[offset + 3] << 24)
    };

    Buffer.prototype.readInt32BE = function readInt32BE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);

      return (this[offset] << 24) |
        (this[offset + 1] << 16) |
        (this[offset + 2] << 8) |
        (this[offset + 3])
    };

    Buffer.prototype.readBigInt64LE = defineBigIntMethod(function readBigInt64LE (offset) {
      offset = offset >>> 0;
      validateNumber(offset, 'offset');
      const first = this[offset];
      const last = this[offset + 7];
      if (first === undefined || last === undefined) {
        boundsError(offset, this.length - 8);
      }

      const val = this[offset + 4] +
        this[offset + 5] * 2 ** 8 +
        this[offset + 6] * 2 ** 16 +
        (last << 24); // Overflow

      return (BigInt(val) << BigInt(32)) +
        BigInt(first +
        this[++offset] * 2 ** 8 +
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 24)
    });

    Buffer.prototype.readBigInt64BE = defineBigIntMethod(function readBigInt64BE (offset) {
      offset = offset >>> 0;
      validateNumber(offset, 'offset');
      const first = this[offset];
      const last = this[offset + 7];
      if (first === undefined || last === undefined) {
        boundsError(offset, this.length - 8);
      }

      const val = (first << 24) + // Overflow
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 8 +
        this[++offset];

      return (BigInt(val) << BigInt(32)) +
        BigInt(this[++offset] * 2 ** 24 +
        this[++offset] * 2 ** 16 +
        this[++offset] * 2 ** 8 +
        last)
    });

    Buffer.prototype.readFloatLE = function readFloatLE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);
      return ieee754$1.read(this, offset, true, 23, 4)
    };

    Buffer.prototype.readFloatBE = function readFloatBE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 4, this.length);
      return ieee754$1.read(this, offset, false, 23, 4)
    };

    Buffer.prototype.readDoubleLE = function readDoubleLE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 8, this.length);
      return ieee754$1.read(this, offset, true, 52, 8)
    };

    Buffer.prototype.readDoubleBE = function readDoubleBE (offset, noAssert) {
      offset = offset >>> 0;
      if (!noAssert) checkOffset(offset, 8, this.length);
      return ieee754$1.read(this, offset, false, 52, 8)
    };

    function checkInt (buf, value, offset, ext, max, min) {
      if (!Buffer.isBuffer(buf)) throw new TypeError('"buffer" argument must be a Buffer instance')
      if (value > max || value < min) throw new RangeError('"value" argument is out of bounds')
      if (offset + ext > buf.length) throw new RangeError('Index out of range')
    }

    Buffer.prototype.writeUintLE =
    Buffer.prototype.writeUIntLE = function writeUIntLE (value, offset, byteLength, noAssert) {
      value = +value;
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) {
        const maxBytes = Math.pow(2, 8 * byteLength) - 1;
        checkInt(this, value, offset, byteLength, maxBytes, 0);
      }

      let mul = 1;
      let i = 0;
      this[offset] = value & 0xFF;
      while (++i < byteLength && (mul *= 0x100)) {
        this[offset + i] = (value / mul) & 0xFF;
      }

      return offset + byteLength
    };

    Buffer.prototype.writeUintBE =
    Buffer.prototype.writeUIntBE = function writeUIntBE (value, offset, byteLength, noAssert) {
      value = +value;
      offset = offset >>> 0;
      byteLength = byteLength >>> 0;
      if (!noAssert) {
        const maxBytes = Math.pow(2, 8 * byteLength) - 1;
        checkInt(this, value, offset, byteLength, maxBytes, 0);
      }

      let i = byteLength - 1;
      let mul = 1;
      this[offset + i] = value & 0xFF;
      while (--i >= 0 && (mul *= 0x100)) {
        this[offset + i] = (value / mul) & 0xFF;
      }

      return offset + byteLength
    };

    Buffer.prototype.writeUint8 =
    Buffer.prototype.writeUInt8 = function writeUInt8 (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 1, 0xff, 0);
      this[offset] = (value & 0xff);
      return offset + 1
    };

    Buffer.prototype.writeUint16LE =
    Buffer.prototype.writeUInt16LE = function writeUInt16LE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 2, 0xffff, 0);
      this[offset] = (value & 0xff);
      this[offset + 1] = (value >>> 8);
      return offset + 2
    };

    Buffer.prototype.writeUint16BE =
    Buffer.prototype.writeUInt16BE = function writeUInt16BE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 2, 0xffff, 0);
      this[offset] = (value >>> 8);
      this[offset + 1] = (value & 0xff);
      return offset + 2
    };

    Buffer.prototype.writeUint32LE =
    Buffer.prototype.writeUInt32LE = function writeUInt32LE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 4, 0xffffffff, 0);
      this[offset + 3] = (value >>> 24);
      this[offset + 2] = (value >>> 16);
      this[offset + 1] = (value >>> 8);
      this[offset] = (value & 0xff);
      return offset + 4
    };

    Buffer.prototype.writeUint32BE =
    Buffer.prototype.writeUInt32BE = function writeUInt32BE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 4, 0xffffffff, 0);
      this[offset] = (value >>> 24);
      this[offset + 1] = (value >>> 16);
      this[offset + 2] = (value >>> 8);
      this[offset + 3] = (value & 0xff);
      return offset + 4
    };

    function wrtBigUInt64LE (buf, value, offset, min, max) {
      checkIntBI(value, min, max, buf, offset, 7);

      let lo = Number(value & BigInt(0xffffffff));
      buf[offset++] = lo;
      lo = lo >> 8;
      buf[offset++] = lo;
      lo = lo >> 8;
      buf[offset++] = lo;
      lo = lo >> 8;
      buf[offset++] = lo;
      let hi = Number(value >> BigInt(32) & BigInt(0xffffffff));
      buf[offset++] = hi;
      hi = hi >> 8;
      buf[offset++] = hi;
      hi = hi >> 8;
      buf[offset++] = hi;
      hi = hi >> 8;
      buf[offset++] = hi;
      return offset
    }

    function wrtBigUInt64BE (buf, value, offset, min, max) {
      checkIntBI(value, min, max, buf, offset, 7);

      let lo = Number(value & BigInt(0xffffffff));
      buf[offset + 7] = lo;
      lo = lo >> 8;
      buf[offset + 6] = lo;
      lo = lo >> 8;
      buf[offset + 5] = lo;
      lo = lo >> 8;
      buf[offset + 4] = lo;
      let hi = Number(value >> BigInt(32) & BigInt(0xffffffff));
      buf[offset + 3] = hi;
      hi = hi >> 8;
      buf[offset + 2] = hi;
      hi = hi >> 8;
      buf[offset + 1] = hi;
      hi = hi >> 8;
      buf[offset] = hi;
      return offset + 8
    }

    Buffer.prototype.writeBigUInt64LE = defineBigIntMethod(function writeBigUInt64LE (value, offset = 0) {
      return wrtBigUInt64LE(this, value, offset, BigInt(0), BigInt('0xffffffffffffffff'))
    });

    Buffer.prototype.writeBigUInt64BE = defineBigIntMethod(function writeBigUInt64BE (value, offset = 0) {
      return wrtBigUInt64BE(this, value, offset, BigInt(0), BigInt('0xffffffffffffffff'))
    });

    Buffer.prototype.writeIntLE = function writeIntLE (value, offset, byteLength, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) {
        const limit = Math.pow(2, (8 * byteLength) - 1);

        checkInt(this, value, offset, byteLength, limit - 1, -limit);
      }

      let i = 0;
      let mul = 1;
      let sub = 0;
      this[offset] = value & 0xFF;
      while (++i < byteLength && (mul *= 0x100)) {
        if (value < 0 && sub === 0 && this[offset + i - 1] !== 0) {
          sub = 1;
        }
        this[offset + i] = ((value / mul) >> 0) - sub & 0xFF;
      }

      return offset + byteLength
    };

    Buffer.prototype.writeIntBE = function writeIntBE (value, offset, byteLength, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) {
        const limit = Math.pow(2, (8 * byteLength) - 1);

        checkInt(this, value, offset, byteLength, limit - 1, -limit);
      }

      let i = byteLength - 1;
      let mul = 1;
      let sub = 0;
      this[offset + i] = value & 0xFF;
      while (--i >= 0 && (mul *= 0x100)) {
        if (value < 0 && sub === 0 && this[offset + i + 1] !== 0) {
          sub = 1;
        }
        this[offset + i] = ((value / mul) >> 0) - sub & 0xFF;
      }

      return offset + byteLength
    };

    Buffer.prototype.writeInt8 = function writeInt8 (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 1, 0x7f, -0x80);
      if (value < 0) value = 0xff + value + 1;
      this[offset] = (value & 0xff);
      return offset + 1
    };

    Buffer.prototype.writeInt16LE = function writeInt16LE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 2, 0x7fff, -0x8000);
      this[offset] = (value & 0xff);
      this[offset + 1] = (value >>> 8);
      return offset + 2
    };

    Buffer.prototype.writeInt16BE = function writeInt16BE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 2, 0x7fff, -0x8000);
      this[offset] = (value >>> 8);
      this[offset + 1] = (value & 0xff);
      return offset + 2
    };

    Buffer.prototype.writeInt32LE = function writeInt32LE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 4, 0x7fffffff, -0x80000000);
      this[offset] = (value & 0xff);
      this[offset + 1] = (value >>> 8);
      this[offset + 2] = (value >>> 16);
      this[offset + 3] = (value >>> 24);
      return offset + 4
    };

    Buffer.prototype.writeInt32BE = function writeInt32BE (value, offset, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) checkInt(this, value, offset, 4, 0x7fffffff, -0x80000000);
      if (value < 0) value = 0xffffffff + value + 1;
      this[offset] = (value >>> 24);
      this[offset + 1] = (value >>> 16);
      this[offset + 2] = (value >>> 8);
      this[offset + 3] = (value & 0xff);
      return offset + 4
    };

    Buffer.prototype.writeBigInt64LE = defineBigIntMethod(function writeBigInt64LE (value, offset = 0) {
      return wrtBigUInt64LE(this, value, offset, -BigInt('0x8000000000000000'), BigInt('0x7fffffffffffffff'))
    });

    Buffer.prototype.writeBigInt64BE = defineBigIntMethod(function writeBigInt64BE (value, offset = 0) {
      return wrtBigUInt64BE(this, value, offset, -BigInt('0x8000000000000000'), BigInt('0x7fffffffffffffff'))
    });

    function checkIEEE754 (buf, value, offset, ext, max, min) {
      if (offset + ext > buf.length) throw new RangeError('Index out of range')
      if (offset < 0) throw new RangeError('Index out of range')
    }

    function writeFloat (buf, value, offset, littleEndian, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) {
        checkIEEE754(buf, value, offset, 4);
      }
      ieee754$1.write(buf, value, offset, littleEndian, 23, 4);
      return offset + 4
    }

    Buffer.prototype.writeFloatLE = function writeFloatLE (value, offset, noAssert) {
      return writeFloat(this, value, offset, true, noAssert)
    };

    Buffer.prototype.writeFloatBE = function writeFloatBE (value, offset, noAssert) {
      return writeFloat(this, value, offset, false, noAssert)
    };

    function writeDouble (buf, value, offset, littleEndian, noAssert) {
      value = +value;
      offset = offset >>> 0;
      if (!noAssert) {
        checkIEEE754(buf, value, offset, 8);
      }
      ieee754$1.write(buf, value, offset, littleEndian, 52, 8);
      return offset + 8
    }

    Buffer.prototype.writeDoubleLE = function writeDoubleLE (value, offset, noAssert) {
      return writeDouble(this, value, offset, true, noAssert)
    };

    Buffer.prototype.writeDoubleBE = function writeDoubleBE (value, offset, noAssert) {
      return writeDouble(this, value, offset, false, noAssert)
    };

    // copy(targetBuffer, targetStart=0, sourceStart=0, sourceEnd=buffer.length)
    Buffer.prototype.copy = function copy (target, targetStart, start, end) {
      if (!Buffer.isBuffer(target)) throw new TypeError('argument should be a Buffer')
      if (!start) start = 0;
      if (!end && end !== 0) end = this.length;
      if (targetStart >= target.length) targetStart = target.length;
      if (!targetStart) targetStart = 0;
      if (end > 0 && end < start) end = start;

      // Copy 0 bytes; we're done
      if (end === start) return 0
      if (target.length === 0 || this.length === 0) return 0

      // Fatal error conditions
      if (targetStart < 0) {
        throw new RangeError('targetStart out of bounds')
      }
      if (start < 0 || start >= this.length) throw new RangeError('Index out of range')
      if (end < 0) throw new RangeError('sourceEnd out of bounds')

      // Are we oob?
      if (end > this.length) end = this.length;
      if (target.length - targetStart < end - start) {
        end = target.length - targetStart + start;
      }

      const len = end - start;

      if (this === target && typeof Uint8Array.prototype.copyWithin === 'function') {
        // Use built-in when available, missing from IE11
        this.copyWithin(targetStart, start, end);
      } else {
        Uint8Array.prototype.set.call(
          target,
          this.subarray(start, end),
          targetStart
        );
      }

      return len
    };

    // Usage:
    //    buffer.fill(number[, offset[, end]])
    //    buffer.fill(buffer[, offset[, end]])
    //    buffer.fill(string[, offset[, end]][, encoding])
    Buffer.prototype.fill = function fill (val, start, end, encoding) {
      // Handle string cases:
      if (typeof val === 'string') {
        if (typeof start === 'string') {
          encoding = start;
          start = 0;
          end = this.length;
        } else if (typeof end === 'string') {
          encoding = end;
          end = this.length;
        }
        if (encoding !== undefined && typeof encoding !== 'string') {
          throw new TypeError('encoding must be a string')
        }
        if (typeof encoding === 'string' && !Buffer.isEncoding(encoding)) {
          throw new TypeError('Unknown encoding: ' + encoding)
        }
        if (val.length === 1) {
          const code = val.charCodeAt(0);
          if ((encoding === 'utf8' && code < 128) ||
              encoding === 'latin1') {
            // Fast path: If `val` fits into a single byte, use that numeric value.
            val = code;
          }
        }
      } else if (typeof val === 'number') {
        val = val & 255;
      } else if (typeof val === 'boolean') {
        val = Number(val);
      }

      // Invalid ranges are not set to a default, so can range check early.
      if (start < 0 || this.length < start || this.length < end) {
        throw new RangeError('Out of range index')
      }

      if (end <= start) {
        return this
      }

      start = start >>> 0;
      end = end === undefined ? this.length : end >>> 0;

      if (!val) val = 0;

      let i;
      if (typeof val === 'number') {
        for (i = start; i < end; ++i) {
          this[i] = val;
        }
      } else {
        const bytes = Buffer.isBuffer(val)
          ? val
          : Buffer.from(val, encoding);
        const len = bytes.length;
        if (len === 0) {
          throw new TypeError('The value "' + val +
            '" is invalid for argument "value"')
        }
        for (i = 0; i < end - start; ++i) {
          this[i + start] = bytes[i % len];
        }
      }

      return this
    };

    // CUSTOM ERRORS
    // =============

    // Simplified versions from Node, changed for Buffer-only usage
    const errors = {};
    function E (sym, getMessage, Base) {
      errors[sym] = class NodeError extends Base {
        constructor () {
          super();

          Object.defineProperty(this, 'message', {
            value: getMessage.apply(this, arguments),
            writable: true,
            configurable: true
          });

          // Add the error code to the name to include it in the stack trace.
          this.name = `${this.name} [${sym}]`;
          // Access the stack to generate the error message including the error code
          // from the name.
          this.stack; // eslint-disable-line no-unused-expressions
          // Reset the name to the actual name.
          delete this.name;
        }

        get code () {
          return sym
        }

        set code (value) {
          Object.defineProperty(this, 'code', {
            configurable: true,
            enumerable: true,
            value,
            writable: true
          });
        }

        toString () {
          return `${this.name} [${sym}]: ${this.message}`
        }
      };
    }

    E('ERR_BUFFER_OUT_OF_BOUNDS',
      function (name) {
        if (name) {
          return `${name} is outside of buffer bounds`
        }

        return 'Attempt to access memory outside buffer bounds'
      }, RangeError);
    E('ERR_INVALID_ARG_TYPE',
      function (name, actual) {
        return `The "${name}" argument must be of type number. Received type ${typeof actual}`
      }, TypeError);
    E('ERR_OUT_OF_RANGE',
      function (str, range, input) {
        let msg = `The value of "${str}" is out of range.`;
        let received = input;
        if (Number.isInteger(input) && Math.abs(input) > 2 ** 32) {
          received = addNumericalSeparator(String(input));
        } else if (typeof input === 'bigint') {
          received = String(input);
          if (input > BigInt(2) ** BigInt(32) || input < -(BigInt(2) ** BigInt(32))) {
            received = addNumericalSeparator(received);
          }
          received += 'n';
        }
        msg += ` It must be ${range}. Received ${received}`;
        return msg
      }, RangeError);

    function addNumericalSeparator (val) {
      let res = '';
      let i = val.length;
      const start = val[0] === '-' ? 1 : 0;
      for (; i >= start + 4; i -= 3) {
        res = `_${val.slice(i - 3, i)}${res}`;
      }
      return `${val.slice(0, i)}${res}`
    }

    // CHECK FUNCTIONS
    // ===============

    function checkBounds (buf, offset, byteLength) {
      validateNumber(offset, 'offset');
      if (buf[offset] === undefined || buf[offset + byteLength] === undefined) {
        boundsError(offset, buf.length - (byteLength + 1));
      }
    }

    function checkIntBI (value, min, max, buf, offset, byteLength) {
      if (value > max || value < min) {
        const n = typeof min === 'bigint' ? 'n' : '';
        let range;
        if (byteLength > 3) {
          if (min === 0 || min === BigInt(0)) {
            range = `>= 0${n} and < 2${n} ** ${(byteLength + 1) * 8}${n}`;
          } else {
            range = `>= -(2${n} ** ${(byteLength + 1) * 8 - 1}${n}) and < 2 ** ` +
                    `${(byteLength + 1) * 8 - 1}${n}`;
          }
        } else {
          range = `>= ${min}${n} and <= ${max}${n}`;
        }
        throw new errors.ERR_OUT_OF_RANGE('value', range, value)
      }
      checkBounds(buf, offset, byteLength);
    }

    function validateNumber (value, name) {
      if (typeof value !== 'number') {
        throw new errors.ERR_INVALID_ARG_TYPE(name, 'number', value)
      }
    }

    function boundsError (value, length, type) {
      if (Math.floor(value) !== value) {
        validateNumber(value, type);
        throw new errors.ERR_OUT_OF_RANGE(type || 'offset', 'an integer', value)
      }

      if (length < 0) {
        throw new errors.ERR_BUFFER_OUT_OF_BOUNDS()
      }

      throw new errors.ERR_OUT_OF_RANGE(type || 'offset',
                                        `>= ${type ? 1 : 0} and <= ${length}`,
                                        value)
    }

    // HELPER FUNCTIONS
    // ================

    const INVALID_BASE64_RE = /[^+/0-9A-Za-z-_]/g;

    function base64clean (str) {
      // Node takes equal signs as end of the Base64 encoding
      str = str.split('=')[0];
      // Node strips out invalid characters like \n and \t from the string, base64-js does not
      str = str.trim().replace(INVALID_BASE64_RE, '');
      // Node converts strings with length < 2 to ''
      if (str.length < 2) return ''
      // Node allows for non-padded base64 strings (missing trailing ===), base64-js does not
      while (str.length % 4 !== 0) {
        str = str + '=';
      }
      return str
    }

    function utf8ToBytes (string, units) {
      units = units || Infinity;
      let codePoint;
      const length = string.length;
      let leadSurrogate = null;
      const bytes = [];

      for (let i = 0; i < length; ++i) {
        codePoint = string.charCodeAt(i);

        // is surrogate component
        if (codePoint > 0xD7FF && codePoint < 0xE000) {
          // last char was a lead
          if (!leadSurrogate) {
            // no lead yet
            if (codePoint > 0xDBFF) {
              // unexpected trail
              if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
              continue
            } else if (i + 1 === length) {
              // unpaired lead
              if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
              continue
            }

            // valid lead
            leadSurrogate = codePoint;

            continue
          }

          // 2 leads in a row
          if (codePoint < 0xDC00) {
            if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
            leadSurrogate = codePoint;
            continue
          }

          // valid surrogate pair
          codePoint = (leadSurrogate - 0xD800 << 10 | codePoint - 0xDC00) + 0x10000;
        } else if (leadSurrogate) {
          // valid bmp char, but last char was a lead
          if ((units -= 3) > -1) bytes.push(0xEF, 0xBF, 0xBD);
        }

        leadSurrogate = null;

        // encode utf8
        if (codePoint < 0x80) {
          if ((units -= 1) < 0) break
          bytes.push(codePoint);
        } else if (codePoint < 0x800) {
          if ((units -= 2) < 0) break
          bytes.push(
            codePoint >> 0x6 | 0xC0,
            codePoint & 0x3F | 0x80
          );
        } else if (codePoint < 0x10000) {
          if ((units -= 3) < 0) break
          bytes.push(
            codePoint >> 0xC | 0xE0,
            codePoint >> 0x6 & 0x3F | 0x80,
            codePoint & 0x3F | 0x80
          );
        } else if (codePoint < 0x110000) {
          if ((units -= 4) < 0) break
          bytes.push(
            codePoint >> 0x12 | 0xF0,
            codePoint >> 0xC & 0x3F | 0x80,
            codePoint >> 0x6 & 0x3F | 0x80,
            codePoint & 0x3F | 0x80
          );
        } else {
          throw new Error('Invalid code point')
        }
      }

      return bytes
    }

    function asciiToBytes (str) {
      const byteArray = [];
      for (let i = 0; i < str.length; ++i) {
        // Node's code seems to be doing this and not & 0x7F..
        byteArray.push(str.charCodeAt(i) & 0xFF);
      }
      return byteArray
    }

    function utf16leToBytes (str, units) {
      let c, hi, lo;
      const byteArray = [];
      for (let i = 0; i < str.length; ++i) {
        if ((units -= 2) < 0) break

        c = str.charCodeAt(i);
        hi = c >> 8;
        lo = c % 256;
        byteArray.push(lo);
        byteArray.push(hi);
      }

      return byteArray
    }

    function base64ToBytes (str) {
      return base64.toByteArray(base64clean(str))
    }

    function blitBuffer (src, dst, offset, length) {
      let i;
      for (i = 0; i < length; ++i) {
        if ((i + offset >= dst.length) || (i >= src.length)) break
        dst[i + offset] = src[i];
      }
      return i
    }

    // ArrayBuffer or Uint8Array objects from other contexts (i.e. iframes) do not pass
    // the `instanceof` check but they should be treated as of that type.
    // See: https://github.com/feross/buffer/issues/166
    function isInstance (obj, type) {
      return obj instanceof type ||
        (obj != null && obj.constructor != null && obj.constructor.name != null &&
          obj.constructor.name === type.name)
    }
    function numberIsNaN (obj) {
      // For IE11 support
      return obj !== obj // eslint-disable-line no-self-compare
    }

    // Create lookup table for `toString('hex')`
    // See: https://github.com/feross/buffer/issues/219
    const hexSliceLookupTable = (function () {
      const alphabet = '0123456789abcdef';
      const table = new Array(256);
      for (let i = 0; i < 16; ++i) {
        const i16 = i * 16;
        for (let j = 0; j < 16; ++j) {
          table[i16 + j] = alphabet[i] + alphabet[j];
        }
      }
      return table
    })();

    // Return not function with Error if BigInt not supported
    function defineBigIntMethod (fn) {
      return typeof BigInt === 'undefined' ? BufferBigIntNotDefined : fn
    }

    function BufferBigIntNotDefined () {
      throw new Error('BigInt not supported')
    }
    }(buffer));

    function isObject$4(arg) {
        return typeof arg === 'object' && arg !== null;
    }
    function isNull(arg) {
        return arg === null;
    }
    function inspect(x) {
        try {
            return JSON.stringify(x);
        }
        catch (_) {
            return '[Circular]';
        }
    }
    const formatRegExp = /%[sdj%]/g;
    function format(f, ...args) {
        let i = 0;
        const len = args.length;
        let str = String(f).replace(formatRegExp, function (x) {
            if (x === '%%')
                return '%';
            if (i >= len)
                return x;
            switch (x) {
                case '%s':
                    return String(args[i++]);
                case '%d':
                    return Number(args[i++]).toString();
                case '%j':
                    try {
                        return JSON.stringify(args[i++]);
                    }
                    catch (_) {
                        return '[Circular]';
                    }
                default:
                    return x;
            }
        });
        for (let x = args[i]; i < len; x = args[++i]) {
            if (isNull(x) || !isObject$4(x)) {
                str += ' ' + x;
            }
            else {
                str += ' ' + inspect(x);
            }
        }
        return str;
    }

    var LANGUAGE_TABLE;
    (function (LANGUAGE_TABLE) {
        LANGUAGE_TABLE[LANGUAGE_TABLE["zh-CN"] = 0] = "zh-CN";
        LANGUAGE_TABLE[LANGUAGE_TABLE["zh-TW"] = 1] = "zh-TW";
        LANGUAGE_TABLE[LANGUAGE_TABLE["en-US"] = 2] = "en-US";
        LANGUAGE_TABLE[LANGUAGE_TABLE["es-ES"] = 3] = "es-ES";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ru-RU"] = 4] = "ru-RU";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ko-KR"] = 5] = "ko-KR";
        LANGUAGE_TABLE[LANGUAGE_TABLE["fr-FR"] = 6] = "fr-FR";
        LANGUAGE_TABLE[LANGUAGE_TABLE["de-DE"] = 7] = "de-DE";
        LANGUAGE_TABLE[LANGUAGE_TABLE["id-ID"] = 8] = "id-ID";
        LANGUAGE_TABLE[LANGUAGE_TABLE["pl-PL"] = 9] = "pl-PL";
        LANGUAGE_TABLE[LANGUAGE_TABLE["it-IT"] = 10] = "it-IT";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ja-JP"] = 11] = "ja-JP";
        LANGUAGE_TABLE[LANGUAGE_TABLE["th-TH"] = 12] = "th-TH";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ar-EG"] = 13] = "ar-EG";
        LANGUAGE_TABLE[LANGUAGE_TABLE["vi"] = 14] = "vi";
        LANGUAGE_TABLE[LANGUAGE_TABLE["pt"] = 15] = "pt";
        LANGUAGE_TABLE[LANGUAGE_TABLE["nl"] = 16] = "nl";
        LANGUAGE_TABLE[LANGUAGE_TABLE["tr-TR"] = 17] = "tr-TR";
        LANGUAGE_TABLE[LANGUAGE_TABLE["uk"] = 18] = "uk";
        LANGUAGE_TABLE[LANGUAGE_TABLE["he"] = 19] = "he";
        LANGUAGE_TABLE[LANGUAGE_TABLE["pt-BR"] = 20] = "pt-BR";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ro"] = 21] = "ro";
        LANGUAGE_TABLE[LANGUAGE_TABLE["cs"] = 22] = "cs";
        LANGUAGE_TABLE[LANGUAGE_TABLE["el"] = 23] = "el";
        LANGUAGE_TABLE[LANGUAGE_TABLE["sr"] = 24] = "sr";
        LANGUAGE_TABLE[LANGUAGE_TABLE["ca-ES"] = 25] = "ca-ES";
    })(LANGUAGE_TABLE || (LANGUAGE_TABLE = {}));

    class EventBus$1 {
        constructor() {
            this._events = new Map();
        }
        on(event, fn) {
            var _a;
            if (this._events.has(event)) {
                (_a = this._events.get(event)) === null || _a === void 0 ? void 0 : _a.push(fn);
            }
            else {
                this._events.set(event, [fn]);
            }
            return this;
        }
        once(event, fn) {
            const on = (...args) => {
                this.off(event, on);
                fn(...args);
            };
            this.on(event, on);
            return this;
        }
        off(event, fn) {
            if (event) {
                if (fn) {
                    const cbs = this._events.get(event);
                    if (!cbs)
                        return this;
                    const index = cbs.lastIndexOf((i) => i === fn);
                    if (index >= 0) {
                        cbs.splice(index, 1);
                    }
                }
                else {
                    this._events.delete(event);
                }
            }
            else {
                this._events.clear();
            }
            return this;
        }
        emit(event, ...args) {
            var _a;
            for (const fn of (_a = this._events.get(event.toLowerCase())) !== null && _a !== void 0 ? _a : []) {
                fn && fn(...args);
            }
            return this;
        }
        count(event) {
            var _a, _b;
            if (event) {
                return (_b = (_a = this._events.get(event)) === null || _a === void 0 ? void 0 : _a.length) !== null && _b !== void 0 ? _b : 0;
            }
            return this._events.size;
        }
    }

    function isHmAppDefined() {
        return typeof hmApp !== 'undefined';
    }

    const log1 = (level, ...args) => {
        console.log(args.join(' '));
    };
    const log2 = (level, ...args) => {
        var _a, _b;
        (_b = (_a = console)[level]) === null || _b === void 0 ? void 0 : _b.call(_a, args.join(' '));
    };
    const consoleLog = isHmAppDefined() ? log1 : log2;
    function now() {
        let now = new Date();
        const offset = now.getTimezoneOffset();
        now = new Date(now.getTime() - offset * 60 * 1000);
        return now.toISOString();
    }
    const levels = {
        all: Number.MIN_VALUE,
        log: 1,
        debug: 2,
        info: 3,
        warn: 4,
        error: 5,
        off: Number.MAX_VALUE,
    };
    class Logger {
        constructor(name, level, logOut) {
            this.prefix = '';
            this.appId = -1;
            this.tag = '-';
            this.levels = levels;
            this.eventBus = new EventBus$1();
            this.line = 1;
            this._loggerMap = {};
            this.name = name;
            this._level = level;
            this._log = logOut;
        }
        getLogger(name) {
            let logger = this._loggerMap[name];
            if (!logger) {
                logger = this._loggerMap[name] = new Logger(name, this._level, this._log);
                logger.prefix = this.prefix;
                logger.eventBus = this.eventBus;
            }
            return logger;
        }
        set level(level) {
            this._level = level;
            Object.values(this._loggerMap).forEach((l) => (l.level = level));
        }
        get level() {
            return this._level;
        }
        static getLogger(name, level = levels.all, logOut = consoleLog) {
            return new Logger(name, level, logOut);
        }
        stdout(level, ...args) {
            if (this.level > levels[level.toLowerCase()])
                return;
            const str = args.join(' ');
            this.eventBus.emit('log', {
                level,
                appId: this.appId,
                data: { prefix: this.prefix, name: this.name, tag: this.tag, log: str },
            });
            this._log(level, str);
        }
        // 固件日志传输日志
        connect(logger) {
            this.on('log', (data) => {
                logger.log(JSON.stringify(data));
            });
        }
        on(event, fn) {
            this.eventBus.on(event, fn);
        }
        off(event, fn) {
            this.eventBus.off(event, fn);
        }
        formatLog(level, f, ...args) {
            const strs = [
                // `${this.line++}`,
                `[${now()}]`,
                `[jsfwk.${level.padEnd(5, ' ')}]`,
                `[${this.name}]`,
                `[${this.tag}]`,
                format(f, ...args),
            ];
            if (this.prefix) {
                strs.unshift(`[${this.prefix}]`);
            }
            return strs.join(' ');
        }
        info(...args) {
            const [f, ...arg] = args;
            const level = 'info';
            this.stdout(level, this.formatLog(level, f, ...arg));
        }
        error(...args) {
            const [f, ...arg] = args;
            const level = 'error';
            this.stdout(level, this.formatLog(level, f, ...arg));
        }
        debug(...args) {
            const [f, ...arg] = args;
            const level = 'debug';
            this.stdout(level, this.formatLog(level, f, ...arg));
        }
        warn(...args) {
            const [f, ...arg] = args;
            const level = 'warn';
            this.stdout(level, this.formatLog(level, f, ...arg));
        }
        log(...args) {
            const [f, ...arg] = args;
            const level = 'log';
            this.stdout(level, this.formatLog(level, f, ...arg));
        }
    }
    Logger.levels = levels;

    /**
     * Checks if `value` is the
     * [language type](http://www.ecma-international.org/ecma-262/7.0/#sec-ecmascript-language-types)
     * of `Object`. (e.g. arrays, functions, objects, regexes, `new Number(0)`, and `new String('')`)
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an object, else `false`.
     * @example
     *
     * _.isObject({});
     * // => true
     *
     * _.isObject([1, 2, 3]);
     * // => true
     *
     * _.isObject(_.noop);
     * // => true
     *
     * _.isObject(null);
     * // => false
     */

    function isObject$3(value) {
      var type = typeof value;
      return value != null && (type == 'object' || type == 'function');
    }

    var isObject_1 = isObject$3;

    var isObject$2 = isObject_1;

    /** Built-in value references. */
    var objectCreate = Object.create;

    /**
     * The base implementation of `_.create` without support for assigning
     * properties to the created object.
     *
     * @private
     * @param {Object} proto The object to inherit from.
     * @returns {Object} Returns the new object.
     */
    var baseCreate$2 = (function() {
      function object() {}
      return function(proto) {
        if (!isObject$2(proto)) {
          return {};
        }
        if (objectCreate) {
          return objectCreate(proto);
        }
        object.prototype = proto;
        var result = new object;
        object.prototype = undefined;
        return result;
      };
    }());

    var _baseCreate = baseCreate$2;

    /**
     * The function whose prototype chain sequence wrappers inherit from.
     *
     * @private
     */

    function baseLodash$3() {
      // No operation performed.
    }

    var _baseLodash = baseLodash$3;

    var baseCreate$1 = _baseCreate,
        baseLodash$2 = _baseLodash;

    /**
     * The base constructor for creating `lodash` wrapper objects.
     *
     * @private
     * @param {*} value The value to wrap.
     * @param {boolean} [chainAll] Enable explicit method chain sequences.
     */
    function LodashWrapper$3(value, chainAll) {
      this.__wrapped__ = value;
      this.__actions__ = [];
      this.__chain__ = !!chainAll;
      this.__index__ = 0;
      this.__values__ = undefined;
    }

    LodashWrapper$3.prototype = baseCreate$1(baseLodash$2.prototype);
    LodashWrapper$3.prototype.constructor = LodashWrapper$3;

    var _LodashWrapper = LodashWrapper$3;

    /**
     * Appends the elements of `values` to `array`.
     *
     * @private
     * @param {Array} array The array to modify.
     * @param {Array} values The values to append.
     * @returns {Array} Returns `array`.
     */

    function arrayPush$1(array, values) {
      var index = -1,
          length = values.length,
          offset = array.length;

      while (++index < length) {
        array[offset + index] = values[index];
      }
      return array;
    }

    var _arrayPush = arrayPush$1;

    /** Detect free variable `global` from Node.js. */

    var freeGlobal$1 = typeof commonjsGlobal == 'object' && commonjsGlobal && commonjsGlobal.Object === Object && commonjsGlobal;

    var _freeGlobal = freeGlobal$1;

    var freeGlobal = _freeGlobal;

    /** Detect free variable `self`. */
    var freeSelf = typeof self == 'object' && self && self.Object === Object && self;

    /** Used as a reference to the global object. */
    var root$3 = freeGlobal || freeSelf || Function('return this')();

    var _root = root$3;

    var root$2 = _root;

    /** Built-in value references. */
    var Symbol$4 = root$2.Symbol;

    var _Symbol = Symbol$4;

    var Symbol$3 = _Symbol;

    /** Used for built-in method references. */
    var objectProto$5 = Object.prototype;

    /** Used to check objects for own properties. */
    var hasOwnProperty$4 = objectProto$5.hasOwnProperty;

    /**
     * Used to resolve the
     * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
     * of values.
     */
    var nativeObjectToString$1 = objectProto$5.toString;

    /** Built-in value references. */
    var symToStringTag$1 = Symbol$3 ? Symbol$3.toStringTag : undefined;

    /**
     * A specialized version of `baseGetTag` which ignores `Symbol.toStringTag` values.
     *
     * @private
     * @param {*} value The value to query.
     * @returns {string} Returns the raw `toStringTag`.
     */
    function getRawTag$1(value) {
      var isOwn = hasOwnProperty$4.call(value, symToStringTag$1),
          tag = value[symToStringTag$1];

      try {
        value[symToStringTag$1] = undefined;
        var unmasked = true;
      } catch (e) {}

      var result = nativeObjectToString$1.call(value);
      if (unmasked) {
        if (isOwn) {
          value[symToStringTag$1] = tag;
        } else {
          delete value[symToStringTag$1];
        }
      }
      return result;
    }

    var _getRawTag = getRawTag$1;

    /** Used for built-in method references. */

    var objectProto$4 = Object.prototype;

    /**
     * Used to resolve the
     * [`toStringTag`](http://ecma-international.org/ecma-262/7.0/#sec-object.prototype.tostring)
     * of values.
     */
    var nativeObjectToString = objectProto$4.toString;

    /**
     * Converts `value` to a string using `Object.prototype.toString`.
     *
     * @private
     * @param {*} value The value to convert.
     * @returns {string} Returns the converted string.
     */
    function objectToString$1(value) {
      return nativeObjectToString.call(value);
    }

    var _objectToString = objectToString$1;

    var Symbol$2 = _Symbol,
        getRawTag = _getRawTag,
        objectToString = _objectToString;

    /** `Object#toString` result references. */
    var nullTag = '[object Null]',
        undefinedTag = '[object Undefined]';

    /** Built-in value references. */
    var symToStringTag = Symbol$2 ? Symbol$2.toStringTag : undefined;

    /**
     * The base implementation of `getTag` without fallbacks for buggy environments.
     *
     * @private
     * @param {*} value The value to query.
     * @returns {string} Returns the `toStringTag`.
     */
    function baseGetTag$2(value) {
      if (value == null) {
        return value === undefined ? undefinedTag : nullTag;
      }
      return (symToStringTag && symToStringTag in Object(value))
        ? getRawTag(value)
        : objectToString(value);
    }

    var _baseGetTag = baseGetTag$2;

    /**
     * Checks if `value` is object-like. A value is object-like if it's not `null`
     * and has a `typeof` result of "object".
     *
     * @static
     * @memberOf _
     * @since 4.0.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is object-like, else `false`.
     * @example
     *
     * _.isObjectLike({});
     * // => true
     *
     * _.isObjectLike([1, 2, 3]);
     * // => true
     *
     * _.isObjectLike(_.noop);
     * // => false
     *
     * _.isObjectLike(null);
     * // => false
     */

    function isObjectLike$3(value) {
      return value != null && typeof value == 'object';
    }

    var isObjectLike_1 = isObjectLike$3;

    var baseGetTag$1 = _baseGetTag,
        isObjectLike$2 = isObjectLike_1;

    /** `Object#toString` result references. */
    var argsTag = '[object Arguments]';

    /**
     * The base implementation of `_.isArguments`.
     *
     * @private
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an `arguments` object,
     */
    function baseIsArguments$1(value) {
      return isObjectLike$2(value) && baseGetTag$1(value) == argsTag;
    }

    var _baseIsArguments = baseIsArguments$1;

    var baseIsArguments = _baseIsArguments,
        isObjectLike$1 = isObjectLike_1;

    /** Used for built-in method references. */
    var objectProto$3 = Object.prototype;

    /** Used to check objects for own properties. */
    var hasOwnProperty$3 = objectProto$3.hasOwnProperty;

    /** Built-in value references. */
    var propertyIsEnumerable = objectProto$3.propertyIsEnumerable;

    /**
     * Checks if `value` is likely an `arguments` object.
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an `arguments` object,
     *  else `false`.
     * @example
     *
     * _.isArguments(function() { return arguments; }());
     * // => true
     *
     * _.isArguments([1, 2, 3]);
     * // => false
     */
    var isArguments$1 = baseIsArguments(function() { return arguments; }()) ? baseIsArguments : function(value) {
      return isObjectLike$1(value) && hasOwnProperty$3.call(value, 'callee') &&
        !propertyIsEnumerable.call(value, 'callee');
    };

    var isArguments_1 = isArguments$1;

    /**
     * Checks if `value` is classified as an `Array` object.
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is an array, else `false`.
     * @example
     *
     * _.isArray([1, 2, 3]);
     * // => true
     *
     * _.isArray(document.body.children);
     * // => false
     *
     * _.isArray('abc');
     * // => false
     *
     * _.isArray(_.noop);
     * // => false
     */

    var isArray$3 = Array.isArray;

    var isArray_1 = isArray$3;

    var Symbol$1 = _Symbol,
        isArguments = isArguments_1,
        isArray$2 = isArray_1;

    /** Built-in value references. */
    var spreadableSymbol = Symbol$1 ? Symbol$1.isConcatSpreadable : undefined;

    /**
     * Checks if `value` is a flattenable `arguments` object or array.
     *
     * @private
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is flattenable, else `false`.
     */
    function isFlattenable$1(value) {
      return isArray$2(value) || isArguments(value) ||
        !!(spreadableSymbol && value && value[spreadableSymbol]);
    }

    var _isFlattenable = isFlattenable$1;

    var arrayPush = _arrayPush,
        isFlattenable = _isFlattenable;

    /**
     * The base implementation of `_.flatten` with support for restricting flattening.
     *
     * @private
     * @param {Array} array The array to flatten.
     * @param {number} depth The maximum recursion depth.
     * @param {boolean} [predicate=isFlattenable] The function invoked per iteration.
     * @param {boolean} [isStrict] Restrict to values that pass `predicate` checks.
     * @param {Array} [result=[]] The initial result value.
     * @returns {Array} Returns the new flattened array.
     */
    function baseFlatten$1(array, depth, predicate, isStrict, result) {
      var index = -1,
          length = array.length;

      predicate || (predicate = isFlattenable);
      result || (result = []);

      while (++index < length) {
        var value = array[index];
        if (depth > 0 && predicate(value)) {
          if (depth > 1) {
            // Recursively flatten arrays (susceptible to call stack limits).
            baseFlatten$1(value, depth - 1, predicate, isStrict, result);
          } else {
            arrayPush(result, value);
          }
        } else if (!isStrict) {
          result[result.length] = value;
        }
      }
      return result;
    }

    var _baseFlatten = baseFlatten$1;

    var baseFlatten = _baseFlatten;

    /**
     * Flattens `array` a single level deep.
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Array
     * @param {Array} array The array to flatten.
     * @returns {Array} Returns the new flattened array.
     * @example
     *
     * _.flatten([1, [2, [3, [4]], 5]]);
     * // => [1, 2, [3, [4]], 5]
     */
    function flatten$1(array) {
      var length = array == null ? 0 : array.length;
      return length ? baseFlatten(array, 1) : [];
    }

    var flatten_1 = flatten$1;

    /**
     * A faster alternative to `Function#apply`, this function invokes `func`
     * with the `this` binding of `thisArg` and the arguments of `args`.
     *
     * @private
     * @param {Function} func The function to invoke.
     * @param {*} thisArg The `this` binding of `func`.
     * @param {Array} args The arguments to invoke `func` with.
     * @returns {*} Returns the result of `func`.
     */

    function apply$1(func, thisArg, args) {
      switch (args.length) {
        case 0: return func.call(thisArg);
        case 1: return func.call(thisArg, args[0]);
        case 2: return func.call(thisArg, args[0], args[1]);
        case 3: return func.call(thisArg, args[0], args[1], args[2]);
      }
      return func.apply(thisArg, args);
    }

    var _apply = apply$1;

    var apply = _apply;

    /* Built-in method references for those with the same name as other `lodash` methods. */
    var nativeMax = Math.max;

    /**
     * A specialized version of `baseRest` which transforms the rest array.
     *
     * @private
     * @param {Function} func The function to apply a rest parameter to.
     * @param {number} [start=func.length-1] The start position of the rest parameter.
     * @param {Function} transform The rest array transform.
     * @returns {Function} Returns the new function.
     */
    function overRest$1(func, start, transform) {
      start = nativeMax(start === undefined ? (func.length - 1) : start, 0);
      return function() {
        var args = arguments,
            index = -1,
            length = nativeMax(args.length - start, 0),
            array = Array(length);

        while (++index < length) {
          array[index] = args[start + index];
        }
        index = -1;
        var otherArgs = Array(start + 1);
        while (++index < start) {
          otherArgs[index] = args[index];
        }
        otherArgs[start] = transform(array);
        return apply(func, this, otherArgs);
      };
    }

    var _overRest = overRest$1;

    /**
     * Creates a function that returns `value`.
     *
     * @static
     * @memberOf _
     * @since 2.4.0
     * @category Util
     * @param {*} value The value to return from the new function.
     * @returns {Function} Returns the new constant function.
     * @example
     *
     * var objects = _.times(2, _.constant({ 'a': 1 }));
     *
     * console.log(objects);
     * // => [{ 'a': 1 }, { 'a': 1 }]
     *
     * console.log(objects[0] === objects[1]);
     * // => true
     */

    function constant$1(value) {
      return function() {
        return value;
      };
    }

    var constant_1 = constant$1;

    var baseGetTag = _baseGetTag,
        isObject$1 = isObject_1;

    /** `Object#toString` result references. */
    var asyncTag = '[object AsyncFunction]',
        funcTag = '[object Function]',
        genTag = '[object GeneratorFunction]',
        proxyTag = '[object Proxy]';

    /**
     * Checks if `value` is classified as a `Function` object.
     *
     * @static
     * @memberOf _
     * @since 0.1.0
     * @category Lang
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is a function, else `false`.
     * @example
     *
     * _.isFunction(_);
     * // => true
     *
     * _.isFunction(/abc/);
     * // => false
     */
    function isFunction$1(value) {
      if (!isObject$1(value)) {
        return false;
      }
      // The use of `Object#toString` avoids issues with the `typeof` operator
      // in Safari 9 which returns 'object' for typed arrays and other constructors.
      var tag = baseGetTag(value);
      return tag == funcTag || tag == genTag || tag == asyncTag || tag == proxyTag;
    }

    var isFunction_1 = isFunction$1;

    var root$1 = _root;

    /** Used to detect overreaching core-js shims. */
    var coreJsData$1 = root$1['__core-js_shared__'];

    var _coreJsData = coreJsData$1;

    var coreJsData = _coreJsData;

    /** Used to detect methods masquerading as native. */
    var maskSrcKey = (function() {
      var uid = /[^.]+$/.exec(coreJsData && coreJsData.keys && coreJsData.keys.IE_PROTO || '');
      return uid ? ('Symbol(src)_1.' + uid) : '';
    }());

    /**
     * Checks if `func` has its source masked.
     *
     * @private
     * @param {Function} func The function to check.
     * @returns {boolean} Returns `true` if `func` is masked, else `false`.
     */
    function isMasked$1(func) {
      return !!maskSrcKey && (maskSrcKey in func);
    }

    var _isMasked = isMasked$1;

    /** Used for built-in method references. */

    var funcProto$1 = Function.prototype;

    /** Used to resolve the decompiled source of functions. */
    var funcToString$1 = funcProto$1.toString;

    /**
     * Converts `func` to its source code.
     *
     * @private
     * @param {Function} func The function to convert.
     * @returns {string} Returns the source code.
     */
    function toSource$1(func) {
      if (func != null) {
        try {
          return funcToString$1.call(func);
        } catch (e) {}
        try {
          return (func + '');
        } catch (e) {}
      }
      return '';
    }

    var _toSource = toSource$1;

    var isFunction = isFunction_1,
        isMasked = _isMasked,
        isObject = isObject_1,
        toSource = _toSource;

    /**
     * Used to match `RegExp`
     * [syntax characters](http://ecma-international.org/ecma-262/7.0/#sec-patterns).
     */
    var reRegExpChar = /[\\^$.*+?()[\]{}|]/g;

    /** Used to detect host constructors (Safari). */
    var reIsHostCtor = /^\[object .+?Constructor\]$/;

    /** Used for built-in method references. */
    var funcProto = Function.prototype,
        objectProto$2 = Object.prototype;

    /** Used to resolve the decompiled source of functions. */
    var funcToString = funcProto.toString;

    /** Used to check objects for own properties. */
    var hasOwnProperty$2 = objectProto$2.hasOwnProperty;

    /** Used to detect if a method is native. */
    var reIsNative = RegExp('^' +
      funcToString.call(hasOwnProperty$2).replace(reRegExpChar, '\\$&')
      .replace(/hasOwnProperty|(function).*?(?=\\\()| for .+?(?=\\\])/g, '$1.*?') + '$'
    );

    /**
     * The base implementation of `_.isNative` without bad shim checks.
     *
     * @private
     * @param {*} value The value to check.
     * @returns {boolean} Returns `true` if `value` is a native function,
     *  else `false`.
     */
    function baseIsNative$1(value) {
      if (!isObject(value) || isMasked(value)) {
        return false;
      }
      var pattern = isFunction(value) ? reIsNative : reIsHostCtor;
      return pattern.test(toSource(value));
    }

    var _baseIsNative = baseIsNative$1;

    /**
     * Gets the value at `key` of `object`.
     *
     * @private
     * @param {Object} [object] The object to query.
     * @param {string} key The key of the property to get.
     * @returns {*} Returns the property value.
     */

    function getValue$1(object, key) {
      return object == null ? undefined : object[key];
    }

    var _getValue = getValue$1;

    var baseIsNative = _baseIsNative,
        getValue = _getValue;

    /**
     * Gets the native function at `key` of `object`.
     *
     * @private
     * @param {Object} object The object to query.
     * @param {string} key The key of the method to get.
     * @returns {*} Returns the function if it's native, else `undefined`.
     */
    function getNative$2(object, key) {
      var value = getValue(object, key);
      return baseIsNative(value) ? value : undefined;
    }

    var _getNative = getNative$2;

    var getNative$1 = _getNative;

    var defineProperty$1 = (function() {
      try {
        var func = getNative$1(Object, 'defineProperty');
        func({}, '', {});
        return func;
      } catch (e) {}
    }());

    var _defineProperty = defineProperty$1;

    /**
     * This method returns the first argument it receives.
     *
     * @static
     * @since 0.1.0
     * @memberOf _
     * @category Util
     * @param {*} value Any value.
     * @returns {*} Returns `value`.
     * @example
     *
     * var object = { 'a': 1 };
     *
     * console.log(_.identity(object) === object);
     * // => true
     */

    function identity$1(value) {
      return value;
    }

    var identity_1 = identity$1;

    var constant = constant_1,
        defineProperty = _defineProperty,
        identity = identity_1;

    /**
     * The base implementation of `setToString` without support for hot loop shorting.
     *
     * @private
     * @param {Function} func The function to modify.
     * @param {Function} string The `toString` result.
     * @returns {Function} Returns `func`.
     */
    var baseSetToString$1 = !defineProperty ? identity : function(func, string) {
      return defineProperty(func, 'toString', {
        'configurable': true,
        'enumerable': false,
        'value': constant(string),
        'writable': true
      });
    };

    var _baseSetToString = baseSetToString$1;

    /** Used to detect hot functions by number of calls within a span of milliseconds. */

    var HOT_COUNT = 800,
        HOT_SPAN = 16;

    /* Built-in method references for those with the same name as other `lodash` methods. */
    var nativeNow = Date.now;

    /**
     * Creates a function that'll short out and invoke `identity` instead
     * of `func` when it's called `HOT_COUNT` or more times in `HOT_SPAN`
     * milliseconds.
     *
     * @private
     * @param {Function} func The function to restrict.
     * @returns {Function} Returns the new shortable function.
     */
    function shortOut$1(func) {
      var count = 0,
          lastCalled = 0;

      return function() {
        var stamp = nativeNow(),
            remaining = HOT_SPAN - (stamp - lastCalled);

        lastCalled = stamp;
        if (remaining > 0) {
          if (++count >= HOT_COUNT) {
            return arguments[0];
          }
        } else {
          count = 0;
        }
        return func.apply(undefined, arguments);
      };
    }

    var _shortOut = shortOut$1;

    var baseSetToString = _baseSetToString,
        shortOut = _shortOut;

    /**
     * Sets the `toString` method of `func` to return `string`.
     *
     * @private
     * @param {Function} func The function to modify.
     * @param {Function} string The `toString` result.
     * @returns {Function} Returns `func`.
     */
    var setToString$1 = shortOut(baseSetToString);

    var _setToString = setToString$1;

    var flatten = flatten_1,
        overRest = _overRest,
        setToString = _setToString;

    /**
     * A specialized version of `baseRest` which flattens the rest array.
     *
     * @private
     * @param {Function} func The function to apply a rest parameter to.
     * @returns {Function} Returns the new function.
     */
    function flatRest$1(func) {
      return setToString(overRest(func, undefined, flatten), func + '');
    }

    var _flatRest = flatRest$1;

    var getNative = _getNative,
        root = _root;

    /* Built-in method references that are verified to be native. */
    var WeakMap$1 = getNative(root, 'WeakMap');

    var _WeakMap = WeakMap$1;

    var WeakMap = _WeakMap;

    /** Used to store function metadata. */
    var metaMap$1 = WeakMap && new WeakMap;

    var _metaMap = metaMap$1;

    /**
     * This method returns `undefined`.
     *
     * @static
     * @memberOf _
     * @since 2.3.0
     * @category Util
     * @example
     *
     * _.times(2, _.noop);
     * // => [undefined, undefined]
     */

    function noop$1() {
      // No operation performed.
    }

    var noop_1 = noop$1;

    var metaMap = _metaMap,
        noop = noop_1;

    /**
     * Gets metadata for `func`.
     *
     * @private
     * @param {Function} func The function to query.
     * @returns {*} Returns the metadata for `func`.
     */
    var getData$2 = !metaMap ? noop : function(func) {
      return metaMap.get(func);
    };

    var _getData = getData$2;

    /** Used to lookup unminified function names. */

    var realNames$1 = {};

    var _realNames = realNames$1;

    var realNames = _realNames;

    /** Used for built-in method references. */
    var objectProto$1 = Object.prototype;

    /** Used to check objects for own properties. */
    var hasOwnProperty$1 = objectProto$1.hasOwnProperty;

    /**
     * Gets the name of `func`.
     *
     * @private
     * @param {Function} func The function to query.
     * @returns {string} Returns the function name.
     */
    function getFuncName$2(func) {
      var result = (func.name + ''),
          array = realNames[result],
          length = hasOwnProperty$1.call(realNames, result) ? array.length : 0;

      while (length--) {
        var data = array[length],
            otherFunc = data.func;
        if (otherFunc == null || otherFunc == func) {
          return data.name;
        }
      }
      return result;
    }

    var _getFuncName = getFuncName$2;

    var baseCreate = _baseCreate,
        baseLodash$1 = _baseLodash;

    /** Used as references for the maximum length and index of an array. */
    var MAX_ARRAY_LENGTH = 4294967295;

    /**
     * Creates a lazy wrapper object which wraps `value` to enable lazy evaluation.
     *
     * @private
     * @constructor
     * @param {*} value The value to wrap.
     */
    function LazyWrapper$3(value) {
      this.__wrapped__ = value;
      this.__actions__ = [];
      this.__dir__ = 1;
      this.__filtered__ = false;
      this.__iteratees__ = [];
      this.__takeCount__ = MAX_ARRAY_LENGTH;
      this.__views__ = [];
    }

    // Ensure `LazyWrapper` is an instance of `baseLodash`.
    LazyWrapper$3.prototype = baseCreate(baseLodash$1.prototype);
    LazyWrapper$3.prototype.constructor = LazyWrapper$3;

    var _LazyWrapper = LazyWrapper$3;

    /**
     * Copies the values of `source` to `array`.
     *
     * @private
     * @param {Array} source The array to copy values from.
     * @param {Array} [array=[]] The array to copy values to.
     * @returns {Array} Returns `array`.
     */

    function copyArray$1(source, array) {
      var index = -1,
          length = source.length;

      array || (array = Array(length));
      while (++index < length) {
        array[index] = source[index];
      }
      return array;
    }

    var _copyArray = copyArray$1;

    var LazyWrapper$2 = _LazyWrapper,
        LodashWrapper$2 = _LodashWrapper,
        copyArray = _copyArray;

    /**
     * Creates a clone of `wrapper`.
     *
     * @private
     * @param {Object} wrapper The wrapper to clone.
     * @returns {Object} Returns the cloned wrapper.
     */
    function wrapperClone$1(wrapper) {
      if (wrapper instanceof LazyWrapper$2) {
        return wrapper.clone();
      }
      var result = new LodashWrapper$2(wrapper.__wrapped__, wrapper.__chain__);
      result.__actions__ = copyArray(wrapper.__actions__);
      result.__index__  = wrapper.__index__;
      result.__values__ = wrapper.__values__;
      return result;
    }

    var _wrapperClone = wrapperClone$1;

    var LazyWrapper$1 = _LazyWrapper,
        LodashWrapper$1 = _LodashWrapper,
        baseLodash = _baseLodash,
        isArray$1 = isArray_1,
        isObjectLike = isObjectLike_1,
        wrapperClone = _wrapperClone;

    /** Used for built-in method references. */
    var objectProto = Object.prototype;

    /** Used to check objects for own properties. */
    var hasOwnProperty = objectProto.hasOwnProperty;

    /**
     * Creates a `lodash` object which wraps `value` to enable implicit method
     * chain sequences. Methods that operate on and return arrays, collections,
     * and functions can be chained together. Methods that retrieve a single value
     * or may return a primitive value will automatically end the chain sequence
     * and return the unwrapped value. Otherwise, the value must be unwrapped
     * with `_#value`.
     *
     * Explicit chain sequences, which must be unwrapped with `_#value`, may be
     * enabled using `_.chain`.
     *
     * The execution of chained methods is lazy, that is, it's deferred until
     * `_#value` is implicitly or explicitly called.
     *
     * Lazy evaluation allows several methods to support shortcut fusion.
     * Shortcut fusion is an optimization to merge iteratee calls; this avoids
     * the creation of intermediate arrays and can greatly reduce the number of
     * iteratee executions. Sections of a chain sequence qualify for shortcut
     * fusion if the section is applied to an array and iteratees accept only
     * one argument. The heuristic for whether a section qualifies for shortcut
     * fusion is subject to change.
     *
     * Chaining is supported in custom builds as long as the `_#value` method is
     * directly or indirectly included in the build.
     *
     * In addition to lodash methods, wrappers have `Array` and `String` methods.
     *
     * The wrapper `Array` methods are:
     * `concat`, `join`, `pop`, `push`, `shift`, `sort`, `splice`, and `unshift`
     *
     * The wrapper `String` methods are:
     * `replace` and `split`
     *
     * The wrapper methods that support shortcut fusion are:
     * `at`, `compact`, `drop`, `dropRight`, `dropWhile`, `filter`, `find`,
     * `findLast`, `head`, `initial`, `last`, `map`, `reject`, `reverse`, `slice`,
     * `tail`, `take`, `takeRight`, `takeRightWhile`, `takeWhile`, and `toArray`
     *
     * The chainable wrapper methods are:
     * `after`, `ary`, `assign`, `assignIn`, `assignInWith`, `assignWith`, `at`,
     * `before`, `bind`, `bindAll`, `bindKey`, `castArray`, `chain`, `chunk`,
     * `commit`, `compact`, `concat`, `conforms`, `constant`, `countBy`, `create`,
     * `curry`, `debounce`, `defaults`, `defaultsDeep`, `defer`, `delay`,
     * `difference`, `differenceBy`, `differenceWith`, `drop`, `dropRight`,
     * `dropRightWhile`, `dropWhile`, `extend`, `extendWith`, `fill`, `filter`,
     * `flatMap`, `flatMapDeep`, `flatMapDepth`, `flatten`, `flattenDeep`,
     * `flattenDepth`, `flip`, `flow`, `flowRight`, `fromPairs`, `functions`,
     * `functionsIn`, `groupBy`, `initial`, `intersection`, `intersectionBy`,
     * `intersectionWith`, `invert`, `invertBy`, `invokeMap`, `iteratee`, `keyBy`,
     * `keys`, `keysIn`, `map`, `mapKeys`, `mapValues`, `matches`, `matchesProperty`,
     * `memoize`, `merge`, `mergeWith`, `method`, `methodOf`, `mixin`, `negate`,
     * `nthArg`, `omit`, `omitBy`, `once`, `orderBy`, `over`, `overArgs`,
     * `overEvery`, `overSome`, `partial`, `partialRight`, `partition`, `pick`,
     * `pickBy`, `plant`, `property`, `propertyOf`, `pull`, `pullAll`, `pullAllBy`,
     * `pullAllWith`, `pullAt`, `push`, `range`, `rangeRight`, `rearg`, `reject`,
     * `remove`, `rest`, `reverse`, `sampleSize`, `set`, `setWith`, `shuffle`,
     * `slice`, `sort`, `sortBy`, `splice`, `spread`, `tail`, `take`, `takeRight`,
     * `takeRightWhile`, `takeWhile`, `tap`, `throttle`, `thru`, `toArray`,
     * `toPairs`, `toPairsIn`, `toPath`, `toPlainObject`, `transform`, `unary`,
     * `union`, `unionBy`, `unionWith`, `uniq`, `uniqBy`, `uniqWith`, `unset`,
     * `unshift`, `unzip`, `unzipWith`, `update`, `updateWith`, `values`,
     * `valuesIn`, `without`, `wrap`, `xor`, `xorBy`, `xorWith`, `zip`,
     * `zipObject`, `zipObjectDeep`, and `zipWith`
     *
     * The wrapper methods that are **not** chainable by default are:
     * `add`, `attempt`, `camelCase`, `capitalize`, `ceil`, `clamp`, `clone`,
     * `cloneDeep`, `cloneDeepWith`, `cloneWith`, `conformsTo`, `deburr`,
     * `defaultTo`, `divide`, `each`, `eachRight`, `endsWith`, `eq`, `escape`,
     * `escapeRegExp`, `every`, `find`, `findIndex`, `findKey`, `findLast`,
     * `findLastIndex`, `findLastKey`, `first`, `floor`, `forEach`, `forEachRight`,
     * `forIn`, `forInRight`, `forOwn`, `forOwnRight`, `get`, `gt`, `gte`, `has`,
     * `hasIn`, `head`, `identity`, `includes`, `indexOf`, `inRange`, `invoke`,
     * `isArguments`, `isArray`, `isArrayBuffer`, `isArrayLike`, `isArrayLikeObject`,
     * `isBoolean`, `isBuffer`, `isDate`, `isElement`, `isEmpty`, `isEqual`,
     * `isEqualWith`, `isError`, `isFinite`, `isFunction`, `isInteger`, `isLength`,
     * `isMap`, `isMatch`, `isMatchWith`, `isNaN`, `isNative`, `isNil`, `isNull`,
     * `isNumber`, `isObject`, `isObjectLike`, `isPlainObject`, `isRegExp`,
     * `isSafeInteger`, `isSet`, `isString`, `isUndefined`, `isTypedArray`,
     * `isWeakMap`, `isWeakSet`, `join`, `kebabCase`, `last`, `lastIndexOf`,
     * `lowerCase`, `lowerFirst`, `lt`, `lte`, `max`, `maxBy`, `mean`, `meanBy`,
     * `min`, `minBy`, `multiply`, `noConflict`, `noop`, `now`, `nth`, `pad`,
     * `padEnd`, `padStart`, `parseInt`, `pop`, `random`, `reduce`, `reduceRight`,
     * `repeat`, `result`, `round`, `runInContext`, `sample`, `shift`, `size`,
     * `snakeCase`, `some`, `sortedIndex`, `sortedIndexBy`, `sortedLastIndex`,
     * `sortedLastIndexBy`, `startCase`, `startsWith`, `stubArray`, `stubFalse`,
     * `stubObject`, `stubString`, `stubTrue`, `subtract`, `sum`, `sumBy`,
     * `template`, `times`, `toFinite`, `toInteger`, `toJSON`, `toLength`,
     * `toLower`, `toNumber`, `toSafeInteger`, `toString`, `toUpper`, `trim`,
     * `trimEnd`, `trimStart`, `truncate`, `unescape`, `uniqueId`, `upperCase`,
     * `upperFirst`, `value`, and `words`
     *
     * @name _
     * @constructor
     * @category Seq
     * @param {*} value The value to wrap in a `lodash` instance.
     * @returns {Object} Returns the new `lodash` wrapper instance.
     * @example
     *
     * function square(n) {
     *   return n * n;
     * }
     *
     * var wrapped = _([1, 2, 3]);
     *
     * // Returns an unwrapped value.
     * wrapped.reduce(_.add);
     * // => 6
     *
     * // Returns a wrapped value.
     * var squares = wrapped.map(square);
     *
     * _.isArray(squares);
     * // => false
     *
     * _.isArray(squares.value());
     * // => true
     */
    function lodash$1(value) {
      if (isObjectLike(value) && !isArray$1(value) && !(value instanceof LazyWrapper$1)) {
        if (value instanceof LodashWrapper$1) {
          return value;
        }
        if (hasOwnProperty.call(value, '__wrapped__')) {
          return wrapperClone(value);
        }
      }
      return new LodashWrapper$1(value);
    }

    // Ensure wrappers are instances of `baseLodash`.
    lodash$1.prototype = baseLodash.prototype;
    lodash$1.prototype.constructor = lodash$1;

    var wrapperLodash = lodash$1;

    var LazyWrapper = _LazyWrapper,
        getData$1 = _getData,
        getFuncName$1 = _getFuncName,
        lodash = wrapperLodash;

    /**
     * Checks if `func` has a lazy counterpart.
     *
     * @private
     * @param {Function} func The function to check.
     * @returns {boolean} Returns `true` if `func` has a lazy counterpart,
     *  else `false`.
     */
    function isLaziable$1(func) {
      var funcName = getFuncName$1(func),
          other = lodash[funcName];

      if (typeof other != 'function' || !(funcName in LazyWrapper.prototype)) {
        return false;
      }
      if (func === other) {
        return true;
      }
      var data = getData$1(other);
      return !!data && func === data[0];
    }

    var _isLaziable = isLaziable$1;

    var LodashWrapper = _LodashWrapper,
        flatRest = _flatRest,
        getData = _getData,
        getFuncName = _getFuncName,
        isArray = isArray_1,
        isLaziable = _isLaziable;

    /** Error message constants. */
    var FUNC_ERROR_TEXT = 'Expected a function';

    /** Used to compose bitmasks for function metadata. */
    var WRAP_CURRY_FLAG = 8,
        WRAP_PARTIAL_FLAG = 32,
        WRAP_ARY_FLAG = 128,
        WRAP_REARG_FLAG = 256;

    /**
     * Creates a `_.flow` or `_.flowRight` function.
     *
     * @private
     * @param {boolean} [fromRight] Specify iterating from right to left.
     * @returns {Function} Returns the new flow function.
     */
    function createFlow$1(fromRight) {
      return flatRest(function(funcs) {
        var length = funcs.length,
            index = length,
            prereq = LodashWrapper.prototype.thru;

        if (fromRight) {
          funcs.reverse();
        }
        while (index--) {
          var func = funcs[index];
          if (typeof func != 'function') {
            throw new TypeError(FUNC_ERROR_TEXT);
          }
          if (prereq && !wrapper && getFuncName(func) == 'wrapper') {
            var wrapper = new LodashWrapper([], true);
          }
        }
        index = wrapper ? index : length;
        while (++index < length) {
          func = funcs[index];

          var funcName = getFuncName(func),
              data = funcName == 'wrapper' ? getData(func) : undefined;

          if (data && isLaziable(data[0]) &&
                data[1] == (WRAP_ARY_FLAG | WRAP_CURRY_FLAG | WRAP_PARTIAL_FLAG | WRAP_REARG_FLAG) &&
                !data[4].length && data[9] == 1
              ) {
            wrapper = wrapper[getFuncName(data[0])].apply(wrapper, data[3]);
          } else {
            wrapper = (func.length == 1 && isLaziable(func))
              ? wrapper[funcName]()
              : wrapper.thru(func);
          }
        }
        return function() {
          var args = arguments,
              value = args[0];

          if (wrapper && args.length == 1 && isArray(value)) {
            return wrapper.plant(value).value();
          }
          var index = 0,
              result = length ? funcs[index].apply(this, args) : value;

          while (++index < length) {
            result = funcs[index].call(this, result);
          }
          return result;
        };
      });
    }

    var _createFlow = createFlow$1;

    var createFlow = _createFlow;

    /**
     * Creates a function that returns the result of invoking the given functions
     * with the `this` binding of the created function, where each successive
     * invocation is supplied the return value of the previous.
     *
     * @static
     * @memberOf _
     * @since 3.0.0
     * @category Util
     * @param {...(Function|Function[])} [funcs] The functions to invoke.
     * @returns {Function} Returns the new composite function.
     * @see _.flowRight
     * @example
     *
     * function square(n) {
     *   return n * n;
     * }
     *
     * var addSquare = _.flow([_.add, square]);
     * addSquare(1, 2);
     * // => 9
     */
    var flow = createFlow();

    var flow_1 = flow;

    Promise.prototype['finally'] = function finallyPolyfill(callback) {
        const constructor = this.constructor;
        return this.then(function (value) {
            return constructor.resolve(callback()).then(function () {
                return value;
            });
        }, function (reason) {
            return constructor.resolve(callback()).then(function () {
                throw reason;
            });
        });
    };
    function Deferred() {
        const defer = {};
        defer.promise = new Promise(function (resolve, reject) {
            defer.resolve = resolve;
            defer.reject = reject;
        });
        return defer;
    }
    function timeout(ms, cb) {
        const defer = Deferred();
        const wait = setTimeout(() => {
            clearTimeout(wait);
            if (cb) {
                cb && cb(defer.resolve, defer.reject);
            }
            else {
                defer.reject('Timed out in ' + ms + 'ms.');
            }
        }, ms);
        return defer.promise;
    }
    class DataFormat {
        static jsonToHex(json) {
            return flow_1(DataFormat.jsonToStr, DataFormat.strToHex)(json);
        }
        static hexToJson(strHex) {
            return flow_1(DataFormat.hexToBuf, DataFormat.bufToJson)(strHex);
        }
        static jsonToBuf(json) {
            return flow_1(DataFormat.jsonToStr, DataFormat.strToBuf)(json);
        }
        static bufToJson(buf) {
            return flow_1(DataFormat.bufToStr, DataFormat.strToJson)(buf);
        }
        static jsonToStr(json) {
            try {
                return JSON.stringify(json);
            }
            catch (_) {
                return '[Circular]';
            }
        }
        static strToJson(str) {
            try {
                return JSON.parse(str);
            }
            catch (_) {
                return {
                    error: Error('json parse error'),
                };
            }
        }
        static strToHex(str) {
            return flow_1(DataFormat.strToBuf, DataFormat.bufToHex)(str);
        }
        static hexToStr(strHex) {
            return flow_1(DataFormat.hexToBuf, DataFormat.bufToStr)(strHex);
        }
        static strToBuf(str) {
            return buffer.Buffer.from(str, 'utf8');
        }
        static bufToStr(buf) {
            return buf.toString('utf8');
        }
        static hexToBuf(strHex) {
            return buffer.Buffer.from(strHex, 'hex');
        }
        static bufToHex(buf) {
            return buf.toString('hex');
        }
        static binToBuf(bin) {
            return buffer.Buffer.from(bin);
        }
        static bufToBin(buf) {
            return buf.buffer;
        }
        static binToHex(bin) {
            return flow_1(DataFormat.binToBuf, DataFormat.bufToHex)(bin);
        }
        static hexToBin(hex) {
            return flow_1(DataFormat.hexToBuf, DataFormat.bufToBin)(hex);
        }
        static arrayToBuf(array) {
            return buffer.Buffer.from(array);
        }
        static bufToArray(buf) {
            return Array.prototype.slice.call(buf);
        }
        static arrayToHex(array) {
            return flow_1(DataFormat.arrayToBuf, DataFormat.bufToHex)(array);
        }
        static hexToArray(hex) {
            return flow_1(DataFormat.hexToBuf, DataFormat.bufToArray)(hex);
        }
    }

    var eventemitter3 = {exports: {}};

    (function (module) {

    var has = Object.prototype.hasOwnProperty
      , prefix = '~';

    /**
     * Constructor to create a storage for our `EE` objects.
     * An `Events` instance is a plain object whose properties are event names.
     *
     * @constructor
     * @private
     */
    function Events() {}

    //
    // We try to not inherit from `Object.prototype`. In some engines creating an
    // instance in this way is faster than calling `Object.create(null)` directly.
    // If `Object.create(null)` is not supported we prefix the event names with a
    // character to make sure that the built-in object properties are not
    // overridden or used as an attack vector.
    //
    if (Object.create) {
      Events.prototype = Object.create(null);

      //
      // This hack is needed because the `__proto__` property is still inherited in
      // some old browsers like Android 4, iPhone 5.1, Opera 11 and Safari 5.
      //
      if (!new Events().__proto__) prefix = false;
    }

    /**
     * Representation of a single event listener.
     *
     * @param {Function} fn The listener function.
     * @param {*} context The context to invoke the listener with.
     * @param {Boolean} [once=false] Specify if the listener is a one-time listener.
     * @constructor
     * @private
     */
    function EE(fn, context, once) {
      this.fn = fn;
      this.context = context;
      this.once = once || false;
    }

    /**
     * Add a listener for a given event.
     *
     * @param {EventEmitter} emitter Reference to the `EventEmitter` instance.
     * @param {(String|Symbol)} event The event name.
     * @param {Function} fn The listener function.
     * @param {*} context The context to invoke the listener with.
     * @param {Boolean} once Specify if the listener is a one-time listener.
     * @returns {EventEmitter}
     * @private
     */
    function addListener(emitter, event, fn, context, once) {
      if (typeof fn !== 'function') {
        throw new TypeError('The listener must be a function');
      }

      var listener = new EE(fn, context || emitter, once)
        , evt = prefix ? prefix + event : event;

      if (!emitter._events[evt]) emitter._events[evt] = listener, emitter._eventsCount++;
      else if (!emitter._events[evt].fn) emitter._events[evt].push(listener);
      else emitter._events[evt] = [emitter._events[evt], listener];

      return emitter;
    }

    /**
     * Clear event by name.
     *
     * @param {EventEmitter} emitter Reference to the `EventEmitter` instance.
     * @param {(String|Symbol)} evt The Event name.
     * @private
     */
    function clearEvent(emitter, evt) {
      if (--emitter._eventsCount === 0) emitter._events = new Events();
      else delete emitter._events[evt];
    }

    /**
     * Minimal `EventEmitter` interface that is molded against the Node.js
     * `EventEmitter` interface.
     *
     * @constructor
     * @public
     */
    function EventEmitter() {
      this._events = new Events();
      this._eventsCount = 0;
    }

    /**
     * Return an array listing the events for which the emitter has registered
     * listeners.
     *
     * @returns {Array}
     * @public
     */
    EventEmitter.prototype.eventNames = function eventNames() {
      var names = []
        , events
        , name;

      if (this._eventsCount === 0) return names;

      for (name in (events = this._events)) {
        if (has.call(events, name)) names.push(prefix ? name.slice(1) : name);
      }

      if (Object.getOwnPropertySymbols) {
        return names.concat(Object.getOwnPropertySymbols(events));
      }

      return names;
    };

    /**
     * Return the listeners registered for a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @returns {Array} The registered listeners.
     * @public
     */
    EventEmitter.prototype.listeners = function listeners(event) {
      var evt = prefix ? prefix + event : event
        , handlers = this._events[evt];

      if (!handlers) return [];
      if (handlers.fn) return [handlers.fn];

      for (var i = 0, l = handlers.length, ee = new Array(l); i < l; i++) {
        ee[i] = handlers[i].fn;
      }

      return ee;
    };

    /**
     * Return the number of listeners listening to a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @returns {Number} The number of listeners.
     * @public
     */
    EventEmitter.prototype.listenerCount = function listenerCount(event) {
      var evt = prefix ? prefix + event : event
        , listeners = this._events[evt];

      if (!listeners) return 0;
      if (listeners.fn) return 1;
      return listeners.length;
    };

    /**
     * Calls each of the listeners registered for a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @returns {Boolean} `true` if the event had listeners, else `false`.
     * @public
     */
    EventEmitter.prototype.emit = function emit(event, a1, a2, a3, a4, a5) {
      var evt = prefix ? prefix + event : event;

      if (!this._events[evt]) return false;

      var listeners = this._events[evt]
        , len = arguments.length
        , args
        , i;

      if (listeners.fn) {
        if (listeners.once) this.removeListener(event, listeners.fn, undefined, true);

        switch (len) {
          case 1: return listeners.fn.call(listeners.context), true;
          case 2: return listeners.fn.call(listeners.context, a1), true;
          case 3: return listeners.fn.call(listeners.context, a1, a2), true;
          case 4: return listeners.fn.call(listeners.context, a1, a2, a3), true;
          case 5: return listeners.fn.call(listeners.context, a1, a2, a3, a4), true;
          case 6: return listeners.fn.call(listeners.context, a1, a2, a3, a4, a5), true;
        }

        for (i = 1, args = new Array(len -1); i < len; i++) {
          args[i - 1] = arguments[i];
        }

        listeners.fn.apply(listeners.context, args);
      } else {
        var length = listeners.length
          , j;

        for (i = 0; i < length; i++) {
          if (listeners[i].once) this.removeListener(event, listeners[i].fn, undefined, true);

          switch (len) {
            case 1: listeners[i].fn.call(listeners[i].context); break;
            case 2: listeners[i].fn.call(listeners[i].context, a1); break;
            case 3: listeners[i].fn.call(listeners[i].context, a1, a2); break;
            case 4: listeners[i].fn.call(listeners[i].context, a1, a2, a3); break;
            default:
              if (!args) for (j = 1, args = new Array(len -1); j < len; j++) {
                args[j - 1] = arguments[j];
              }

              listeners[i].fn.apply(listeners[i].context, args);
          }
        }
      }

      return true;
    };

    /**
     * Add a listener for a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @param {Function} fn The listener function.
     * @param {*} [context=this] The context to invoke the listener with.
     * @returns {EventEmitter} `this`.
     * @public
     */
    EventEmitter.prototype.on = function on(event, fn, context) {
      return addListener(this, event, fn, context, false);
    };

    /**
     * Add a one-time listener for a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @param {Function} fn The listener function.
     * @param {*} [context=this] The context to invoke the listener with.
     * @returns {EventEmitter} `this`.
     * @public
     */
    EventEmitter.prototype.once = function once(event, fn, context) {
      return addListener(this, event, fn, context, true);
    };

    /**
     * Remove the listeners of a given event.
     *
     * @param {(String|Symbol)} event The event name.
     * @param {Function} fn Only remove the listeners that match this function.
     * @param {*} context Only remove the listeners that have this context.
     * @param {Boolean} once Only remove one-time listeners.
     * @returns {EventEmitter} `this`.
     * @public
     */
    EventEmitter.prototype.removeListener = function removeListener(event, fn, context, once) {
      var evt = prefix ? prefix + event : event;

      if (!this._events[evt]) return this;
      if (!fn) {
        clearEvent(this, evt);
        return this;
      }

      var listeners = this._events[evt];

      if (listeners.fn) {
        if (
          listeners.fn === fn &&
          (!once || listeners.once) &&
          (!context || listeners.context === context)
        ) {
          clearEvent(this, evt);
        }
      } else {
        for (var i = 0, events = [], length = listeners.length; i < length; i++) {
          if (
            listeners[i].fn !== fn ||
            (once && !listeners[i].once) ||
            (context && listeners[i].context !== context)
          ) {
            events.push(listeners[i]);
          }
        }

        //
        // Reset the array, or remove it completely if we have no more listeners.
        //
        if (events.length) this._events[evt] = events.length === 1 ? events[0] : events;
        else clearEvent(this, evt);
      }

      return this;
    };

    /**
     * Remove all listeners, or those of the specified event.
     *
     * @param {(String|Symbol)} [event] The event name.
     * @returns {EventEmitter} `this`.
     * @public
     */
    EventEmitter.prototype.removeAllListeners = function removeAllListeners(event) {
      var evt;

      if (event) {
        evt = prefix ? prefix + event : event;
        if (this._events[evt]) clearEvent(this, evt);
      } else {
        this._events = new Events();
        this._eventsCount = 0;
      }

      return this;
    };

    //
    // Alias methods names because people roll like that.
    //
    EventEmitter.prototype.off = EventEmitter.prototype.removeListener;
    EventEmitter.prototype.addListener = EventEmitter.prototype.on;

    //
    // Expose the prefix.
    //
    EventEmitter.prefixed = prefix;

    //
    // Allow `EventEmitter` to be imported as module namespace.
    //
    EventEmitter.EventEmitter = EventEmitter;

    //
    // Expose the module.
    //
    {
      module.exports = EventEmitter;
    }
    }(eventemitter3));

    var EventEmitter = eventemitter3.exports;

    class EventBus extends EventEmitter {
        constructor() {
            super();
        }
    }

    function AppId$1(id) {
        return id;
    }

    function Pid$1(id) {
        return id;
    }

    // 3600 byte
    const PAYLOAD = [`payload/binary`];
    const HEADER_DESC = [
        'flag:8/unsigned-integer',
        'version:8/unsigned-integer',
        'type:16/unsigned-little-integer',
        'port1:16/unsigned-little-integer',
        'port2:16/unsigned-little-integer',
        'appId:32/unsigned-little-integer',
        'extra:4/binary',
    ];
    const PROTOCOL = [...HEADER_DESC, PAYLOAD].join(',');
    // header 16 byte 头部有 16 个字节
    // 其中：
    // flag = protocol flag 协议标识
    // version = protocol version 协议版本
    // type = message type 消息类型
    // port1 = device port 设备端应用端口号
    // port2 = mobile main service app-side port 移动端伴生应用的端口号
    // extra = reserved data 保留字段

    // min - max
    const range = [1000, 65535];
    let port = range[0];
    function getIdlePort() {
        if (port > range[1]) {
            port = range[0];
        }
        return Port(++port);
    }
    function Port(id) {
        return id;
    }

    class ModelApi extends EventBus {
        constructor(opts) {
            super();
            this.model = opts.model;
            this.parent = opts.parent;
            this.child = opts.child;
            this.logger = opts.logger;
            // 处理 request
            this.listener = (e) => {
                const data = e.data;
                if (isJsonRpcRequestNotify(data)) {
                    this.resolveValue(this.model, Cmd(data.method), { request: data, source: this.parent });
                    return;
                }
                if (isJsonRpcRequestMessage(data)) {
                    this.resolveValue(this.model, Cmd(data.method), { request: data, source: this })
                        .then((result) => {
                        const response = new JsonRpcResponseBuilder()
                            .setId(JsonRpcId(data.id))
                            .setResult(result)
                            .build();
                        this.child.postMessage(response);
                    })
                        .catch((e) => {
                        const error = new JsonRpcErrorBuilder()
                            .setCode(e.code)
                            .setMessage(e.message)
                            .setData({
                            id: data.id,
                            method: data.method,
                        })
                            .build();
                        const responseError = new JsonRpcResponseErrorBuilder().setError(error);
                        this.child.postMessage(responseError);
                    });
                }
            };
            this.parent.addEventListener('message', this.listener);
        }
        call(cmd, args, transfer) {
            const defer = Deferred();
            const method = Method(cmd);
            const jsonRpcPayload = new JsonRpcRequestNotifyBuilder()
                .setMethod(method)
                .setParams(args)
                .build();
            this.child.postMessage(jsonRpcPayload, transfer);
            defer.resolve(void 0);
            return defer.promise;
        }
        static forward(req, from, to, opts) {
            const defer = Deferred();
            if (isJsonRpcRequestMessage(req)) {
                const jsonRpcId = JsonRpcId(req.id);
                opts === null || opts === void 0 ? void 0 : opts.requests.forEach((func) => func(req));
                to.child.postMessage(req);
                const transact = (e) => {
                    const jsonRpc = e.data;
                    if (isJsonResponseSuccess(jsonRpc)) {
                        if (jsonRpc.id === jsonRpcId) {
                            opts === null || opts === void 0 ? void 0 : opts.responses.forEach((func) => func(jsonRpc));
                            to.parent.removeEventListener('message', transact);
                            from.child.postMessage(jsonRpc);
                            defer.resolve(void 0);
                        }
                    }
                    else if (isJsonResponseError(jsonRpc)) {
                        to.parent.removeEventListener('message', transact);
                        from.child.postMessage(jsonRpc);
                        defer.resolve(void 0);
                    }
                };
                to.parent.addEventListener('message', transact);
            }
            else if (isJsonRpcRequestNotify(req)) {
                to.child.postMessage(req);
                defer.resolve(void 0);
            }
            return defer.promise;
        }
        request(cmd, args, opts = { timeout: 10000, transfer: [] }) {
            const defer = Deferred();
            const jsonRpcId = JsonRpcId(generateUUID());
            const method = Cmd.toMethod(cmd);
            const jsonRpcPayload = new JsonRpcRequestBuilder()
                .setId(jsonRpcId)
                .setMethod(method)
                .setParams(args)
                .build();
            const transact = (e) => {
                const data = e.data;
                if (isJsonResponseSuccess(data)) {
                    if (data.id === jsonRpcId) {
                        this.logger.info('request [%s] =>', jsonRpcPayload.id, jsonRpcPayload);
                        this.logger.info('response [%s] =>', data.id, data);
                        this.parent.removeEventListener('message', transact);
                        defer.resolve(data.result);
                    }
                }
                else if (isJsonResponseError(data)) {
                    this.parent.removeEventListener('message', transact);
                    defer.reject(data.error);
                }
            };
            this.parent.addEventListener('message', transact);
            this.child.postMessage(jsonRpcPayload, opts.transfer);
            let hasValueReturned = false;
            // this.logger.log('pre request [%s] =>', jsonRpcPayload.id, jsonRpcPayload)
            return Promise.race([
                timeout(opts.timeout || 10000, (resolve, reject) => {
                    if (hasValueReturned) {
                        return resolve();
                    }
                    this.logger.error('request error [%s] =>', jsonRpcPayload.id, jsonRpcPayload);
                    this.parent.removeEventListener('message', transact);
                    reject('Timed out in ' + opts.timeout || 10000 + 'ms.');
                }),
                defer.promise.finally(() => {
                    hasValueReturned = true;
                }),
            ]);
        }
        resolveValue(model, property, args) {
            if (!model[property]) {
                property = '*';
            }
            const unwrappedContext = typeof model[property] === 'function' ? model[property](args) : model[property];
            return Promise.resolve(unwrappedContext);
        }
        destroy() {
            this.parent.removeEventListener('message', this.listener);
        }
    }

    class HmMessagePort {
        constructor(port, logger) {
            this.port = port;
            this.logger = logger;
            this.port.addEventListener('message', (e) => {
                this.logger.debug('[RAW] [R] data=%j', e.data);
            });
        }
        addEventListener(type, listener) {
            this.port.addEventListener(type, listener);
        }
        removeEventListener(type, listener) {
            this.port.removeEventListener(type, listener);
        }
        postMessage(message, transfer) {
            this.logger.debug('[RAW] [S] data=%j', message);
            this.port.postMessage(message, transfer);
        }
        start() {
            if (this.port instanceof MessagePort) {
                this.port.start();
            }
        }
    }
    class PeerParent {
        constructor({ name, parent, child, logger, model, }) {
            this.name = name;
            this.parent = parent;
            this.child = child;
            this.logger = logger;
            this.model = model;
        }
        sendHandshake() {
            const defer = Deferred();
            const jsonRpcId = JsonRpcId(generateUUID());
            const reply = (e) => {
                if (e.data.id === jsonRpcId) {
                    this.logger.debug('%s [parent] [handshake] [R] json[%j]', this.name, e.data);
                    this.parent.removeEventListener('message', reply);
                    defer.resolve(new ModelApi(this));
                }
            };
            this.parent.addEventListener('message', reply);
            if (this.parent instanceof MessagePort || this.parent instanceof HmMessagePort) {
                this.parent.start();
            }
            const request = new JsonRpcRequestBuilder()
                .setId(jsonRpcId)
                .setMethod(Method(CmdType.SHAKE_CMD))
                .setParams()
                .build();
            this.logger.debug('%s [parent] [handshake] [S] json[%j]', this.name, request);
            this.child.postMessage(request);
            return defer.promise;
        }
    }

    function Cmd(method) {
        if (typeof method === 'string') {
            return method;
        }
        return (method.module + '.' + method.action);
    }
    Cmd.toMethod = (method) => {
        return Method(method);
    };
    Cmd.from = (method) => {
        return (method.module + '.' + method.action);
    };
    function Method(cmd) {
        const tokens = cmd.split('.');
        return {
            module: tokens.slice(0, -1).join('.'),
            action: tokens.slice(-1)[0],
        };
    }
    const CmdType = {
        SHAKE_CMD: Cmd('main.heartBeat.heartBeatInfo.handshake'),
        PROCESS_INFO_CMD: Cmd('main.scheduling.workerManage.postAppInfo'),
        CHANNEL_CMD: Cmd('main.scheduling.workerManage.postMessageChannel'),
        SIDE_CODE_CMD: Cmd('main.scheduling.workerManage.postServiceCode'),
        LAUNCH_SETTING_CMD: Cmd('message.notification.launch.settingsChanged'),
        LAUNCH_PEER_CMD: Cmd('message.notification.launch.peerAppLaunched'),
        SERVICE_CODE_CMD: Cmd('main.scheduling.code.getWorkerCode'),
        MAIN_LOG_CMD: Cmd('main.console.out.log'),
        WORKER_LOG_CMD: Cmd('worker.console.out.log'),
        PROCESS_LOG_CMD: Cmd('process.console.out.log'),
        DEVICE_LOG_CMD: Cmd('device.console.out.log'),
        WORKER_NETWORK_HTTP_CMD: Cmd('worker.service.network.fetch'),
        PERMISSION_CMD: Cmd('main.scheduling.permission.getPermissionList'),
        USER_SETTINGS_CMD: Cmd('appSettings.framework.userSettings.getUserSettings'),
        SYSTEM_SETTINGS_CMD: Cmd('appSettings.framework.system.getSystemInfo'),
        // 存储服务
        WORKER_SETTINGS_STORAGE_GET_CMD: Cmd('worker.framework.settingsStorage.getSettingsStorage'),
        WORKER_SETTINGS_STORAGE_SET_CMD: Cmd('worker.framework.settingsStorage.setSettingsStorage'),
        WORKER_SETTINGS_STORAGE_REMOVE_CMD: Cmd('worker.framework.settingsStorage.removeSettingsStorage'),
        WORKER_SETTINGS_STORAGE_CLEAR_CMD: Cmd('worker.framework.settingsStorage.clearSettingsStorage'),
        WORKER_LOCAL_STORAGE_GET_CMD: Cmd('worker.service.localStorage.getLocalStorage'),
        WORKER_LOCAL_STORAGE_SET_CMD: Cmd('worker.service.localStorage.setLocalStorage'),
        WORKER_LOCAL_STORAGE_REMOVE_CMD: Cmd('worker.service.localStorage.removeLocalStorage'),
        WORKER_LOCAL_STORAGE_CLEAR_CMD: Cmd('worker.service.localStorage.clearLocalStorage'),
        WORKER_LIVE_STORAGE_GET_CMD: Cmd('worker.service.liveStorage.getLiveStorage'),
        WORKER_LIVE_STORAGE_SET_CMD: Cmd('worker.service.liveStorage.setLiveStorage'),
        WORKER_LIVE_STORAGE_REMOVE_CMD: Cmd('worker.service.liveStorage.removeLiveStorage'),
        WORKER_LIVE_STORAGE_CLEAR_CMD: Cmd('worker.service.liveStorage.clearLiveStorage'),
        // 内部接口
        WORKER_NETWORK_OPEN_API_CMD: Cmd('app.internal.network.zeppOpenApi'),
        WORKER_USER_INFO_CMD: Cmd('app.internal.user.getUserInfo'),
        // 内部接口结束
    };

    function getGlobal() {
        if (typeof window !== 'undefined') {
            return window;
        }
        if (typeof globalThis !== 'undefined') {
            return globalThis;
        }
        if (typeof self !== 'undefined') {
            return self;
        }
        throw new Error('unable to locate global object');
    }
    // let _iosBridge: any
    // if (getGlobal().webkit?.messageHandlers) {
    //   _iosBridge = getGlobal().webkit?.messageHandlers
    //     ? {
    //         BLE: {
    //           postMessage(data: any): void {
    //             window.webkit?.messageHandlers.BLE.postMessage(data)
    //           },
    //         },
    //         RPC: {
    //           postMessage(data: any): void {
    //             window.webkit?.messageHandlers.RPC.postMessage(data)
    //           },
    //         },
    //         LOG: {
    //           postMessage(data: any): void {
    //             window.webkit?.messageHandlers.LOG.postMessage(data)
    //           },
    //         },
    //       }
    //     : {}
    // }
    function getIOSCtx() {
        var _a;
        return (_a = getGlobal().webkit) === null || _a === void 0 ? void 0 : _a.messageHandlers;
    }
    function getAndroidCtx() {
        return getGlobal();
    }
    function getWorkerCtx() {
        return getGlobal();
    }
    function getCtx() {
        return getIOSCtx() || getAndroidCtx() || getWorkerCtx();
    }
    function getChannel(type) {
        var _a;
        return (_a = getCtx()) === null || _a === void 0 ? void 0 : _a[type];
    }

    const $ = format;
    const parse_int = parse_int$1;
    const parse_float = parse_float$1;
    const lines = [];
    function $start() {
        lines.length = 0;
    }
    function $line(f, ...rest) {
        lines.push($(f, ...rest));
    }
    function $result() {
        return lines.join('\n');
    }
    // string
    function bits_expr(segment) {
        if (typeof segment.size === 'string') {
            return $('%s * %d', var_name(segment.size), segment.unit);
        }
        else {
            return (segment.size * segment.unit).toString();
        }
    }
    function get_number(segment) {
        $line('bits = %s;\n', bits_expr(segment));
        const parser = segment.type === 'integer' ? 'parse_int' : 'parse_float';
        const be = segment.bigendian, sg = segment.signed;
        $line('byteoffset = offset / 8; offset += bits');
        $line('if (offset > binsize) { return false; }');
        $line('else { result = %s(bin, byteoffset, bits / 8, %s, %s); }', parser, be, sg);
    }
    function get_binary(segment) {
        $line('byteoffset = offset / 8;');
        if (segment.size === true) {
            $line('offset = binsize;');
            $line('result = bin.slice(byteoffset);');
        }
        else {
            $line('bits = %s;', bits_expr(segment));
            $line('offset += bits;');
            $line('if (offset > binsize) { return false; }');
            $line('else { result = bin.slice(byteoffset,', 'byteoffset + bits / 8); }');
        }
    }
    function get_string(segment) {
        $line('byteoffset = offset / 8;');
        const strlen = segment.value.length;
        const strlenbits = strlen * 8;
        $line('offset += %d;', strlenbits);
        $line('if (offset > binsize) { return false; }');
        $line('else { result = bin.toString(byteoffset,', $('byteoffset + %d); }', strlen));
    }
    function skip_bits(segment) {
        if (typeof segment.size === 'string') {
            // Damn. Have to look up the size.
            $line('var skipbits = %s * %d;', var_name(segment.size), segment.unit);
            $line('if (offset + skipbits > binsize) { return false; }');
            $line('else { offset += skipbits; }');
        }
        else if (segment.size === true) {
            $line('if (offset % 8 === 0) { offset = binsize; }');
            $line('else { return false; }');
        }
        else {
            const bits = segment.unit * segment.size;
            $line('if (offset + %d > binsize) { return false; }', bits);
            $line('else { offset += %d; }', bits);
        }
    }
    function match_seg(segment) {
        if (segment.name === '_') {
            skip_bits(segment);
        }
        else {
            switch (segment.type) {
                case 'integer':
                case 'float':
                    get_number(segment);
                    break;
                case 'binary':
                    get_binary(segment);
                    break;
                case 'string':
                    get_string(segment);
                    break;
            }
            $line('if (result === false) return false;');
            if (segment.name) {
                // variable is given a value in the environment
                $line('else if (%s !== undefined) {', var_name(segment.name));
                // .. and it is not the same as that matched
                $line('if (%s != result) return false;', var_name(segment.name));
                $line('}');
                // variable is free
                $line('else %s = result;', var_name(segment.name));
            }
            else {
                const repr = JSON.stringify(segment.value);
                $line('else if (result != %s) return false;', repr);
            }
        }
    }
    function var_name(name) {
        return 'var_' + name;
    }
    function variables(segments) {
        const names = {};
        for (let i = 0; i < segments.length; i++) {
            let name = segments[i].name;
            if (name && name !== '_') {
                names[name] = true;
            }
            name = segments[i].size;
            if (typeof name === 'string') {
                names[name] = true;
            }
        }
        return Object.keys(names);
    }
    function compile_pattern(segments) {
        $start();
        $line('return function(binary, env) {');
        $line("'use strict';");
        $line('var bin = binary, env = env || {};');
        $line('var offset = 0, binsize = bin.length * 8;');
        $line('var bits, result, byteoffset;');
        const varnames = variables(segments);
        for (let v = 0; v < varnames.length; v++) {
            const name = varnames[v];
            $line("var %s = env['%s'];", var_name(name), name);
        }
        const len = segments.length;
        for (let i = 0; i < len; i++) {
            const segment = segments[i];
            $line('// ' + JSON.stringify(segment));
            match_seg(segment);
        }
        $line('if (offset == binsize) {');
        $line('return {');
        for (let v = 0; v < varnames.length; v++) {
            const name = varnames[v];
            $line('%s: %s,', name, var_name(name));
        }
        $line('};');
        $line('}'); // if offset == binsize
        $line('else return false;');
        $line('}'); // end function
        const fn = new Function('parse_int', 'parse_float', $result());
        return fn(parse_int, parse_float);
    }
    function compile(...rest) {
        const str = rest.join(',');
        const p = parse(str);
        return compile_pattern(p);
    }

    class ProcessMgr {
        constructor() {
            this.pidAndProcessContextMap = new Map();
        }
        /**
         * get
         * key workerName
         */
        get(pid) {
            return this.pidAndProcessContextMap.get(pid);
        }
        getByAppId(appId) {
            for (const v of this.pidAndProcessContextMap.values()) {
                if (v.appId === appId) {
                    return v;
                }
            }
        }
        getByPort1(port) {
            for (const v of this.pidAndProcessContextMap.values()) {
                if (v.port1 === port) {
                    return v;
                }
            }
        }
        getByPort2(port) {
            for (const v of this.pidAndProcessContextMap.values()) {
                if (v.port2 === port) {
                    return v;
                }
            }
        }
        isRunning(appId) {
            return Object.values(this.pidAndProcessContextMap).some((v) => v.appId === appId);
        }
        set(pid, workerInfo) {
            this.pidAndProcessContextMap.set(pid, workerInfo);
        }
        del(pid) {
            this.pidAndProcessContextMap.delete(pid);
        }
        get length() {
            return this.pidAndProcessContextMap.size;
        }
    }
    const processMgr = new ProcessMgr();

    const HmLogger = Logger.getLogger('main');
    HmLogger.prefix = 'main';
    const LogLogger = Logger.getLogger('logger');
    LogLogger.prefix = 'main';
    LogLogger.level = LogLogger.levels.off;
    const WorkerLogger = Logger.getLogger('worker-channel-log');
    WorkerLogger.prefix = 'main';
    WorkerLogger.level = LogLogger.levels.off;

    const loggerRpc$1 = HmLogger.getLogger('app-channel-rpc');
    const loggerBle$1 = HmLogger.getLogger('app-channel-ble');
    const loggerLog$1 = LogLogger.getLogger('app-channel-log');
    class NativeBleChannel extends EventBus {
        constructor(name) {
            super();
            this.name = name;
            this.channel = getChannel(name.toUpperCase());
            if (!window[name.toUpperCase()]) {
                window[name.toUpperCase()] = this.channel;
            }
            this.channel.onMessage = (hex) => {
                const buf = DataFormat.hexToBuf(hex);
                loggerBle$1.debug('[RAW] [R] type=[%s] size=[%d] data=[%s]', 'bin', buf.byteLength, hex);
                this.emit('message', { data: buf });
            };
        }
        addEventListener(type, listener) {
            this.on(type, listener);
        }
        removeEventListener(type, listener) {
            this.off(type, listener);
        }
        postMessage(message) {
            const hex = DataFormat.binToHex(message);
            loggerBle$1.debug('[RAW] [S] type=[%s] size=[%d] data=[%s]', 'bin', message.byteLength, hex);
            this.channel.postMessage(hex);
        }
    }
    class NativeRpcChannel extends EventBus {
        constructor(name) {
            super();
            this.name = name;
            this.channel = getChannel(name.toUpperCase());
            if (!window[name.toUpperCase()]) {
                window[name.toUpperCase()] = this.channel;
            }
            if (name.toUpperCase() === 'LOG') {
                this.logger = loggerLog$1;
            }
            else {
                this.logger = loggerRpc$1;
            }
            this.channel.onMessage = (data) => {
                if (typeof data === 'string') {
                    data = DataFormat.strToJson(data);
                }
                this.logger.debug('[RAW] [R] jsonrpc=[%j]', data);
                this.emit('message', { data });
            };
        }
        addEventListener(type, listener) {
            this.on(type, listener);
        }
        removeEventListener(type, listener) {
            this.off(type, listener);
        }
        postMessage(message, transfer) {
            this.logger.debug('[RAW] [S] jsonrpc=[%j]', message);
            this.channel.postMessage(DataFormat.jsonToStr(message), transfer);
        }
    }

    var MessageFlag;
    (function (MessageFlag) {
        MessageFlag[MessageFlag["App"] = 1] = "App";
    })(MessageFlag || (MessageFlag = {}));
    var MessageType;
    (function (MessageType) {
        MessageType[MessageType["Shake"] = 1] = "Shake";
        MessageType[MessageType["Close"] = 2] = "Close";
        MessageType[MessageType["Heart"] = 3] = "Heart";
        MessageType[MessageType["Data"] = 4] = "Data";
        MessageType[MessageType["DataWithSystemTool"] = 5] = "DataWithSystemTool";
        MessageType[MessageType["Log"] = 6] = "Log";
    })(MessageType || (MessageType = {}));
    var MessageVersion;
    (function (MessageVersion) {
        MessageVersion[MessageVersion["version1"] = 1] = "version1";
    })(MessageVersion || (MessageVersion = {}));

    const messageParse = compile(PROTOCOL);
    const AppId = AppId$1;
    const Pid = Pid$1;
    const loggerSchedule = HmLogger.getLogger('schedule');
    const loggerBle = HmLogger.getLogger('app-channel-ble');
    const loggerRpc = HmLogger.getLogger('app-channel-log');
    const loggerLog = LogLogger.getLogger('app-channel-log');
    const loggerWorkerCmd = HmLogger.getLogger('worker-channel-cmd');
    const loggerWorkerBle = HmLogger.getLogger('worker-channel-ble');
    const loggerWorkerRpc = HmLogger.getLogger('worker-channel-rpc');
    const loggerWorkerLog = WorkerLogger.getLogger('worker-channel-log');
    // worker 状态
    var ProcessStatus;
    (function (ProcessStatus) {
        ProcessStatus[ProcessStatus["Creating"] = 0] = "Creating";
        ProcessStatus[ProcessStatus["Success"] = 1] = "Success";
        ProcessStatus[ProcessStatus["Error"] = 2] = "Error";
        ProcessStatus[ProcessStatus["Running"] = 3] = "Running";
        ProcessStatus[ProcessStatus["Close"] = 4] = "Close";
    })(ProcessStatus || (ProcessStatus = {}));
    class Scheduling {
        constructor() {
            this.appBleChannel = new NativeBleChannel('BLE');
            this.appBleChannel.addEventListener('message', ({ data }) => __awaiter(this, void 0, void 0, function* () {
                yield this.onAppBleMessage(data);
            }));
            this.appRpcChannel = new NativeRpcChannel('RPC');
            this.appRpcModel = new ModelApi({
                parent: this.appRpcChannel,
                child: this.appRpcChannel,
                logger: loggerRpc,
                model: {
                    [CmdType.LAUNCH_SETTING_CMD]: (ctx) => {
                        const data = ctx.request;
                        const request = data;
                        const params = request.params;
                        const payload = request;
                        payload.params = {
                            appId: Number(params.appId),
                            reason: {
                                launchType: 'settingsChanged',
                                changeType: params.changeType,
                                key: params.key,
                                oldValue: params.oldValue,
                                newValue: params.newValue,
                            },
                        };
                        // 如果应用已经启动
                        const appId = Number(params.appId);
                        const process = processMgr.getByAppId(AppId(appId));
                        if (process) {
                            process.worker.postMessage(data);
                            return;
                        }
                        loggerSchedule.log('【调度层 准备设备更新启动worker】', payload);
                        this.launchProcess(payload);
                    },
                    [CmdType.LAUNCH_PEER_CMD]: (ctx) => {
                        const data = ctx.request;
                        const request = data;
                        this.launchProcess(request);
                    },
                },
            });
            this.appLogChannel = new NativeRpcChannel('LOG');
            this.appLogModel = new ModelApi({
                parent: this.appLogChannel,
                child: this.appLogChannel,
                logger: loggerLog,
                model: {
                    '*': (ctx) => {
                        loggerLog.info('from-app-log =>', ctx.request);
                    },
                },
            });
            // this.appLogModel.call(Protocol.CmdType.MAIN_LOG_CMD, {
            //   message: 'init ok',
            // })
            HmLogger.on('log', (data) => {
                this.appLogModel.call(CmdType.MAIN_LOG_CMD, data);
            });
            loggerSchedule.debug('init ok');
        }
        /**
         * 接受app的BLE通道消息
         */
        onAppBleMessage(data) {
            var _a;
            return __awaiter(this, void 0, void 0, function* () {
                const message = messageParse(data);
                loggerBle.debug('receive message => %j', message);
                if (message.flag === MessageFlag.App && message.type === MessageType.Shake) {
                    const request = new JsonRpcRequestBuilder()
                        .setId(JsonRpcId(generateUUID()))
                        .setMethod({
                        module: 'message.notification.launch',
                        action: 'peerAppLaunched',
                    })
                        .setParams({
                        appId: message.appId,
                        port1: message.port1,
                        reason: {
                            launchType: 'peerAppLaunched',
                        },
                    })
                        .build();
                    this.launchProcess(request);
                    return;
                }
                else if (message.flag === MessageFlag.App && message.type === MessageType.Close) {
                    let process;
                    if (message.port2) {
                        process = processMgr.getByPort2(Port(message.port2));
                    }
                    if (process) {
                        process.destroy();
                        processMgr.del(process.pid);
                        loggerSchedule.debug('App LifeCycle Status: Closed. ProcessInfo=appId[%d] processId[%s] devicePort[%d] sidePort[%d]', process.appId, process.pid, process.port1, process.port2);
                        return;
                    }
                }
                else if (message.flag === MessageFlag.App && message.type === MessageType.Heart) {
                    loggerSchedule.warn('heart message is not supported');
                }
                else if (message.flag === MessageFlag.App && message.type === MessageType.Data) {
                    let process;
                    if (message.port2) {
                        process = processMgr.getByPort2(Port(message.port2));
                    }
                    if (!process) {
                        loggerSchedule.warn('app not launch');
                        return;
                    }
                    (_a = process.bleChannel) === null || _a === void 0 ? void 0 : _a.port1.postMessage(data.buffer, [data.buffer]);
                }
                else if (message.flag === MessageFlag.App && message.type === MessageType.Log) {
                    this.appLogModel.call(CmdType.DEVICE_LOG_CMD, [message.payload.toString('utf-8')]);
                }
                else {
                    loggerSchedule.error('error message => %j', message);
                }
            });
        }
        /**
         * worker线程组装，检查worker状态
         */
        launchProcess(data) {
            return __awaiter(this, void 0, void 0, function* () {
                this.createWorker(data);
            });
        }
        /**
         * 查询应用代码
         */
        getAppSideServiceCode(pid) {
            return __awaiter(this, void 0, void 0, function* () {
                const process = processMgr.get(pid);
                if (!process)
                    return;
                const serviceCode = yield this.readAppSideFileFromApp(process.appId);
                const buf = DataFormat.strToBuf(serviceCode);
                return process.cmdModel.request(CmdType.SIDE_CODE_CMD, {
                    serviceCode: buf.buffer,
                }, {
                    transfer: [buf.buffer],
                });
            });
        }
        getLocalStorage(appId) {
            return __awaiter(this, void 0, void 0, function* () {
                return this.appRpcModel.request(CmdType.WORKER_LOCAL_STORAGE_GET_CMD, {
                    appId,
                });
            });
        }
        getSettingsStorage(appId) {
            return __awaiter(this, void 0, void 0, function* () {
                return this.appRpcModel.request(CmdType.WORKER_SETTINGS_STORAGE_GET_CMD, {
                    appId,
                });
            });
        }
        getUserSettings(appId) {
            return __awaiter(this, void 0, void 0, function* () {
                return this.appRpcModel.request(CmdType.USER_SETTINGS_CMD, {
                    appId,
                });
            });
        }
        initModel(name, model, eventSource, logger) {
            return __awaiter(this, void 0, void 0, function* () {
                const hmPort = new HmMessagePort(eventSource, logger);
                const modelApi = yield new PeerParent({
                    name,
                    parent: hmPort,
                    child: hmPort,
                    logger,
                    model: model,
                }).sendHandshake();
                loggerSchedule.info('%s [parent] [handshake] successful', name);
                loggerSchedule.info('init %s ok', name);
                return modelApi;
            });
        }
        /**
         * worker线程创建办法
         */
        createWorker(data) {
            return __awaiter(this, void 0, void 0, function* () {
                const params = data.params;
                const method = data.method;
                const pid = Pid(generateUUID());
                const appId = AppId(params.appId);
                const port1 = Port(params.port1);
                const port2 = Port(getIdlePort());
                const worker = new WorkerFactory({ name: pid });
                const bleChannel = new MessageChannel();
                const rpcChannel = new MessageChannel();
                const logChannel = new MessageChannel();
                bleChannel.port1.start();
                rpcChannel.port1.start();
                logChannel.port1.start();
                const cmdModel = yield this.initModel('worker-channel-cmd', {}, worker, loggerWorkerCmd);
                const localStorage = yield this.getLocalStorage(appId);
                const settingsStorage = yield this.getSettingsStorage(appId);
                const userSettings = yield this.getUserSettings(appId);
                yield cmdModel.request(CmdType.PROCESS_INFO_CMD, {
                    pid,
                    appId,
                    port1,
                    port2,
                    reason: data.params.reason,
                    localStorage,
                    settingsStorage,
                    userSettings,
                });
                yield cmdModel.request(CmdType.CHANNEL_CMD, {
                    ble: bleChannel.port2,
                    rpc: rpcChannel.port2,
                    log: logChannel.port2,
                }, { transfer: [bleChannel.port2, rpcChannel.port2, logChannel.port2] });
                const bleModel = yield this.initModel('worker-channel-ble', {}, bleChannel.port1, loggerWorkerBle);
                const rpcModel = yield this.initModel('worker-channel-rpc', {
                    '*': (ctx) => __awaiter(this, void 0, void 0, function* () {
                        yield ModelApi.forward(ctx.request, ctx.source, this.appRpcModel);
                    }),
                }, rpcChannel.port1, loggerWorkerRpc);
                const logModel = yield this.initModel('worker-channel-log', {
                    '*': (ctx) => __awaiter(this, void 0, void 0, function* () {
                        yield ModelApi.forward(ctx.request, ctx.source, this.appLogModel);
                    }),
                }, logChannel.port1, loggerWorkerLog);
                const onProcessBleMessage = (e) => {
                    // forward to app ble message
                    this.appBleChannel.postMessage(e.data);
                };
                bleChannel.port1.addEventListener('message', onProcessBleMessage);
                const destroy = () => {
                    rpcModel.destroy();
                    rpcChannel.port1.close();
                    logModel.destroy();
                    logChannel.port1.close();
                    bleChannel.port1.removeEventListener('message', onProcessBleMessage);
                    bleChannel.port1.close();
                    cmdModel.destroy();
                    worker.terminate();
                };
                const processContext = {
                    pid,
                    appId,
                    port1,
                    port2,
                    bleChannel,
                    rpcChannel,
                    logChannel,
                    cmdModel,
                    bleModel,
                    rpcModel,
                    logModel,
                    status: ProcessStatus.Creating,
                    reason: {
                        launchType: method.action,
                        params: params.reason,
                    },
                    worker,
                    destroy,
                };
                processMgr.set(pid, processContext);
                loggerSchedule.debug('App LifeCycle Status: Prepare Ok. ProcessInfo=appId[%d] processId[%s] devicePort[%d] sidePort[%d]', processContext.appId, processContext.pid, processContext.port1, processContext.port2);
                yield this.getAppSideServiceCode(pid);
                loggerSchedule.debug('App LifeCycle Status: Side-Service Running. ProcessInfo=appId[%d] processId[%s] devicePort[%d] sidePort[%d]', processContext.appId, processContext.pid, processContext.port1, processContext.port2);
            });
        }
        readAppSideFileFromApp(appId) {
            return __awaiter(this, void 0, void 0, function* () {
                const result = yield this.appRpcModel.request(CmdType.SERVICE_CODE_CMD, {
                    appId,
                });
                return result.content;
            });
        }
    }

    const logger = HmLogger.getLogger('boot');
    getGlobal().version = "1.0.7";
    getGlobal().buildDate = "2021-09-01T11:01:26.506Z";
    getGlobal().commit = "3b80ccc";
    class MainService {
        constructor() {
            this.name = 'main-service';
        }
        init() {
            this.schedule = new Scheduling();
        }
        start() {
            logger.log(`${this.name} is running`);
        }
    }
    function main() {
        return __awaiter(this, void 0, void 0, function* () {
            const mainProcess = new MainService();
            mainProcess.init();
            mainProcess.start();
        });
    }
    main();

}());
