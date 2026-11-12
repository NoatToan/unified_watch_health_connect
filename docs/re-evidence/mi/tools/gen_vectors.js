// Reference test-vector generator for Xiaomi MiWear protocol (from Mi Fitness 3.46.1 RE).
// Usage: node gen_vectors.js
const crypto = require('crypto');

const hex = (b) => Buffer.from(b).toString('hex');
const b64 = (b) => Buffer.from(b).toString('base64');
const u8 = (n) => Buffer.from([n & 0xff]);
const u16le = (n) => { const b = Buffer.alloc(2); b.writeUInt16LE(n & 0xffff); return b; };
const u32le = (n) => { const b = Buffer.alloc(4); b.writeUInt32LE(n >>> 0); return b; };
const cat = (...bs) => Buffer.concat(bs);

// ---- protobuf nano helpers ----
function varint(n) { // non-negative int
  const out = [];
  while (n > 0x7f) { out.push((n & 0x7f) | 0x80); n = Math.floor(n / 128); }
  out.push(n & 0x7f);
  return Buffer.from(out);
}
function tag(field, wire) { return varint((field << 3) | wire); }
function pbVarint(field, n) { return cat(tag(field, 0), varint(n)); }
function pbBool(field, v) { return pbVarint(field, v ? 1 : 0); }
function pbBytes(field, b) { return cat(tag(field, 2), varint(b.length), b); }
function pbString(field, s) { return pbBytes(field, Buffer.from(s, 'utf8')); }
function pbMsg(field, b) { return pbBytes(field, b); }
function pbSint32(field, n) { // zigzag
  const z = (n << 1) ^ (n >> 31);
  return cat(tag(field, 0), varint(z >>> 0));
}

// ---- CRC16/ARC (poly 0xA001 reflected, init 0), as CRCUtil.TABLE_16 ----
function crc16arc(buf) {
  let crc = 0;
  for (const byte of buf) {
    crc ^= byte;
    for (let i = 0; i < 8; i++) crc = (crc & 1) ? ((crc >>> 1) ^ 0xA001) : (crc >>> 1);
  }
  return crc & 0xffff;
}

// ---- L1 frame ----
function l1Frame(type, seq, payload, frx = 0) {
  const header = cat(
    u16le(0xA5A5),
    u8(((frx & 1) << 4) | (type & 0x0f)),
    u8(seq),
    u16le(payload.length),
    u16le(crc16arc(payload))
  );
  return cat(header, payload);
}

// ---- messages ----
// s7r envelope: field1 e, field2 f, oneof payload fields...
function s7r(e, f, payloadField, payload) {
  return cat(pbVarint(1, e), pbVarint(2, f), payloadField ? pbMsg(payloadField, payload) : Buffer.alloc(0));
}

function n64(year, month, day) { return cat(pbVarint(1, year), pbVarint(2, month), pbVarint(3, day)); }
function t64(h, m, s, ms) { return cat(pbVarint(1, h), pbVarint(2, m), pbVarint(3, s), pbVarint(4, ms)); }
function v64(off15, dst15, tzid) { return cat(pbSint32(1, off15), pbSint32(2, dst15), pbString(3, tzid)); }
function wxo(date, time, tz, is24h) {
  let b = cat(pbMsg(1, date), pbMsg(2, time), pbMsg(3, tz));
  if (is24h) b = cat(b, pbBool(4, true));
  return b;
}
function txo(field, msg) { return pbMsg(field, msg); }

const vectors = {};

// 1) GET_BIND_INFO: s7r e=1 f=17, p90 field 11 = sb0{1:false, 2:md5(userId)}
{
  const userId = '1234567890';
  const md5 = crypto.createHash('md5').update(userId, 'utf8').digest();
  const sb0 = cat(pbBool(1, false), pbBytes(2, md5)); // fields 3/4 empty/zero omitted
  const p90 = pbMsg(11, sb0);
  const packet = s7r(1, 17, 3, p90);
  const l2 = cat(u8(1), u8(1), packet); // channel 1, opcode 1 (plain), type 100
  const frame = l1Frame(3, 0, l2);
  vectors.getBindInfo = {
    userId, md5_hex: hex(md5), s7r_hex: hex(packet), l2_hex: hex(l2), l1_frame_hex: hex(frame),
    l1_crc16: crc16arc(l2), note: 'First DATA frame after L1 START; L0 splits at ATT_MTU-3.'
  };
}

