# NIClj [![endorse](https://api.coderwall.com/runexec/endorsecount.png)](https://coderwall.com/runexec)

NIClj is a Network Interface Card handler for the Clojure language

```clojure
(use 'niclj.core)

(clojure.pprint/pprint (nics))     
({:addresses     
  (#<Inet6Address /fe00:0:0:0:0000:0000:0000:0002%2> #<Inet4Address /10.0.0.102>),
  :name "wlp2s0", 
  :display-name "wlp2s0"}        
 {:addresses      
  (#<Inet6Address /0:0:0:0:0:0:0:1%1> #<Inet4Address /127.0.0.1>),            
  :name "lo",     
  :display-name "lo"})  
nil   
```
#### Install

```bash
git clone https://github.com/runexec/niclj.git
cd niclj; lein install
```

Lein deps

```clojure
[niclj/niclj "0.1.0-SNAPSHOT"]
```

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