// 2) TIME SYNC: s7r e=2 f=3, txo field4 = wxo; date 2026-11-12 19:30:00.250, +07:00
{
  const date = n64(2026, 11, 12);
  const time = t64(19, 30, 0, 250);
  const tz = v64(28, 0, 'Asia/Ho_Chi_Minh'); // (7h*60)/15 = 28
  const w = wxo(date, time, tz, true);
  const tx = txo(4, w);
  const packet = s7r(2, 3, 4, tx);
  vectors.timeSync = { s7r_hex: hex(packet), txo_hex: hex(tx), wxo_hex: hex(w) };
}

// 3) Battery request: s7r e=2 f=1, no payload
vectors.batteryRequest = { s7r_hex: hex(s7r(2, 1, 0, null)) };

// 4) Fitness get today IDs: s7r e=8 f=1, ur9 field10 = {field5: nu9{field1: 0}}
{
  const nu9 = pbVarint(1, 0);
  const ur9 = pbMsg(5, nu9);
  const packet = s7r(8, 1, 10, ur9);
  vectors.fitnessTodayIds = { s7r_hex: hex(packet) };
}

// 5) Fitness request single id: s7r e=8 f=4, ur9 field3 = 7-byte dataId
{
  const dataId = cat(u32le(1762950000), u8(28), u8(2), u8(0x03)); // ts, tz15, version, typeByte(dataType0,dailyType0,fileType3)
  const ur9 = pbMsg(3, dataId);
  const packet = s7r(8, 4, 10, ur9);
  vectors.fitnessRequestOne = { dataId_hex: hex(dataId), s7r_hex: hex(packet) };
}

// 5b) Fitness confirm: s7r e=8 f=5, ur9 field3 = 7-byte dataId
{
  const dataId = vectors.fitnessRequestOne.dataId_hex;
  const ur9 = pbMsg(3, Buffer.from(dataId, 'hex'));
  vectors.fitnessConfirm = { s7r_hex: hex(s7r(8, 5, 10, ur9)) };
}

// ---- crypto ----
const token = Buffer.from('000102030405060708090a0b0c0d0e0f', 'hex');
const appRandom = Buffer.from('a0a1a2a3a4a5a6a7a8a9aaabacadaeaf', 'hex');
const deviceRandom = Buffer.from('b0b1b2b3b4b5b6b7b8b9babbbcbdbebf', 'hex');
const salt = cat(appRandom, deviceRandom);
// HKDF-SHA256(salt=appRandom||deviceRandom, ikm=token, info='miwear-auth', L=64)
const okm = Buffer.from(crypto.hkdfSync('sha256', token, salt, Buffer.from('miwear-auth'), 64));
const deviceKey = okm.subarray(0, 16), appKey = okm.subarray(16, 32);
const deviceIV = okm.subarray(32, 36), appIV = okm.subarray(36, 40);
const deviceSign = crypto.createHmac('sha256', deviceKey).update(cat(deviceRandom, appRandom)).digest();
const appSign = crypto.createHmac('sha256', appKey).update(cat(appRandom, deviceRandom)).digest();
vectors.authCrypto = {
  token_hex: hex(token), appRandom_hex: hex(appRandom), deviceRandom_hex: hex(deviceRandom),
  okm64_hex: hex(okm), deviceKey_hex: hex(deviceKey), appKey_hex: hex(appKey),
  deviceIV_hex: hex(deviceIV), appIV_hex: hex(appIV),
  deviceSign_hex: hex(deviceSign), appSign_hex: hex(appSign)
};

// AES-CCM(encryptionKey=appKey, nonce=appIV||0||0, tag=4) over CompanionDevice protobuf example
// dc0: field1 int32 0; field2 float SDK 35.0; field3 string 'Pixel 9'; field4 int32 appCap 0; field5 string 'VN'
function f32(n) { const b = Buffer.alloc(4); b.writeFloatLE(n); return b; }
const dc0 = cat(pbVarint(1, 0), tag(2,5), f32(35.0), pbString(3, 'Pixel 9'), pbString(5, 'VN'));
const ccmNonce = cat(appIV, Buffer.alloc(8));
const ccm = crypto.createCipheriv('aes-128-ccm', appKey, ccmNonce, { authTagLength: 4, plaintextLength: dc0.length });
ccm.setAAD(Buffer.alloc(0), { plaintextLength: dc0.length });
const ccmCt = Buffer.concat([ccm.update(dc0), ccm.final()]);
const ccmTag = ccm.getAuthTag();
vectors.authCcm = {
  dc0_hex: hex(dc0), nonce_hex: hex(ccmNonce), key_hex: hex(appKey),
  ciphertext_hex: hex(ccmCt), tag4_hex: hex(ccmTag), ciphertext_plus_tag_hex: hex(cat(ccmCt, ccmTag)),
  note: 'Java iql.d returns CCM ciphertext||4-byte tag; t90 field2 carries this.'
};

// AES-CTR(k=IV=appKey) over the time-sync s7r protobuf (L2 opcode 2 / type 101)
{
  const plain = Buffer.from(vectors.timeSync.s7r_hex, 'hex');
  const cipher = crypto.createCipheriv('aes-128-ctr', appKey, appKey);
  const ct = Buffer.concat([cipher.update(plain), cipher.final()]);
  vectors.l2Ctr = { plaintext_s7r_hex: hex(plain), key_and_iv_hex: hex(appKey), ciphertext_hex: hex(ct) };
}

// ---- cloud signing (CloudInterceptor / x24 / c24 / g6j) ----
// g6j: stateful RC4, constructor discards 1024 keystream bytes, then values are
// encrypted sequentially in TreeMap (key-sorted) order.
class RC4State {
  constructor(key) { this.S = Array.from({length: 256}, (_, i) => i); let j = 0;
    for (let i = 0; i < 256; i++) { j = (j + this.S[i] + key[i % key.length]) & 0xff; [this.S[i], this.S[j]] = [this.S[j], this.S[i]]; }
    this.i = 0; this.j = 0; this.skip(1024); }
  skip(n) { for (let k = 0; k < n; k++) this.next(); }
  next() { this.i = (this.i + 1) & 0xff; this.j = (this.j + this.S[this.i]) & 0xff;
    [this.S[this.i], this.S[this.j]] = [this.S[this.j], this.S[this.i]];
    return this.S[(this.S[this.i] + this.S[this.j]) & 0xff]; }
  crypt(data) { const out = Buffer.alloc(data.length); for (let n = 0; n < data.length; n++) out[n] = data[n] ^ this.next(); return out; }
}
{
  const security = Buffer.alloc(32, 0x11);
  const nonceBytes = Buffer.concat([Buffer.alloc(8, 0x22), u32le(29900000)]);
  const nonce = b64(nonceBytes), securityB64 = b64(security);
  const key = b64(crypto.createHash('sha256').update(cat(security, nonceBytes)).digest());
  const keyBytes = Buffer.from(key, 'base64');
  const method = 'POST', path = '/bind/hello';
  const data = JSON.stringify({mode: 2, model: 'M2457B1', mac: 'AA:BB:CC:DD:EE:FF', phone_id: 'phone', node_id: 'node', sn: 'SN123', did: 'DID123', random_d: b64(Buffer.alloc(16, 0x33))});
  const canonical = (map) => [method.toUpperCase(), path, ...Object.keys(map).sort().map(k => `${k}=${map[k]}`), key].join('&');
  const tree = {data};
  const rc4Hash = b64(crypto.createHash('sha1').update(canonical(tree)).digest());
  tree.rc4_hash__ = rc4Hash; // inserted before encryption; TreeMap order: data, rc4_hash__
  const rc4 = new RC4State(keyBytes);
  const enc = {};
  for (const k of Object.keys(tree).sort()) enc[k] = b64(rc4.crypt(Buffer.from(tree[k], 'utf8')));
  const signature = b64(crypto.createHash('sha1').update(canonical(enc)).digest());
  vectors.cloudPost = { security_b64: securityB64, nonce_b64: nonce, key_b64: key, data_json: data,
    rc4_hash_raw_b64: rc4Hash, data_rc4_b64: enc.data, rc4_hash_encrypted_b64: enc.rc4_hash__, signature_b64: signature,
    note: 'Stateful RC4 (fresh key state, 1024-byte skip) encrypts values in sorted-key order: data then rc4_hash__. Form body uses encrypted values; signature canonical string uses them too. Response = base64(RC4(JSON)) with a fresh RC4 state (1024-byte skip).' };
}
{
  // GET example: x24.d signs "GET&key&nonce&k=v...", params sent plaintext
  const security = Buffer.alloc(32, 0x11);
  const nonceBytes = Buffer.concat([Buffer.alloc(8, 0x22), u32le(29900000)]);
  const nonce = b64(nonceBytes);
  const key = b64(crypto.createHash('sha256').update(cat(security, nonceBytes)).digest());
  const keyBytes = Buffer.from(key, 'base64');
  const method = 'GET', path = '/user/get_bindkey';
  const canonical = [method, key, nonce, 'data='].join('&');
  const signature = b64(crypto.createHmac('sha256', keyBytes).update(canonical).digest());
  vectors.cloudGet = { security_b64: b64(security), nonce_b64: nonce, key_b64: key, canonical_string: canonical, signature_b64: signature,
    note: 'getBindKey has no params: query is ?signature=<sig>&_nonce=<nonce>; empty param map canonicalizes to data=. Response = base64(RC4(JSON)).' };
}
console.log(JSON.stringify(vectors, null, 2));
